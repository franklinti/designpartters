package Adapter;

import java.math.BigDecimal;

public class JarOperacoesContaCorrenteAdapter {

    private JarOperacoesContaCorrente jocc;

    public JarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrente jocc) {
        this.jocc = jocc;
    }

    public void saque(BigDecimal valor) {
        if (jocc.validaSaldo(valor)) {
            jocc.saque(valor);

        }else{
            throw new IllegalArgumentException("saque não permitido");
        }
    }

    public void deposita(BigDecimal valor) {
        System.out.println("Realizando deposito...");
    }
}
