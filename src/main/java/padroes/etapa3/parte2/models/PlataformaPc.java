
package padroes.etapa3.parte2.models;

import java.math.BigDecimal;

/**
 *
 * @author danie
 */
public class PlataformaPc extends Plataforma{

    public PlataformaPc(String nome, Integer id) {
        super(nome, id);
    }
    
    @Override
    public BigDecimal precoDiario() {
        return new BigDecimal(0);
    }

    @Override
    public String toString() {
        return "PlataformaPc{id=" + super.getId()+", nome=" + super.getNome() + ", jogos="+ super.getJogos() +"}";
    }
    
}
