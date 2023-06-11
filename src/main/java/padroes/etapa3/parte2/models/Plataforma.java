
package padroes.etapa3.parte2.models;

import java.math.BigDecimal;
import java.util.List;
import padroes.etapa3.parte2.repository.Entity;

/**
 *
 * @author danie
 */
abstract class Plataforma extends Entity{//(Xbox, PS3, PS4, PC, etc.).
    
    private String nome;
    private List<JogoPlataforma> jogos;

    public Plataforma(String nome, Integer id) {
        super(id);
        this.nome = nome;
    }

    public Integer getId() {
        return super.getId();
    }

    public void setId(Integer id) {
        super.setId(id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<JogoPlataforma> getJogos() {
        return jogos;
    }

    public void setJogos(List<JogoPlataforma> jogos) {
        this.jogos = jogos;
    }
    
    public abstract BigDecimal precoDiario();
}
