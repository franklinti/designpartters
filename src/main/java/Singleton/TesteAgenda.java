package Singleton;

public class TesteAgenda {

    public static void main(String[] args) {

        reservaDia("SEXTA");
        reservaDia("SÁBADO");
    }

    public static void reservaDia(String dia){
        Agenda agenda = new Agenda(); //Dessa forma não tenho um única instancia
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
}
