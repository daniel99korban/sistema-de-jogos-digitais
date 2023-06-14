
package padroes.etapa3.parte2.models;

import java.util.List;

/**
 *
 * @author danie
 */
public class Jogo extends Entity{
    
    private String titulo;
    private List<JogoPlataforma> plataformas;

    public Jogo(String titulo, List<JogoPlataforma> plataformas, Integer id) {
        super(id);
        this.titulo = titulo;
        this.plataformas = plataformas;
    }
    
    
//    public Jogo(Integer id) {
//        super(id);
//    }

    @Override
    public String toString() {
        return "\nJogo{\n\t" + "id=" + this.getId() + ",\n\ttitulo=" + titulo + ",\n\tplataformas=" + plataformas + "\n}";
    }
    
}
