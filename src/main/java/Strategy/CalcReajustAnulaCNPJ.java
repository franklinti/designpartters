package Strategy;

import java.math.BigDecimal;

public class CalcReajustAnulaCNPJ implements  CalcReajusteAnualSoldo{
    @Override
    public void calculoReajusteAnual(Funcionario funcionario) {
        BigDecimal salario = funcionario.getSalario();
        funcionario.setSalario(salario.add(BigDecimal.valueOf(salario.multiply(new BigDecimal(0.05)).precision())));
    }
}
