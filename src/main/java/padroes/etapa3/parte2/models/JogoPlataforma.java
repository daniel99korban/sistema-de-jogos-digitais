
package padroes.etapa3.parte2.models;

import java.util.List;
/**
 *
 * @author danie
 */
public class JogoPlataforma extends Entity{
    
    private double precoDiario;
    private List<Jogo> jogos;
    private List<Plataforma> plataformas;
    private List<ItemLocacao> locacoes;

    public JogoPlataforma(Integer id) {
        super(id);
    }
    
    public double calcularPrecoDiario(){
        for(Plataforma plataforma : plataformas){
            this.precoDiario += plataforma.precoDiario().doubleValue();
        }
        return this.precoDiario;
    }

    @Override
    public String toString() {
        return "JogoPlataforma{" + "id=" + this.getId() + ", precoDiario=" + precoDiario + ", jogos=" + jogos + ", plataformas=" + plataformas + ", locacoes=" + locacoes + '}';
    }
    // step builder
    public static class Builder{
        
        private JogoPlataforma jogoPlataforma;
        
        public Builder(Integer id){
            this.jogoPlataforma = new JogoPlataforma(id);
        }
        
        public Builder jogos(List<Jogo> jogos){
            this.jogoPlataforma.jogos = jogos;
            return this;
        }
        
        public Builder plataformas(List<Plataforma> plataformas){
            this.jogoPlataforma.plataformas = plataformas;
            return this;
        }
        
        public Builder locacoes(List<ItemLocacao> locacoes){
            this.jogoPlataforma.locacoes = locacoes;
            return this;
        }
        
        public JogoPlataforma build(){
            return this.jogoPlataforma;
        }
    }
    
}
