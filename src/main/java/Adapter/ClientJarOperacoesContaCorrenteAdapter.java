package Adapter;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ClientJarOperacoesContaCorrenteAdapter {

    private JarOperacoesContaCorrenteAdapter joccComAdapter;

    public ClientJarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrenteAdapter jocc){
        this.joccComAdapter = jocc;
    }

    public void saque(BigDecimal valor){
        joccComAdapter.saque(valor);
    }
    public void deposita(BigDecimal valor){
        joccComAdapter.deposita(valor);
    }
}
