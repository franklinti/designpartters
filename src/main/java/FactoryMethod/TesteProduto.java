package FactoryMethod;

public class TesteProduto {
    public static void main(String[] args) {

        //modelo tracional sem FactoryMethod
        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPossuiDimensoesFisicas(true);

        ProdutoDigital produtoDigital = new ProdutoDigital();
        produtoDigital.setPossuiDimensoesFisicas(false);
    }
}
