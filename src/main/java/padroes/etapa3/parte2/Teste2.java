package padroes.etapa3.parte2;


import padroes.etapa3.parte2.domain.model.Cliente;
import padroes.etapa3.parte2.domain.model.Entity;
import padroes.etapa3.parte2.domain.service.*;


/**
 *
 * @author daniel korban & Pedro Ivo
 */
public class Teste2 {
    public static void main(String[] args) {
        // serviços
        ClienteService clienteService = new ClienteService();
        LocacaoService LocacaoService = new LocacaoService();
        JogoService jogoService = new JogoService();
        // entidade
        Entity entidade = null;
        
        entidade = new Cliente.Builder(1)
            .nome("Daniel")
            .email("daniel@gmail.com")
            .telefone("9999-9999")
            .senha("123admin")
            .build();
        clienteService.cadastrar(entidade);
        
    }
}
