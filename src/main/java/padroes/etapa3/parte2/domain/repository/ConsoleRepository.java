
package padroes.etapa3.parte2.domain.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import padroes.etapa3.parte2.domain.model.Console;
import padroes.etapa3.parte2.domain.model.Entity;

/**
 *
 * @author daniel korban
 */
public class ConsoleRepository extends Repository{

    @Override
    public List<Entity> buscarTodos() {
        List<Entity> consoles = new ArrayList<>();
         // Iterando sobre os elementos para obter apenas os clientes
        for (Map.Entry<Integer, Entity> registros : super.conexao.entrySet()) {
            if(registros.getValue() instanceof Console){
                consoles.add(registros.getValue());
            }
        }
        return consoles;
    }

    @Override
    public Entity recuperar(int id) {
        for(Map.Entry<Integer,Entity> registro : super.conexao.entrySet()) {
           if(registro.getValue() instanceof Console && registro.getValue().getId() == id){
               return registro.getValue();
           }
        }
        return null;
    }

    @Override
    public void cadastrar(Entity entity) {
        super.conexao.put(entity.getId(),entity);
    }

    @Override
    public void atualizar(Entity entity) {
        for(Map.Entry<Integer,Entity> registro : super.conexao.entrySet()) {
          if(registro.getValue() instanceof Console && registro.getValue().getId() == entity.getId()){
              super.conexao.put(registro.getValue().getId(), entity);
          }
        }
    }

    @Override
    public void excluirPorNome(Entity entity) {
        Console console = (Console) entity;
        for(Map.Entry<Integer,Entity> registro : super.conexao.entrySet()) {
            if(registro.getValue() instanceof Console){
                Console consoleExcluido = (Console) registro.getValue();
                if(consoleExcluido.getNome().equals(console.getNome())){
                    super.conexao.remove(registro);
                    break;
                }
            }
        }
    }

    @Override
    public void excluirPorId(int id) {
        for(Map.Entry<Integer,Entity> registro : super.conexao.entrySet()) {
            if(registro.getValue() instanceof Console && registro.getValue().getId() == id){
                super.conexao.remove(registro);
                break;
            }
        }
    }
    
}
