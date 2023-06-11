
package padroes.etapa3.parte2.models;

import java.math.BigDecimal;
import java.util.List;
import padroes.etapa3.parte2.repository.Entity;

/**
 *
 * @author danie
 */
public class Console extends Entity{
    
    private String nome;
    private BigDecimal precoPorHora;
    private List<Acessorio> acessorios;
    private List<UtilizacaoDoConsolePeloCliente> utilizacoes;

    /**
     *
     * @param acessorios
     */
    public Console(Integer id, List<Acessorio> acessorios) {
        super(id);
        this.acessorios = acessorios;
    }

    @Override
    public String toString() {
        return "Console{" + "id=" + this.getId() + ", nome=" + nome + ", precoPorHora=" + precoPorHora + ", acessorios=" + acessorios + ", utilizacoes=" + utilizacoes + '}';
    }
    
}
