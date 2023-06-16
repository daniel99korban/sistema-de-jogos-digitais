
package padroes.etapa3.parte2.domain.repository;

import java.util.List;
import java.util.Map;
import padroes.etapa3.parte2.domain.model.Entity;
import padroes.etapa3.parte2.domain.repository.conexao.ConexaoBDSimulada;

/**
 *
 * @author daniel korban
 */
public abstract class Repository{
    
    protected Map<Integer, Entity> conexao;

    public Repository() {
        ConexaoBDSimulada conBD = ConexaoBDSimulada.getInstance();
        conexao = conBD.getConection();
    }
    
    public void exibirRegistros() {
        for (Map.Entry<Integer, Entity> registro : conexao.entrySet()) {
            System.out.println(registro.getValue());
        }
    }
    
    public abstract List<Entity> buscarTodos();
    public abstract Entity recuperar(int id);
    public abstract void cadastrar(Entity entity);
    public abstract void atualizar(Entity entity);
    public abstract void excluirPorNome(Entity entity);
    public abstract void excluirPorId(int id);
}
