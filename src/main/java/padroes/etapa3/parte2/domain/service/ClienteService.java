
package padroes.etapa3.parte2.domain.service;

import java.util.List;
import padroes.etapa3.parte2.domain.model.Entity;
import padroes.etapa3.parte2.domain.repository.ClienteRepository;

/**
 *
 * @author daniel korban
 */
public class ClienteService implements Service{// camada servico
    
    private final ClienteRepository clienteRepository;

    public ClienteService() {
        this.clienteRepository = new ClienteRepository();
    }
    
    @Override
    public List<Entity> listarTodos(){
        return clienteRepository.buscarTodos();
    }
    
    @Override
    public Entity recuperar(int id){
        return clienteRepository.recuperar(id);
    }
    
    @Override
    public void cadastrar(Entity entity){
        clienteRepository.cadastrar(entity);
    }
    
    @Override
    public void atualizar(Entity entity){
        clienteRepository.atualizar(entity);
    }
    
    @Override
    public void excluirPorNome(Entity entity){
        clienteRepository.excluirPorNome(entity);
    }
    
    @Override
    public void excluirPorId(int id){
        clienteRepository.excluirPorId(id);
    }
    
}