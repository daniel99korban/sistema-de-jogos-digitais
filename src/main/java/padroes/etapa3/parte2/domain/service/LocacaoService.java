
package padroes.etapa3.parte2.domain.service;

import java.util.List;
import padroes.etapa3.parte2.domain.model.Entity;
import padroes.etapa3.parte2.domain.repository.LocacaoRepository;

/**
 *
 * @author daniel korban
 */
public class LocacaoService implements Service{
    
    private final LocacaoRepository locacaoRepository;

    public LocacaoService() {
        this.locacaoRepository = new LocacaoRepository();
    }
    
    @Override
    public List<Entity> listarTodos(){
       return locacaoRepository.buscarTodos();
    }
    
    @Override
    public Entity recuperar(int id){
        return locacaoRepository.recuperar(id);
    }
    
    @Override
    public void cadastrar(Entity entity){
        locacaoRepository.cadastrar(entity);
    }
    
    @Override
    public void atualizar(Entity entity){
        locacaoRepository.atualizar(entity);
    }
    
    @Override
    public void excluirPorNome(Entity entity){
        locacaoRepository.excluirPorNome(entity);
    }
    
    @Override
    public void excluirPorId(int id){
        locacaoRepository.excluirPorId(id);
    }
    
}
