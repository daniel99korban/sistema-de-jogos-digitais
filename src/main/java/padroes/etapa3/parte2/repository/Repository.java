
package padroes.etapa3.parte2.repository;

import java.util.List;
import java.util.Map;
import padroes.etapa3.parte2.models.Entity;
import padroes.etapa3.parte2.repository.conexao.ConexaoBDSimulada;

/**
 *
 * @author daniel korban
 */
public abstract class Repository{
    
    protected Map<Integer,Entity> conexao = ConexaoBDSimulada.getConection();
    
    public abstract List<Entity> buscarTodos();
    public abstract Entity recuperar(int id);
    public abstract void cadastrar(Entity entity);
    public abstract void atualizar(Entity entity);
    public abstract void excluirPorNome(Entity entity);
    public abstract void excluirPorId(int id);
}
