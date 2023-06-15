
package padroes.etapa3.parte2.models;

import java.math.BigDecimal;

/**
 *
 * @author danie korban & Pedro ivo
 */
public class PlataformaPc extends Plataforma{

    public PlataformaPc(Integer id) {
        super(id);
    }
    
    @Override
    public BigDecimal precoDiario() {
        return new BigDecimal(0);
    }

    @Override
    public String toString() {
        return "PlataformaPc{id=" + super.getId()+", nome=" + super.getNome() +"}";
    }
    
}
