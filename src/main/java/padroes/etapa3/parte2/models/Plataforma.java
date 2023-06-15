
package padroes.etapa3.parte2.models;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author danie
 */
public abstract class Plataforma extends Entity{//(Xbox, PS3, PS4, PC, etc.).
    
    private String nome;
    private List<JogoPlataforma> jogos;

    protected Plataforma(Integer id) {
        super(id);
    }

    @Override
    public Integer getId() {
        return super.getId();
    }
    
    @Override
    public void setId(Integer id) {
        super.setId(id);
    }
    // getters
    public String getNome() {
        return nome;
    }

    public List<JogoPlataforma> getJogos() {
        return jogos;
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
        
        public Builder jogos(List<JogoPlataforma> jogos) {
            this.plataforma.jogos = jogos;
            return this;
        }
        
        public Plataforma build(){
            return this.plataforma;
        }
        
    }
}
