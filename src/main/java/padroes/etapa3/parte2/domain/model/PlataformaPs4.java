
package padroes.etapa3.parte2.domain.model;

import java.math.BigDecimal;
import padroes.etapa3.parte2.domain.model.Plataforma;

/**
 *
 * @author danie
 */
public class PlataformaPs4 extends Plataforma{

    public PlataformaPs4(Integer id) {
        super(id);
    }
    
    @Override
    public BigDecimal precoDiario() {
        return new BigDecimal(0);
    }

    @Override
    public String toString() {
        return "PlataformaPs4{id=" + super.getId()+", nome=" + super.getNome() +"}";
    }
    
}
