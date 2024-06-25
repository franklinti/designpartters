package ChainOfResponsiblity;

import java.math.BigDecimal;

public class TesteCarroChainOfResposibility {

    public static void main(String[] args) {

        //Teste sem ChainOfResponsibility
//        VendaCarroService vendaCarroService = new VendaCarroService();
//
//        Carro c = new Carro();
//        c.setMarca(Marca.FIAT);
//        c.setModelo("GOL");
//        c.setPreco(new BigDecimal(90000.00));
//        BigDecimal c1 = vendaCarroService.calculaValorVenda(c);
//        System.out.println("Valor do Carro" +c.getPreco());
//        System.out.println("Valor da venda" +c1);

        //Teste Com ChainOfResponsibility
        VendaCarroServiceComChainResponsibility vendaCarroService = new VendaCarroServiceComChainResponsibility();

        Carro c = new Carro();
        c.setMarca(Marca.CHERRY);
        c.setModelo("GOL");
        c.setPreco(new BigDecimal(90000.00));
        BigDecimal c1 = vendaCarroService.calculaValorVenda(c);
        System.out.println("Valor do Carro" +c.getPreco());
        System.out.println("Valor da venda" +c1);
    }
}
