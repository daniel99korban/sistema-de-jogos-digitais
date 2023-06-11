
package padroes.etapa3.parte2.modelos;

import java.math.BigDecimal;
import java.util.List;
/**
 *
 * @author danie
 */
public class JogoPlataforma {
    
    private BigDecimal precoDiario;
    private List<Jogo> jogos;
    private List<Plataforma> plataformas;
    
    public double calcularPrecoDiario(){
        for(Plataforma plataforma : plataformas){
            this.precoDiario += plataforma.precoDiario();
        }
        return this.precoDiario;
    }
    
}
