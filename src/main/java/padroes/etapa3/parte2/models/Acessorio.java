
package padroes.etapa3.parte2.models;

import padroes.etapa3.parte2.repository.Entity;

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
