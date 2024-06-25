package Proxy;

import Builder.Pessoa;
import lombok.extern.java.Log;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

public class PessoaRepositoryProxy extends  PessoaRespository implements  ProxyPessoa{

    private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());

    //criando cache
    private Map<Long,Pessoa> cache = new HashMap<>();

    @Override
    public void save(Pessoa pessoa) {
        log.info("Iniciando chamada do metodo save...");
        super.save(pessoa);
        log.info("Finalizando chamada do metodo save...");
    }

    @Override
    public Pessoa findById(Long id) {
        log.info("Iniciando chamada do metodo findById...");
        Pessoa pessoa = null;
        long inicio = System.currentTimeMillis();
        if(Objects.nonNull(cache.get(id))){
            log.info("pegando cache");
            pessoa = cache.get(id);
        }else{
            pessoa = super.findById(id);
            cache.put(id,pessoa);
        }
        log.info("Finalizando chamada do metodo findById...");
        long fim = System.currentTimeMillis();
        log.info("Tempo gasto "+ (fim - inicio));
        return pessoa;
    }
}
