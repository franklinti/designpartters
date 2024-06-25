package Singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AgendaSingletonLAZY {

    private static AgendaSingletonLAZY INSTANCE = null;

    private Map<String, Boolean> diasDisponiveis = new HashMap<>();

    private AgendaSingletonLAZY(){
        diasDisponiveis.put("SEGUNDA",Boolean.TRUE);
        diasDisponiveis.put("TERÇA",Boolean.TRUE);
        diasDisponiveis.put("QUARTA",Boolean.TRUE);
        diasDisponiveis.put("QUINTA",Boolean.TRUE);
        diasDisponiveis.put("SEXTA",Boolean.TRUE);
        diasDisponiveis.put("SÁBADO",Boolean.TRUE);
        diasDisponiveis.put("DOMINGO",Boolean.TRUE);
    }

    public static AgendaSingletonLAZY getInstance(){
        if (Objects.isNull(INSTANCE)) {
           return INSTANCE = new AgendaSingletonLAZY();
        }
        return  INSTANCE;
    }
    public Map<String, Boolean> getDias() {
        return diasDisponiveis;
    }

    public void ocupa(String dia) {
        this.diasDisponiveis.replace(dia,Boolean.FALSE);
    }
}
