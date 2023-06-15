
package padroes.etapa3.parte2.models;

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
            return this;
        }
        
        public Builder console(Console console){
            this.utilizacoes.console = console;
            return this;
        }

        public UtilizacaoDoConsolePeloCliente build(){
            return this.utilizacoes;
        }
        
    }
    
}
