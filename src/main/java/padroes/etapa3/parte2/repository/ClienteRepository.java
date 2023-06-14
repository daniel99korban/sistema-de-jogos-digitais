
package padroes.etapa3.parte2.repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import padroes.etapa3.parte2.models.Cliente;
import padroes.etapa3.parte2.models.Entity;

/**
 *
 * @author 62040614370
 */
public class ClienteRepository extends Repository{

    @Override
    public List<Entity> buscarTodos() {
        List<Entity> clientes = null;
         // Iterando sobre os elementos
        for (Map.Entry<Entity, Integer> entry : super.conexao.entrySet()) {
            if(entry.getKey() instanceof Cliente){
                clientes.add(entry.getKey());
            }
        }
        return clientes;
    }

    @Override
    public Optional<Entity> recuperar(int id) {
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Entity> cadastrar(Entity entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
