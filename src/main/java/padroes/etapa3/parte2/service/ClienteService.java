
package padroes.etapa3.parte2.service;

import java.util.List;
import padroes.etapa3.parte2.models.Entity;
import padroes.etapa3.parte2.repository.ClienteRepository;

/**
 *
 * @author daniel korban
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
    
    public Entity recuperar(int id){
        return clienteRepository.recuperar(id);
    }
    
    public void cadastrar(Entity entity){
        clienteRepository.cadastrar(entity);
    }
    
    public void atualizar(Entity entity){
        clienteRepository.atualizar(entity);
    }
    
    public void excluirPorNome(Entity entity){
        clienteRepository.excluirPorNome(entity);
    }
    
    public void excluirPorId(int id){
        clienteRepository.excluirPorId(id);
    }
    
}