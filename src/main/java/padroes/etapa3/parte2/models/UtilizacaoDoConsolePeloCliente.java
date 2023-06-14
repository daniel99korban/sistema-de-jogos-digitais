
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
    
}
