
package padroes.etapa3.parte2.domain.model;

/**
 *
 * @author daniel korban & pedro Ivo
 */
public class Acessorio extends Entity{
    
    private String nome;
    private Console console;

    public Acessorio(Integer id) {
        super(id);
    }

    @Override
    public String toString() {
        return "Acessorio{" + "id=" + this.getId() + ", nome=" + nome + ", console=" + console + '}';
    }
    
    public void adicionarReferenciaConsoleEmAcessorio(Console console){
        this.console = console;
    }
    
}
