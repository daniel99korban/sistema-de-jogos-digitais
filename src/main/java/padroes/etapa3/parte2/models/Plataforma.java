
package padroes.etapa3.parte2.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel korban e Pedro Ivo
 */
public abstract class Plataforma extends Entity{//(Xbox, PS3, PS4, PC, etc.).
    
    private String nome;
    private List<JogoPlataforma> jogoPlataforma;

    protected Plataforma(Integer id) {
        super(id);
        this.jogoPlataforma = new ArrayList<>();
    }

    @Override
    public Integer getId() {
        return super.getId();
    }
    
    @Override
    public void setId(Integer id) {
        super.setId(id);
    }
    // getters e setters
    public String getNome() {
        return nome;
    }

    public JogoPlataforma getJogoPlataforma(JogoPlataforma jogoPlataforma) {
        int i = this.jogoPlataforma.indexOf(jogoPlataforma);
        return this.jogoPlataforma.get(i);
    }

    public void adicionarReferenciaJogoPlataformaEmPlataforma(JogoPlataforma jogoPlataforma) {
        this.jogoPlataforma.add(jogoPlataforma);
    }

    
    public abstract BigDecimal precoDiario();
    
    public static class Builder{
        
        private Plataforma plataforma;
        
        public Builder(Plataforma plataforma){
            this.plataforma = plataforma;
        }
        
        public Builder nome(String nome) {
            this.plataforma.nome = nome;
            return this;
        }
        
        public Plataforma build(){
            return this.plataforma;
        }
        
    }
}
