
package padroes.etapa3.parte2.models;

/**
 *
 * @author danie
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
    
}
