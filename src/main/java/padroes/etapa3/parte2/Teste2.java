package padroes.etapa3.parte2;


import padroes.etapa3.parte2.domain.model.Cliente;
import padroes.etapa3.parte2.domain.model.Entity;
import padroes.etapa3.parte2.domain.model.Jogo;
import padroes.etapa3.parte2.domain.repository.conexao.ConexaoBDSimulada;
import padroes.etapa3.parte2.domain.service.*;


/**
 *
 * @author daniel korban & Pedro Ivo
 */
public class Teste2 {
    public static void main(String[] args) {
        Entity entidade = null;
        // serviços
        ClienteService clienteService = new ClienteService();
        LocacaoService LocacaoService = new LocacaoService();
        JogoService jogoService = new JogoService();
        
        entidade = new Cliente.Builder(1)
            .nome("Daniel")
            .email("daniel@gmail.com")
            .telefone("9999-9999")
            .senha("123admin")
            .build();
        clienteService.cadastrar(entidade);
//        //ConexaoBDSimulada.verDados();
//        ConexaoBDSimulada teste = new ConexaoBDSimulada();
//        System.out.println(teste);
//        
        // cadastrar jogos
        entidade = new Jogo.Builder(2)
            .titulo("Mario Bros")
            .build();
        jogoService.cadastrar(entidade);
        entidade = new Jogo.Builder(3)
            .titulo("Sonic")
            .build();
        jogoService.cadastrar(entidade);
        entidade = new Jogo.Builder(4)
            .titulo("Crash bandicoot")
            .build();
        jogoService.cadastrar(entidade);
        
    }
}
