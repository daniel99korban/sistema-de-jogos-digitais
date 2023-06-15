
package padroes.etapa3.parte2.domain.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import padroes.etapa3.parte2.domain.model.Entity;
import padroes.etapa3.parte2.domain.model.Locacao;

/**
 *
 * @author 62040614370
 */
public class LocacaoRepository extends Repository{

    @Override
    public List<Entity> buscarTodos() {
        List<Entity> locacoes = new ArrayList<>();
         // Iterando sobre os elementos para obter apenas os clientes
        for (Map.Entry<Integer, Entity> registro : super.conexao.entrySet()) {
            if(registro.getValue() instanceof Locacao){
                locacoes.add(registro.getValue());
            }
        }
        return locacoes;
    }

    @Override
    public Entity recuperar(int id) {
        for(Map.Entry<Integer,Entity> registro : super.conexao.entrySet()) {
           if(registro.getValue() instanceof Locacao && registro.getValue().getId() == id){
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
          if(registro.getValue() instanceof Locacao && registro.getValue().getId() == entity.getId()){
              super.conexao.put(registro.getValue().getId(), entity);
          }
        }
    }

   

    @Override
    public void excluirPorId(int id) {
        for(Map.Entry<Integer,Entity> registro : super.conexao.entrySet()) {
            if(registro.getValue() instanceof Locacao && registro.getValue().getId() == id){
                super.conexao.remove(registro);
                break;
            }
        }
    }

    @Override
    public void excluirPorNome(Entity entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
