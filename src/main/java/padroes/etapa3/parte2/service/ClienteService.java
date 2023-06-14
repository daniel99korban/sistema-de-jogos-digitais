
package padroes.etapa3.parte2.service;

import java.util.List;
import padroes.etapa3.parte2.models.Cliente;
import padroes.etapa3.parte2.models.Entity;
import padroes.etapa3.parte2.repository.ClienteRepository;

/**
 *
 * @author danie
 */
public class ClienteService {// camada servico
    
    private final ClienteRepository clienteRepository;
    // injeção
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    
    public List<Entity> listarTodos(){
        return clienteRepository.buscarTodos();
    }
    
}