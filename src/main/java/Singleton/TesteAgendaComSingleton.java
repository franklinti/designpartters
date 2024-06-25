package Singleton;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TesteAgendaComSingleton {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {

        //SINGLETON EAGER
//        reservaDiaEAGER("SEXTA");
//        reservaDiaEAGER("SÁBADO");

        //SINGLETON LAZY
//        reservaDiaLAZY("SÁBADO");
//        reservaDiaLAZY("DOMINGO");

        // Reflection - aqui demonstrar que o singleton tem brechas
        //para impedir esse código tem de ter umas class com ENUM
        /*  Constructor<AgendaSingletonLAZY> constructor =  AgendaSingletonLAZY.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        AgendaSingletonLAZY agenda = constructor.newInstance();
        System.out.println( agenda);*/

        //TEST REFLECTION ENUM  na versão 17 já vai ser padrão com ENUM e não permitira reflection realizar mudancas
//        Constructor<AgendaSingletonENUM> constructor =  AgendaSingletonENUM.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        AgendaSingletonENUM agenda = constructor.newInstance();
//        System.out.println( agenda);



        AgendaSingletonENUM a = AgendaSingletonENUM.INSTANCE;
        System.out.println(a.hashCode());

        AgendaSingletonENUM b = AgendaSingletonENUM.INSTANCE;
        System.out.println(b.hashCode());

        reservaDiaENUM("SÁBADO");
        reservaDiaENUM("DOMINGO");
    }

    public static void reservaDiaEAGER(String dia){
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();//uma única instancia
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
    public static void reservaDiaLAZY(String dia){
        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();//uma única instancia
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }

    public static void reservaDiaENUM(String dia){
        AgendaSingletonENUM agenda = AgendaSingletonENUM.getInstance();//uma única instancia
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
}
