
package padroes.etapa3.parte2.domain.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel korban & Pedro Ivo
 */
public class Console extends Entity{
    
    private String nome;
    private BigDecimal precoPorHora;
    private List<Acessorio> acessorios;
    private List<UtilizacaoDoConsolePeloCliente> utilizacoes;

  
    public Console(Integer id) {
        super(id);
        this.acessorios = new ArrayList<>();
        this.utilizacoes = new ArrayList<>();
    }
    // getters e setters
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
    
    
    public void adicionarAcessorio(Acessorio acessorio) {
        this.acessorios.add(acessorio);
        acessorio.adicionarReferenciaConsoleEmAcessorio(this);
    }


    public List<UtilizacaoDoConsolePeloCliente> getUtilizacoes() {
        return utilizacoes;
    }

    public void setUtilizacoes(List<UtilizacaoDoConsolePeloCliente> utilizacoes) {
        this.utilizacoes = utilizacoes;
    }
    
    public void adicionarUtilizacao(UtilizacaoDoConsolePeloCliente utilizacao){
        this.utilizacoes.add(utilizacao);
        utilizacao.setConsole(this);
    }
    
    @Override
    public String toString() {
        return "Console{" + "id=" + this.getId() + ", nome=" + nome + ", precoPorHora=" + precoPorHora + ", acessorios=" + acessorios + ", utilizacoes=" + utilizacoes + '}';
    }
    
    // step builder
    public static class Builder{
        
        private Console console;
        
        public Builder nome(String nome) {
            this.console.setNome(nome);
            return this;
        }

        public Builder precoPorHora(BigDecimal precoPorHora) {
            this.console.setPrecoPorHora(precoPorHora);
            return this;
        }
        
        public Console buid(){
            return this.console;
        }
        
    }
}
