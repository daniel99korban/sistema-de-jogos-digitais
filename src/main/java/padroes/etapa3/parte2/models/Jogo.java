
package padroes.etapa3.parte2.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danie
 */
public class Jogo extends Entity{
    
    private String titulo;
    private List<JogoPlataforma> jogoPlataforma;

    private Jogo(Integer id) {
        super(id);
        this.jogoPlataforma = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "\nJogo{\n\t" + "id=" + this.getId() + ",\n\ttitulo=" + titulo + "\n}";
    }
    
    public void adicionarJogoPlataforma(JogoPlataforma jogoPlataforma) {
        this.jogoPlataforma.add(jogoPlataforma);
        jogoPlataforma.adicionarJogo(this);
    }
    
    public void adicionarReferenciaJogoPlataformaEmJogo(JogoPlataforma jogoPlataforma) {
        this.jogoPlataforma.add(jogoPlataforma);
    }    
    
    // getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<JogoPlataforma> getJogoPlataforma() {
        return jogoPlataforma;
    }

    public void setJogoPlataforma(List<JogoPlataforma> jogoPlataforma) {
        this.jogoPlataforma = jogoPlataforma;
    }
    
    // getters e setters
    
    // step build
    public static class Builder{
        
        private Jogo jogo;
        
        public Builder(Integer id){
            this.jogo = new Jogo(id);
        }

        public Builder titulo(String titulo) {
            this.jogo.titulo = titulo;
            return this;
        }
        
        public Jogo build(){
            return this.jogo;
        }
        
    }

}
