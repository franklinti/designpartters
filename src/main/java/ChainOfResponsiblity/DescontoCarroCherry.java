package ChainOfResponsiblity;

import java.math.BigDecimal;

public class DescontoCarroCherry extends DescontoCarro {

    public DescontoCarroCherry(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();
        if (Marca.CHERRY.equals(carro.getMarca())) {
            return  valorVenda.subtract(new BigDecimal(1000));
        }
        return  proximoDesconto.aplicaDesconto(carro);
    }
}
