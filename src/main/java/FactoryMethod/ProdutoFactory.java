package FactoryMethod;

public class ProdutoFactory {

    public static Produto getInstance(TipoProdutoEnum tipo) {

        switch (tipo) {
            case FISICO:
                ProdutoFisico pf = new ProdutoFisico();
                pf.setPossuiDimensoesFisicas(true);
                return pf;
            case DIGTAL:
                ProdutoDigital pd = new ProdutoDigital();
                pd.setPossuiDimensoesFisicas(false);
                return pd;
            default:
                throw  new IllegalArgumentException("Tipo produto nao existe");
        }
    }
}
