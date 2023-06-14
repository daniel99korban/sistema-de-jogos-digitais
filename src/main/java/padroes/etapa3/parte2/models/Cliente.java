
package padroes.etapa3.parte2.models;

import java.util.List;

/**
 *
 * @author danie
 */
public class Cliente extends Entity{
    
    private String nome;
    private String email;
    private String telefone;
    private String senha;
    private List<Locacao> locacoes;
    private List<UtilizacaoDoConsolePeloCliente> utilizacoes;

    public Cliente(Integer id) {// como cliente é uma entidade ele herda o atributo Id e o metodo getId()
        super(id);
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + this.getId() + "nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", senha=" + senha + ", locacoes=" + locacoes + ", utilizacoes=" + utilizacoes + '}';
    }

    
    
}
