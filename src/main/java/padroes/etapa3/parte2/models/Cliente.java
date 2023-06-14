
package padroes.etapa3.parte2.models;

import java.util.List;

/**
 *
 * @author danie
 */
public class Cliente extends Entity{
    
    private String nome;
    private String email;
    private String telefone;
    private String senha;
    private List<Locacao> locacoes;
    private List<UtilizacaoDoConsolePeloCliente> utilizacoes;

    public Cliente(Integer id) {
        super(id);
    }

    public Cliente(String nome, String email, String telefone, String senha, List<Locacao> locacoes, List<UtilizacaoDoConsolePeloCliente> utilizacoes, Integer id) {
        super(id);
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.locacoes = locacoes;
        this.utilizacoes = utilizacoes;
    }

//    public Cliente(Integer id) {// como cliente é uma entidade ele herda o atributo Id e o metodo getId();;
//        super(id);
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Locacao> getLocacoes() {
        return locacoes;
    }

    public void setLocacoes(List<Locacao> locacoes) {
        this.locacoes = locacoes;
    }

    public List<UtilizacaoDoConsolePeloCliente> getUtilizacoes() {
        return utilizacoes;
    }

    public void setUtilizacoes(List<UtilizacaoDoConsolePeloCliente> utilizacoes) {
        this.utilizacoes = utilizacoes;
    }

    @Override
    public String toString() {
        return "\nCliente{" + "\n\tid=" + this.getId() + "\n\tnome=" + nome + ",\n\temail=" + email + ",\n\ttelefone=" + telefone + ",\n\tsenha=" + senha + ",\n\tlocacoes=" + locacoes + ",\n\tutilizacoes=" + utilizacoes + "\n}";
    }

    
    
}
