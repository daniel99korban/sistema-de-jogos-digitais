
package padroes.etapa3.parte2.models;

import java.util.List;

/**
 *
 * @author danie
 */
public class Jogo extends Entity{
    
    private String titulo;
    private List<JogoPlataforma> plataformas;

    private Jogo(Integer id) {
        super(id);
    }

    @Override
    public String toString() {
        return "\nJogo{\n\t" + "id=" + this.getId() + ",\n\ttitulo=" + titulo + ",\n\tplataformas=" + plataformas + "\n}";
    }
    
    // step build
    public static class Builder{
        
        private Jogo jogo;
        
        public Builder id(Integer id){
            this.jogo = new Jogo(id);
            return this;
        }

        public Builder titulo(String titulo) {
            this.jogo.titulo = titulo;
            return this;
        }

        public Builder plataformas(List<JogoPlataforma> plataformas) {
            this.jogo.plataformas = plataformas;
            return this;
        }
        
        public Jogo build(){
            return this.jogo;
        }
        
    }

}
