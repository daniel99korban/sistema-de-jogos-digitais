
package padroes.etapa3.parte2.domain.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import padroes.etapa3.parte2.domain.model.Entity;
import padroes.etapa3.parte2.domain.model.Jogo;

/**
 *
 * @author 62040614370
 */
public class JogoRepository extends Repository{  

    @Override
    public List<Entity> buscarTodos() {
        List<Entity> jogos = new ArrayList<>();
         // Iterando sobre os elementos
        for (Map.Entry<Integer,Entity> registro : conexao.entrySet()) {
            if(registro.getValue() instanceof Jogo){
                jogos.add(registro.getValue());
            }
        }
        return jogos;
    }
    
    @Override
    public Entity recuperar(int id) {
        for(Map.Entry<Integer,Entity> entry : conexao.entrySet()) {
            if(entry.getValue() instanceof Jogo && entry.getValue().getId() == id){
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public void cadastrar(Entity entity) {
        conexao.put(entity.getId(), entity);
    }

    @Override
    public void atualizar(Entity entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void excluirPorNome(Entity entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void excluirPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}
