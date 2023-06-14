
package padroes.etapa3.parte2.builder;

import java.util.Arrays;
import padroes.etapa3.parte2.models.Jogo;
import padroes.etapa3.parte2.models.JogoPlataforma;

/**
 *
 * @author daniel korban
 */
public class JogoBuider implements JogoBuild{
    
    private Jogo jogo;

    public JogoBuider(Integer id) {
        this.jogo = new Jogo(id);
    } 

    @Override
    public void titulo(String titulo) {
        this.jogo.setTitulo(titulo);
    }

    @Override
    public void plataformasDisponiveis(JogoPlataforma... jogoPlataformas) {
        this.jogo.setPlataformas(Arrays.asList(jogoPlataformas));
    }

    @Override
    public Jogo build() {
        return this.jogo;
    }
    
}
