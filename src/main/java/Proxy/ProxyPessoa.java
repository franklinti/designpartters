package Proxy;

import Builder.Pessoa;

public interface ProxyPessoa {

    void save(Pessoa pessoa);

    Pessoa findById(Long id);
}
