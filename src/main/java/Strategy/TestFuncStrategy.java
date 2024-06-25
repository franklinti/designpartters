package Strategy;

import java.math.BigDecimal;

public class TestFuncStrategy {

    public static void main(String[] args) {

        //Calculo reajuste sem strategy
        /*Funcionario f = Funcionario.builder()
                .nome("Zen")
                .tipoContratacao(TipoContratacaoEnum.CLT)
                .salario(new BigDecimal(5000))
                .build();
        Funcionario f1 = Funcionario.builder()
                .nome("Zen")
                .tipoContratacao(TipoContratacaoEnum.CNPJ)
                .salario(new BigDecimal(15000))
                .build();

        ReajusteAnualSalario r = new ReajusteAnualSalario();
        r.calculaReajusteAnual(f);
        r.calculaReajusteAnual(f1);

        System.out.println(f);
        System.out.println(f1);*/

        //Teste Com strategy
        Funcionario f = Funcionario.builder()
                .nome("Zen")
                .tipoContratacao(TipoContratacaoEnum.CLT)
                .salario(new BigDecimal(5000))
                .build();
        Funcionario f1 = Funcionario.builder()
                .nome("Zen")
                .tipoContratacao(TipoContratacaoEnum.CNPJ)
                .salario(new BigDecimal(15000))
                .build();


        ReajusteAnualSalarioComStrategy r = new ReajusteAnualSalarioComStrategy();
        r.calculaReajusteAnual(f,new CalcReajustAnulaCLT());
        r.calculaReajusteAnual(f1,new CalcReajustAnulaCNPJ());

        System.out.println(f);
        System.out.println(f1);
    }
}
