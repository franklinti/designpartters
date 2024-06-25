package Proxy;

import Builder.Pessoa;

import java.time.LocalDate;

public class PessoaTesteProxy {
    public static void main(String[] args) {

        //Teste sem proxy
//        PessoaService pessoaService = new PessoaService(new PessoaRespository());
//
//        Pessoa pessoa = new Pessoa.PessoaBuilder()
//                .nome("zen")
//                .dataNascimento(LocalDate.of(2050,04,2))
//                .build();
//
//        pessoaService.save(pessoa);
//
//        Pessoa p = pessoaService.findById(1L);
//        System.out.println(p);


        //Teste Com proxy
//        PessoaService pessoaService = new PessoaService(new PessoaRepositoryProxy());
//
//        Pessoa pessoa = new Pessoa.PessoaBuilder()
//                .nome("zen")
//                .dataNascimento(LocalDate.of(2050,04,2))
//                .build();
//
//        pessoaService.save(pessoa);
//
//        Pessoa p = pessoaService.findById(1L);
//        System.out.println(p);
//
//        Pessoa pComCache = pessoaService.findById(1L);
//        System.out.println(pComCache);

        //Teste Com proxy
        PessoaService pessoaService1 = new PessoaService(new NovoPessoaRepositoryProxy());

        Pessoa pessoa1 = new Pessoa.PessoaBuilder()
                .nome("zen")
                .dataNascimento(LocalDate.of(2050,04,2))
                .build();

        pessoaService1.save(pessoa1);

        Pessoa p1 = pessoaService1.findById(1L);
        System.out.println(p1);

        Pessoa pComCache1 = pessoaService1.findById(1L);
        System.out.println(pComCache1);


    }
}
