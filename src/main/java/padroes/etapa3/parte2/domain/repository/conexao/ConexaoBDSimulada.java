
package padroes.etapa3.parte2.domain.repository.conexao;

/**
 *
 * @author 62040614370
 */
import java.util.HashMap;
import java.util.Map;
import padroes.etapa3.parte2.domain.model.Entity;

public class ConexaoBDSimulada {
    private static ConexaoBDSimulada instance; // Instância única da conexão
    private Map<Integer, Entity> conexao; // Mapa de conexão

    private ConexaoBDSimulada() {
        conexao = new HashMap<>();
    }

    public static ConexaoBDSimulada getInstance() {
        if (instance == null) {
            synchronized (ConexaoBDSimulada.class) {
                if (instance == null) {
                    instance = new ConexaoBDSimulada();
                }
            }
        }
        return instance;
    }

    public Map<Integer, Entity> getConection() {
        return conexao;
    }

    @Override
    public String toString() {
        String registros = "Sistema_de_jogos{\n";
        for (Map.Entry<Integer, Entity> entry : conexao.entrySet()) {
            registros += "\tid = " + entry.getKey() + "\n\tvalor=" + entry.getValue() + "\n";
        }
        registros += "\n}";
        return registros;
    }
}