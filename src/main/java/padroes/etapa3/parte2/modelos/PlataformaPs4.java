
package padroes.etapa3.parte2.modelos;

import java.math.BigDecimal;
import padroes.etapa3.parte2.modelos.Plataforma;

/**
 *
 * @author danie
 */
public class PlataformaPs4 extends Plataforma{

    public PlataformaPs4(String nome) {
        super(nome);
    }

    @Override
    public BigDecimal precoDiario() {
        return new BigDecimal(0);
    }
    
}
