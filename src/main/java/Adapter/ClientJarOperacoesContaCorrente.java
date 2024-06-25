package Adapter;

import lombok.Builder;
import lombok.Data;
import lombok.Setter;

import java.math.BigDecimal;

@Data
public class ClientJarOperacoesContaCorrente {

    private JarOperacoesContaCorrente jocc;

    public ClientJarOperacoesContaCorrente(JarOperacoesContaCorrente jocc){
        this.jocc = jocc;
    }

    public boolean validaSaldo(BigDecimal valor){
        return jocc.validaSaldo(valor);
    }
    public void saque(BigDecimal valor){
         jocc.saque(valor);
    }
    public void deposita(BigDecimal valor){
         jocc.deposita(valor);
    }
}
