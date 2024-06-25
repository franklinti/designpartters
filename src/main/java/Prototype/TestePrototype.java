package Prototype;

public class TestePrototype {

    public static void main(String[] args) {
        //Pega um botão existente na class
        Botao registry = BotaoRegistry.getBotao("BOTAO VERMELHO");
        System.out.println(registry);

        //add fora da estrutura da class BotaoFactory um novo botão
        String key = "BOTAO PRETO";
        Botao botaoPreto = new Botao();
        botaoPreto.setCor("Azul");
        botaoPreto.setAltura(35);
        botaoPreto.setLargura(125);
        botaoPreto.setTipoBorda(TipoBordaEnum.FINA);

        BotaoRegistry.addRegistry(key, botaoPreto);
        Botao registry1 = BotaoRegistry.getBotao("BOTAO PRETO");
        System.out.println(registry1);



    }
}
