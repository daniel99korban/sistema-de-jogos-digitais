
package padroes.etapa3.parte2.modelos;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author danie
 */
public class Locacao {
    private Integer id;
    private LocalDate data;
    private List<ItemLocacao> itens;
    private Cliente cliente;
}
