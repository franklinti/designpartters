package Prototype;

import java.util.HashMap;
import java.util.Map;

public class BotaoRegistry {

    private static Map<String,Botao> REGISTRY = new HashMap<>();

    static {
        BotaoAzul botaoAzul = new BotaoAzul();
        botaoAzul.setCor("Azul");
        botaoAzul.setAltura(35);
        botaoAzul.setLargura(125);
        botaoAzul.setTipoBorda(TipoBordaEnum.TRACEJADA);
        BotaoVermelho botaoVermelho = new BotaoVermelho();
        botaoVermelho.setCor("VERMELHO");
        botaoVermelho.setAltura(35);
        botaoVermelho.setLargura(125);
        botaoVermelho.setTipoBorda(TipoBordaEnum.TRACEJADA);

        REGISTRY.put("BOTAO AZUL", botaoAzul);
        REGISTRY.put("BOTAO VERMELHO", botaoVermelho);
    }

    public static Botao getBotao(String key){
        return BotaoFactory.getInstance(REGISTRY.get(key));
    }

    //adicionar um button na estrutura map static de botões dinamicamente
    public static void addRegistry(String key, Botao botao) {
        REGISTRY.put(key,botao);
    }
}
