package Builder;

import java.time.LocalDate;

public class TestPessoa {

    public static void main(String[] args) {
        //Comum com construtor, obriga a passar dados em ordem
        //após obrigar class a utilizar somente builder, não pode passar dados via contrutor
//        Pessoa p = new Pessoa("zen","silva", LocalDate.of(2050,10,01));
//        System.out.println(p);

        //Com builder, não precisa passar dados em ordem
        //obrigando a user apenas builder/
        Pessoa pessoaComBuilder = new Pessoa.PessoaBuilder()
                .nome("Zen")
                .sobrenome("Silva")
                .dataNascimento(LocalDate.of(2050,01,20))
                .build();
        System.out.println(pessoaComBuilder);


    }
}
