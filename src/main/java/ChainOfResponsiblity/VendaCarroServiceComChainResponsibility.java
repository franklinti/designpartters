package ChainOfResponsiblity;

import java.math.BigDecimal;

public class VendaCarroServiceComChainResponsibility {

    public BigDecimal calculaValorVenda(Carro carro) {
        DescontoCarroFiat descontoCarroFiat = new DescontoCarroFiat(new DescontoCarroCherry(
                new SemDesconto(null)
        ));
        return descontoCarroFiat.aplicaDesconto(carro);
    }
}
