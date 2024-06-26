
package padroes.etapa3.parte2.domain.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import padroes.etapa3.parte2.domain.model.Cliente;
import padroes.etapa3.parte2.domain.model.Entity;
//import padroes.etapa3.parte2.domain.repository.conexao.Conexao;

/**
 *
 * @author daniel korban
 */
public class ClienteRepository extends Repository{
    

    @Override
    public List<Entity> buscarTodos() {
        List<Entity> clientes = new ArrayList<>();
         // Iterando sobre os elementos para obter apenas os clientes
        for (Map.Entry<Integer, Entity> registros : conexao.entrySet()) {
            if(registros.getValue() instanceof Cliente){
                clientes.add(registros.getValue());
            }
        }
        return clientes;
    }

    @Override
    public Entity recuperar(int id) {
        for(Map.Entry<Integer,Entity> registro : conexao.entrySet()) {
           if(registro.getValue() instanceof Cliente && registro.getValue().getId() == id){
               return registro.getValue();
           }
        }
        return null;
    }

    @Override
    public void cadastrar(Entity entity) {
        conexao.put(entity.getId(),entity);
    }

    @Override
    public void atualizar(Entity entity) {
        for(Map.Entry<Integer,Entity> registro : conexao.entrySet()) {
          if(registro.getValue() instanceof Cliente && registro.getValue().getId() == entity.getId()){
              conexao.put(registro.getValue().getId(), entity);
          }
        }
    }

    @Override
    public void excluirPorNome(Entity entity) {
        Cliente cliente = (Cliente) entity;
        for(Map.Entry<Integer,Entity> registro : conexao.entrySet()) {
            if(registro.getValue() instanceof Cliente){
                Cliente clienteExcluido = (Cliente) registro.getValue();
                if(clienteExcluido.getNome().equals(cliente.getNome())){
                    conexao.remove(registro);
                    break;
                }
            }
        }
    }

    @Override
    public void excluirPorId(int id) {
        for(Map.Entry<Integer,Entity> registro : conexao.entrySet()) {
            if(registro.getValue() instanceof Cliente && registro.getValue().getId() == id){
                conexao.remove(registro);
                break;
            }
        }
    }
   
}
