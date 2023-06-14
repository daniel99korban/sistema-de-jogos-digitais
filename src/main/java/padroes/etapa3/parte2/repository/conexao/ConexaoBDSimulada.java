
package padroes.etapa3.parte2.repository.conexao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import padroes.etapa3.parte2.models.Entity;

/**
 *
 * @author daniel
 * @param <T>
 */
public class ConexaoBDSimulada {// padrão singleton
    
    protected static Map<Entity, Integer> conexao;

    private ConexaoBDSimulada() {}
    
    public static Map<Entity, Integer> getConection() {
        if(ConexaoBDSimulada.conexao == null) {
            ConexaoBDSimulada.conexao = new HashMap<>();
        }
        System.out.println("Conexão estabelecida com sucesso!");
        return ConexaoBDSimulada.conexao;
    }
    
}
