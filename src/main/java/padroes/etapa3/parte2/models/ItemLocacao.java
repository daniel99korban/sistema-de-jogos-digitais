
package padroes.etapa3.parte2.models;

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
    
}
