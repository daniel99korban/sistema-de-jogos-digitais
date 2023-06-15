
package padroes.etapa3.parte2.models;

import java.util.ArrayList;
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
        this.jogos = new ArrayList<>();
        this.plataformas = new ArrayList<>();
        this.locacoes = new ArrayList<>();
    }
    
    public double calcularPrecoDiario(){
        for(Plataforma plataforma : plataformas){
            this.precoDiario += plataforma.precoDiario().doubleValue();
        }
        return this.precoDiario;
    }

    public double getPrecoDiario() {
        return precoDiario;
    }

    public List<Jogo> getJogos() {
        return jogos;
    }

    public List<Plataforma> getPlataformas() {
        return plataformas;
    }

    public List<ItemLocacao> getLocacoes() {
        return locacoes;
    }

    public void adicionarPlataforma(Plataforma plataforma){
        this.plataformas.add(plataforma);
        plataforma.adicionarReferenciaJogoPlataformaEmPlataforma(this);
    }
    
    public void adicionarJogo(Jogo jogo){
        this.jogos.add(jogo);
        jogo.adicionarReferenciaJogoPlataformaEmJogo(this);
    }
    
    @Override
    public String toString() {
        return "JogoPlataforma{" + "id=" + this.getId() + ", precoDiario=" + precoDiario + ", jogos=" + jogos + ", plataformas=" + plataformas + ", locacoes=" + locacoes + '}';
    }
    
}
