
package padroes.etapa3.parte2.repository;

/**
 *
 * @author 62040614370
 */
public interface Repository {
    public Entity recuperar(int id);
    public void cadastrar(Entity entidade);
    public void atualizar(Entity entidade);
    public void excluir(int id);
}
