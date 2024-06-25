package Proxy;

import Builder.Pessoa;

import java.util.HashMap;
import java.util.Map;
//simulando comportamento BD 1
public class PessoaRespository {

    private Map<Long, Pessoa> banco = new HashMap<>();
    private static Long countId = 1l;

    public void save(Pessoa pessoa){
        banco.put(countId++,pessoa);
    }
    public Pessoa findById(Long id){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        return banco.get(id);
    }
}
