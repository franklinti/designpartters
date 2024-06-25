package Builder;

public class TesteAnimal {

    public static void main(String[] args) {
        Animal a =  Animal.builder().nome("caramelo").cor("amarelo").raca("vira-lata").build();
        System.out.println(a);
    }

}
