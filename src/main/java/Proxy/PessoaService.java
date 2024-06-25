package Proxy;

import Builder.Pessoa;

import java.io.Serializable;

//simulando comportamento BD 2
public class PessoaService {

    //composição class sem proxy
    // private PessoaRespository pessoaRespository;
    //para utilizar proxy, tem de usar class PessoaRepositoyProxy
    //private PessoaRepositoryProxy pessoaRespositoryProxy;
    //utilizando ProxyPessoa - assim consigo passar outro tipo de proxy utilizando polimorfismo
    private ProxyPessoa proxyPessoa;

    //injeção de objeto
    //class sem ProxyPessoa, aqui consigo enviar um único tipo de objeto
//    public PessoaService(PessoaRepositoryProxy pessoaRespository){
//        this.pessoaRespositoryProxy = pessoaRespository;
//    }
//
//    public void save (Pessoa pessoa){
//        pessoaRespositoryProxy.save(pessoa);
//    }
//    public Pessoa findById(Long id){
//        return pessoaRespositoryProxy.findById(id);
//    }

    // com a interface proxypessoa, consigo enviar mais de um tipo de objeto proxy
    public PessoaService(ProxyPessoa proxyPessoa) {
        this.proxyPessoa = proxyPessoa;
    }

    public void save(Pessoa pessoa) {
        proxyPessoa.save(pessoa);
    }

    public Pessoa findById(Long id) {
        return proxyPessoa.findById(id);
    }

}
