
package padroes.etapa3.parte2.modelos;

import java.math.BigDecimal;
import padroes.etapa3.parte2.modelos.Plataforma;

/**
 *
 * @author danie
 */
public class PlataformaXbox extends Plataforma{

    public PlataformaXbox(String nome) {
        super(nome);
    }

    @Override
    public BigDecimal precoDiario() {
        return new BigDecimal(0);
    }
    
}
