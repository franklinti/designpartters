package FactoryMethod;

import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Setter
@ToString
public class Produto {

    private String descricao;
    private BigDecimal preco;
    private Boolean possuiDimensoesFisicas;


}
