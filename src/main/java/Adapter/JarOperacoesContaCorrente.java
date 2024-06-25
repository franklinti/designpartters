package Adapter;

import java.math.BigDecimal;

public class JarOperacoesContaCorrente {

    public boolean validaSaldo(BigDecimal valor){
        System.out.println("validando o saldo...");
        return true;
    }
    public void saque(BigDecimal valor){
        System.out.println("Realizando saque...");
    }
    public void deposita(BigDecimal valor){
        System.out.println("Realizando deposito...");
    }
}
