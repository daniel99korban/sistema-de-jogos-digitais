
package padroes.etapa3.parte2.builder;

import padroes.etapa3.parte2.models.Jogo;
import padroes.etapa3.parte2.models.JogoPlataforma;

/**
 *
 * @author 62040614370
 */
public interface JogoBuild {
    void titulo(String titulo);
    void plataformasDisponiveis(JogoPlataforma... plataformas);
    Jogo build();
}
