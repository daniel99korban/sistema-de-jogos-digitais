
package padroes.etapa3.parte2.modelos;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author danie
 */
public class Console {
    private Integer id;
    private String nome;
    private BigDecimal precoPorHora;
    private List<Acessorio> acessorios;
    private List<UtilizacaoDoConsolePeloCliente> utilizacoes;

    public Console(List<Acessorio> acessorios) {
        this.acessorios = acessorios;
    }
    
}
