
package padroes.etapa3.parte2.domain.service;

import java.util.List;
import padroes.etapa3.parte2.domain.model.Entity;
import padroes.etapa3.parte2.domain.repository.JogoRepository;

/**
 *
 * @author daniel korban e pedro Ivo
 */
public class JogoService implements Service{
    
    private final JogoRepository jogoRepository;

    public JogoService() {
        this.jogoRepository = new JogoRepository();
    }
    
    @Override
    public List<Entity> listarTodos(){
        return jogoRepository.buscarTodos();
    }
    
    @Override
    public Entity recuperar(int id){
        return jogoRepository.recuperar(id);
    }
    
    @Override
    public void cadastrar(Entity entity){
        jogoRepository.cadastrar(entity);
    }
    
    @Override
    public void atualizar(Entity entity){
        jogoRepository.atualizar(entity);
    }
    
    @Override
    public void excluirPorNome(Entity entity){
        jogoRepository.excluirPorNome(entity);
    }
    
    @Override
    public void excluirPorId(int id){
        jogoRepository.excluirPorId(id);
    }
}
