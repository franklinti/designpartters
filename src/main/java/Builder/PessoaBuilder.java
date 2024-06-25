package Builder;

import java.time.LocalDate;

public class PessoaBuilder {

    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;

    public PessoaBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public PessoaBuilder sobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
        return this;
    }

    public PessoaBuilder dataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }
    // não funciona mais, obriguei class a usar somente builder
//    public Pessoa criaPessoa(){
//        return new Pessoa(nome,sobrenome,dataNascimento);
//    }
}
