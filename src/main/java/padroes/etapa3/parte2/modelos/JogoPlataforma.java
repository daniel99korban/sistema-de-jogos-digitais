
package padroes.etapa3.parte2.modelos;

import java.math.BigDecimal;
import java.util.List;
/**
 *
 * @author danie
 */
public class JogoPlataforma {
    
    private double precoDiario;
    private List<Jogo> jogos;
    private List<Plataforma> plataformas;
    private List<ItemLocacao> locacoes;
    
    public double calcularPrecoDiario(){
        for(Plataforma plataforma : plataformas){
            this.precoDiario += plataforma.precoDiario().doubleValue();
        }
        return this.precoDiario;
    }
    
}
