
package padroes.etapa3.parte2.modelos;

import java.math.BigDecimal;

/**
 *
 * @author danie
 */
abstract class Plataforma {//(Xbox, PS3, PS4, PC, etc.).
    
    private Integer id;
    private String nome;

    public Plataforma(String nome) {
        this.nome = nome;
    }
    
    public abstract BigDecimal precoDiario();
}
