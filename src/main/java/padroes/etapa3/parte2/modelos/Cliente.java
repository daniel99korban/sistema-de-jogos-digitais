
package padroes.etapa3.parte2.modelos;

import java.util.List;

/**
 *
 * @author danie
 */
public class Cliente {
    private Integer id;
    private String nome;
    private String email;
    private String telefone;
    private String senha;
    private List<Locacao> locacoes;
    private List<UtilizacaoDoConsolePeloCliente> utilizacoes;
}
