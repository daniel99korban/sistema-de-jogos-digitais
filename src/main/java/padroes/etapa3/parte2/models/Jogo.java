
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<JogoPlataforma> getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(List<JogoPlataforma> plataformas) {
        this.plataformas = plataformas;
    }

    @Override
    public String toString() {
        return "\nJogo{\n\t" + "id=" + this.getId() + ",\n\ttitulo=" + titulo + ",\n\tplataformas=" + plataformas + "\n}";
    }
    
}
