
package padroes.etapa3.parte2.models;

import java.math.BigDecimal;
import padroes.etapa3.parte2.models.Plataforma;

/**
 *
 * @author daniel korban e Pedro Ivo
 */
public class PlataformaXbox extends Plataforma{

    public PlataformaXbox(Integer id) {
        super(id);
    }
    
    @Override
    public BigDecimal precoDiario() {
        return new BigDecimal(0);
    }

    @Override
    public String toString() {
        return "PlataformaXbox{id=" + super.getId()+", nome=" + super.getNome() + "}";
    }
    
}
