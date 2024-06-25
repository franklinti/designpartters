package Strategy;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
@Builder
public class Funcionario {

    private String nome;
    private BigDecimal salario;

    private TipoContratacaoEnum tipoContratacao;

}
