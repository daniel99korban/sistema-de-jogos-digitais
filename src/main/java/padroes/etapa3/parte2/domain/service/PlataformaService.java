
package padroes.etapa3.parte2.domain.service;

import java.util.List;
import padroes.etapa3.parte2.domain.model.Entity;
import padroes.etapa3.parte2.domain.repository.PlataformaRepository;

/**
 *
 * @author 62040614370
 */
public class PlataformaService implements Service{
    
    private final PlataformaRepository plataformaRepository;

    public PlataformaService() {
        this.plataformaRepository = new PlataformaRepository();
    }
    
    @Override
    public List<Entity> listarTodos(){
       return plataformaRepository.buscarTodos();
    }
    
    @Override
    public Entity recuperar(int id){
        return plataformaRepository.recuperar(id);
    }
    
    @Override
    public void cadastrar(Entity entity){
        plataformaRepository.cadastrar(entity);
    }
    
    @Override
    public void atualizar(Entity entity){
        plataformaRepository.atualizar(entity);
    }
    
    @Override
    public void excluirPorNome(Entity entity){
        plataformaRepository.excluirPorNome(entity);
    }
    
    @Override
    public void excluirPorId(int id){
        plataformaRepository.excluirPorId(id);
    }
}
