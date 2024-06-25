package Adapter;

import java.math.BigDecimal;

public class TesteOCCAdapter {

    public static void main(String[] args) {

        // Teste sem Adapter
      /*  JarOperacoesContaCorrente jarC = new JarOperacoesContaCorrente();

        ClientJarOperacoesContaCorrente client = new ClientJarOperacoesContaCorrente(jarC);

        BigDecimal valor = new BigDecimal(1000);

        if (client.validaSaldo(valor)) {
            client.saque(valor);
        }
        client.deposita(new BigDecimal(500));*/

        // Teste com Adapter

        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
        JarOperacoesContaCorrenteAdapter jarC = new JarOperacoesContaCorrenteAdapter(jarConta);

        ClientJarOperacoesContaCorrenteAdapter client = new ClientJarOperacoesContaCorrenteAdapter(jarC);

        BigDecimal valor = new BigDecimal(1000);

        client.saque(valor);
        client.deposita(new BigDecimal(500));


    }

}
