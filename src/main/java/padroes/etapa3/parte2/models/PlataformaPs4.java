
package padroes.etapa3.parte2.models;

import java.math.BigDecimal;
import padroes.etapa3.parte2.models.Plataforma;

/**
 *
 * @author danie
 */
public class PlataformaPs4 extends Plataforma{

    public PlataformaPs4(String nome, Integer id) {
        super(nome, id);
    }
    
    @Override
    public BigDecimal precoDiario() {
        return new BigDecimal(0);
    }

    @Override
    public String toString() {
        return "PlataformaPs4{id=" + super.getId()+", nome=" + super.getNome() + ", jogos="+ super.getJogos() +"}";
    }
    
}
