
package padroes.etapa3.parte2.models;

import java.math.BigDecimal;
import java.util.List;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(BigDecimal precoPorHora) {
        this.precoPorHora = precoPorHora;
    }

    public List<Acessorio> getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(List<Acessorio> acessorios) {
        this.acessorios = acessorios;
    }

    public List<UtilizacaoDoConsolePeloCliente> getUtilizacoes() {
        return utilizacoes;
    }

    public void setUtilizacoes(List<UtilizacaoDoConsolePeloCliente> utilizacoes) {
        this.utilizacoes = utilizacoes;
    }
    
    @Override
    public String toString() {
        return "Console{" + "id=" + this.getId() + ", nome=" + nome + ", precoPorHora=" + precoPorHora + ", acessorios=" + acessorios + ", utilizacoes=" + utilizacoes + '}';
    }
    
    // step builder
    
}
