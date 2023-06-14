
package padroes.etapa3.parte2.repository.conexao;

import java.util.HashMap;
import java.util.Map;
import padroes.etapa3.parte2.models.Entity;

/**
 *
 * @author daniel
 */
public class ConexaoBDSimulada {// padrão singleton
    
    protected static Map<Integer,Entity> conexao;

    private ConexaoBDSimulada() {}
    
    public static Map<Integer,Entity> getConection() {
        if(ConexaoBDSimulada.conexao == null) {
            System.out.println("Conexão estabelecida com sucesso!");
            ConexaoBDSimulada.conexao = new HashMap<>();
        }
        return ConexaoBDSimulada.conexao;
    }

    @Override
    public String toString() {
        String registros =  "Sistema_de_jogos{\n";
        for (Map.Entry<Integer,Entity> entry : conexao.entrySet()) {
            registros += "\t" + entry.getKey() + "\n";
        }
        registros += "\n}";
        return registros;
    }
    
}
