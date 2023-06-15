
package padroes.etapa3.parte2.domain.model;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author danie
 */
public class Locacao extends Entity{
    
    private LocalDate data;
    private List<ItemLocacao> itens;
    private Cliente cliente;

    public Locacao(Integer id) {
        super(id);
    }

    @Override
    public String toString() {
        return "Locacao{" + "id=" + this.getId() + ", data=" + data + ", itens=" + itens + ", cliente=" + cliente + '}';
    }
    
    //getters e setters
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void adicionarItem(ItemLocacao itemLocacao){
        this.itens.add(itemLocacao);
        itemLocacao.adicionarReferenciaLocacaoEmItemLocacao(this);
    }
    
    public void adicionarReferenciaItemLocacaoEmLocacao(ItemLocacao itemLocacao){
        this.itens.add(itemLocacao);
    }
    
}
