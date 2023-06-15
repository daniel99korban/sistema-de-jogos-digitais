
import padroes.etapa3.parte2.domain.model.Cliente;
import padroes.etapa3.parte2.domain.model.Entity;
import padroes.etapa3.parte2.domain.service.ClienteService;


/**
 *
 * @author daniel korban & Pedro Ivo
 */
public class Teste2 {
    public static void main(String[] args) {
        // serviços
        ClienteService clienteService = new ClienteService();
        
        Entity cliente1 = new Cliente.Builder(1)
            .nome("Daniel")
            .email("daniel@gmail.com")
            .telefone("9999-9999")
            .senha("123admin")
            .build();
        
        clienteService.cadastrar(cliente1);
    }
}
