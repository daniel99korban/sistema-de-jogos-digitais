
package padroes.etapa3.parte2.modelos;

import java.math.BigDecimal;

/**
 *
 * @author danie
 */
public class PlataformaPc extends Plataforma{

    public PlataformaPc(String nome) {
        super(nome);
    }
    
    @Override
    public BigDecimal precoDiario() {
        return 0;
    }
    
}
