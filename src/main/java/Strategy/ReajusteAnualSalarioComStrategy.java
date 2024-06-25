package Strategy;

import java.math.BigDecimal;

public class ReajusteAnualSalarioComStrategy {

    public void calculaReajusteAnual(Funcionario funcionario,CalcReajusteAnualSoldo calcReajusteAnualSoldo){
        calcReajusteAnualSoldo.calculoReajusteAnual(funcionario);
    }

}
