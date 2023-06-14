
package padroes.etapa3.parte2.models;

import java.util.List;

/**
 *
 * @author danie
 */
public class Jogo extends Entity{
    
    private String titulo;
    private List<JogoPlataforma> plataformas;

    public Jogo(Integer id) {
        super(id);
    }

    @Override
    public String toString() {
        return "Jogo{" + "id=" + this.getId() + ", titulo=" + titulo + ", plataformas=" + plataformas + '}';
    }
    
}
