
package padroes.etapa3.parte2.domain.service;

import java.util.List;
import padroes.etapa3.parte2.domain.model.Entity;

/**
 *
 * @author danie
 */
public interface Service {
    public List<Entity> listarTodos();
    public Entity recuperar(int id);
    public void cadastrar(Entity entity);
    public void atualizar(Entity entity);
    public void excluirPorNome(Entity entity);
    public void excluirPorId(int id);
}
