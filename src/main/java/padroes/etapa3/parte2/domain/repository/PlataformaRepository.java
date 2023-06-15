
package padroes.etapa3.parte2.domain.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import padroes.etapa3.parte2.domain.model.Entity;
import padroes.etapa3.parte2.domain.model.Plataforma;
import padroes.etapa3.parte2.domain.model.PlataformaPc;
import padroes.etapa3.parte2.domain.model.PlataformaPs4;
import padroes.etapa3.parte2.domain.model.PlataformaXbox;

/**
 *
 * @author 62040614370
 */
public class PlataformaRepository extends Repository{
    @Override
    public List<Entity> buscarTodos() {
        List<Entity> plataformas = new ArrayList<>();
         // Iterando sobre os elementos para obter apenas as plataformas
        for (Map.Entry<Integer, Entity> registros : super.conexao.entrySet()) {
            if(
                registros.getValue() instanceof PlataformaPc ||
                registros.getValue() instanceof PlataformaXbox ||
                registros.getValue()instanceof PlataformaPs4)
            {
                plataformas.add(registros.getValue());
            }
        }
        return plataformas;
    }

    @Override
    public Entity recuperar(int id) {
        for(Map.Entry<Integer,Entity> registro : super.conexao.entrySet()) {
           if(
                registro.getValue() instanceof PlataformaPc ||
                registro.getValue() instanceof PlataformaXbox ||
                registro.getValue()instanceof PlataformaPs4
               && registro.getValue().getId() == id)
           {
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
          if(
                registro.getValue() instanceof PlataformaPc ||
                registro.getValue() instanceof PlataformaXbox ||
                registro.getValue()instanceof PlataformaPs4 && 
                registro.getValue().getId() == entity.getId()
            ){
              super.conexao.put(registro.getValue().getId(), entity);
          }
        }
    }

    @Override
    public void excluirPorNome(Entity entity) {
        Plataforma plataforma = (Plataforma) entity;
        for(Map.Entry<Integer,Entity> registro : super.conexao.entrySet()) {
            if( registro.getValue() instanceof PlataformaPc ||
                registro.getValue() instanceof PlataformaXbox ||
                registro.getValue()instanceof PlataformaPs4)
            {
                Plataforma plataformaExcluida = (Plataforma) registro.getValue();
                if(plataformaExcluida.getNome().equals(plataforma.getNome())){
                    super.conexao.remove(registro);
                    break;
                }
            }
        }
    }

    @Override
    public void excluirPorId(int id) {
        for(Map.Entry<Integer,Entity> registro : super.conexao.entrySet()) {
            if(
                registro.getValue() instanceof PlataformaPc ||
                registro.getValue() instanceof PlataformaXbox ||
                registro.getValue()instanceof PlataformaPs4
                && registro.getValue().getId() == id)
            {
                super.conexao.remove(registro);
                break;
            }
        }
    }
}
