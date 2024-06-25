package Singleton;

import java.util.HashMap;
import java.util.Map;

public class AgendaSingletonEAGER {

    private static final AgendaSingletonEAGER INSTANCE = new AgendaSingletonEAGER();

    private Map<String, Boolean> diasDisponiveis = new HashMap<>();

    private AgendaSingletonEAGER(){
        diasDisponiveis.put("SEGUNDA",Boolean.TRUE);
        diasDisponiveis.put("TERÇA",Boolean.TRUE);
        diasDisponiveis.put("QUARTA",Boolean.TRUE);
        diasDisponiveis.put("QUINTA",Boolean.TRUE);
        diasDisponiveis.put("SEXTA",Boolean.TRUE);
        diasDisponiveis.put("SÁBADO",Boolean.TRUE);
        diasDisponiveis.put("DOMINGO",Boolean.TRUE);
    }

    public static AgendaSingletonEAGER getInstance(){
        return  INSTANCE;
    }
    public Map<String, Boolean> getDias() {
        return diasDisponiveis;
    }

    public void ocupa(String dia) {
        this.diasDisponiveis.replace(dia,Boolean.FALSE);
    }
}
