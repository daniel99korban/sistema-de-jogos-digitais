
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

    private Cliente(Integer id) {
        super(id);
    }

    @Override
    public String toString() {
        return "\nCliente{" + "\n\tid=" + this.getId() + "\n\tnome=" + nome + ",\n\temail=" + email + ",\n\ttelefone=" + telefone + ",\n\tsenha=" + senha + ",\n\tlocacoes=" + locacoes + ",\n\tutilizacoes=" + utilizacoes + "\n}";
    }
    // getters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getSenha() {
        return senha;
    }

    public List<Locacao> getLocacoes() {
        return locacoes;
    }

    public List<UtilizacaoDoConsolePeloCliente> getUtilizacoes() {
        return utilizacoes;
    }
    

    //padrao step build
    public static class Builder{
        
        private Cliente cliente;
        
        public Builder(Integer id) {
            cliente = new Cliente(id);
        }
 
        public Builder nome(String nome) {
            this.cliente.nome = nome;
            return this;
        }

        public Builder email(String email) {
            this.cliente.email = email;
            return this;
        }

        public Builder telefone(String telefone) {
            this.cliente.telefone = telefone;
            return this;
        }

        public Builder senha(String senha) {
            this.cliente.senha = senha;
            return this;
        }

        public Builder locacoes(List<Locacao> locacoes) {
            this.cliente.locacoes = locacoes;
            return this;
        }

        public Builder utilizacoes(List<UtilizacaoDoConsolePeloCliente> utilizacoes) {
            this.cliente.utilizacoes = utilizacoes;
            return this;
        }
        
        public Cliente build(){
            return this.cliente;
        }

    }
}
