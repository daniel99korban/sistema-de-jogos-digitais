
package padroes.etapa3.parte2.service;

import java.util.List;
import padroes.etapa3.parte2.domain.model.Entity;
import padroes.etapa3.parte2.domain.repository.LocacaoRepository;

/**
 *
 * @author daniel korban
 */
public class LocacaoService {
    
    private final LocacaoRepository locacaoRepository;

    public LocacaoService(LocacaoRepository LocacaoRepository) {
        this.locacaoRepository = LocacaoRepository;
    }
    
    public List<Entity> listarTodos(){
       return locacaoRepository.buscarTodos();
    }
    
    public Entity recuperar(int id){
        return locacaoRepository.recuperar(id);
    }
    
    public void cadastrar(Entity entity){
        locacaoRepository.cadastrar(entity);
    }
    
    public void atualizar(Entity entity){
        locacaoRepository.atualizar(entity);
    }
    
    public void excluirPorNome(Entity entity){
        locacaoRepository.excluirPorNome(entity);
    }
    
    public void excluirPorId(int id){
        locacaoRepository.excluirPorId(id);
    }
    
}
