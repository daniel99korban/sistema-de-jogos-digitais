
package padroes.etapa3.parte2.models;

import java.math.BigDecimal;
import padroes.etapa3.parte2.models.Plataforma;

/**
 *
 * @author danie
 */
public class PlataformaXbox extends Plataforma{

    public PlataformaXbox(String nome, Integer id) {
        super(nome, id);
    }
    
    @Override
    public BigDecimal precoDiario() {
        return new BigDecimal(0);
    }

    @Override
    public String toString() {
        return "PlataformaXbox{id=" + super.getId()+", nome=" + super.getNome() + ", jogos="+ super.getJogos() +"}";
    }
    
}
