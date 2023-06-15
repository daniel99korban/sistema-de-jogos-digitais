
package padroes.etapa3.parte2.domain.model;

import java.time.LocalDateTime;

/**
 *
 * @author danie
 */
public class UtilizacaoDoConsolePeloCliente extends Entity{
    
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private Cliente cliente;
    private Console console;

    public UtilizacaoDoConsolePeloCliente(Integer id) {
        super(id);
    }

    @Override
    public String toString() {
        return "UtilizacaoDoConsolePeloCliente{" + "id=" + super.getId() + ", inicio=" + inicio + ", fim=" + fim + ", cliente=" + cliente + ", console=" + console + '}';
    }
    
    //getters e setters

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setConsole(Console console) {
        this.console = console;
    }
    
    public abstract class Builder{
        
        private UtilizacaoDoConsolePeloCliente utilizacoes;
        
        public Builder(Integer id){
            this.utilizacoes = new UtilizacaoDoConsolePeloCliente(id);
        }
        
        public Builder dataInicio(LocalDateTime data){
            this.utilizacoes.inicio = data;
            return this;
        }
        
        public Builder dataFim(LocalDateTime data){
            this.utilizacoes.fim = data;
            return this;
        }
        
        public Builder cliente(Cliente cliente){
            this.utilizacoes.cliente = cliente;
            cliente.adicionarUtilizacao(utilizacoes);
            return this;
        }
        
        public Builder console(Console console){
            this.utilizacoes.console = console;
            console.adicionarUtilizacao(utilizacoes);
            return this;
        }

        public UtilizacaoDoConsolePeloCliente build(){
            return this.utilizacoes;
        }
        
    }
    
}
