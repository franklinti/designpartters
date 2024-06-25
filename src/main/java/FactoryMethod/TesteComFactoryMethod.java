package FactoryMethod;

public class TesteComFactoryMethod {
    public static void main(String[] args) {

        Produto pd = ProdutoFactory.getInstance(TipoProdutoEnum.DIGTAL);
        Produto pf =  ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);

        System.out.println(pd);
        System.out.println(pf);
    }
}
