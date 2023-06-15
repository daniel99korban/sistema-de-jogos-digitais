
package padroes.etapa3.parte2.domain.model;

import java.util.List;

/**
 *
 * @author danie
 */
public class ItemLocacao extends Entity{
    
    private Integer dias;
    private Integer quantidade;
    private List<JogoPlataforma> jogosEPlataformas;
    private List<Locacao> locacoes;

    public ItemLocacao(Integer id) {
        super(id);
    }

    @Override
    public String toString() {
        return "ItemLocacao{" + "id=" + this.getId() + "dias=" + dias + ", quantidade=" + quantidade + ", jogosEPlataformas=" + jogosEPlataformas + ", locacoes=" + locacoes + '}';
    }
    
    public void adicionarLocacao(Locacao locacao){
        this.locacoes.add(locacao);
        locacao.adicionarReferenciaItemLocacaoEmLocacao(this);
    }
    
    public void adicionarReferenciaLocacaoEmItemLocacao(Locacao locacao){
        this.locacoes.add(locacao);
    }
    
    public void adicionarJogoPlataforma(JogoPlataforma jogoPlataforma){
        this.jogosEPlataformas.add(jogoPlataforma);
        jogoPlataforma.adicionarReferenciaItemLocacaoEmJogoPlataforma(this);
    }
    
    public void adicionarReferenciaJogoPlataformaEmItemLocacao(JogoPlataforma jogoPlataforma){
        this.jogosEPlataformas.add(jogoPlataforma);
    }
    
}
