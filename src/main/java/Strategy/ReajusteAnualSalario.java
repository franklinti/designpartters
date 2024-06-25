package Strategy;

import java.math.BigDecimal;

public class ReajusteAnualSalario {

    public void calculaReajusteAnual(Funcionario funcionario){

        if (TipoContratacaoEnum.CLT.name().equals(funcionario.getTipoContratacao().name())) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(BigDecimal.valueOf(salario.multiply(new BigDecimal(0.10)).precision())));
        }
        if (TipoContratacaoEnum.CNPJ.name().equals(funcionario.getTipoContratacao().name())) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(BigDecimal.valueOf(salario.multiply(new BigDecimal(0.05)).precision())));
        }

    }

}
