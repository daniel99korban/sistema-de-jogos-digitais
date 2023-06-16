package padroes.etapa3.parte2;


import padroes.etapa3.parte2.domain.model.*;
import padroes.etapa3.parte2.domain.repository.conexao.ConexaoBDSimulada;
import padroes.etapa3.parte2.domain.service.*;


/**
 *
 * @author daniel korban & Pedro Ivo
 */
public class Teste {
    public static void main(String[] args) {
        // serviços
        ClienteService clienteService = new ClienteService();
        LocacaoService LocacaoService = new LocacaoService();
        JogoService jogoService = new JogoService();
        PlataformaService plataformaService = new PlataformaService();
        
        Cliente cliente = new Cliente.Builder(1)
            .nome("Daniel")
            .email("daniel@gmail.com")
            .telefone("9999-9999")
            .senha("123admin")
            .build();
        clienteService.cadastrar(cliente);
        
        // cadastrar jogos
        Jogo jogo1 = new Jogo.Builder(2)
            .titulo("Mario Bros")
            .build();
        jogoService.cadastrar(jogo1);
        Jogo jogo2 = new Jogo.Builder(3)
            .titulo("Sonic")
            .build();
        jogoService.cadastrar(jogo2);
        Jogo jogo3 = new Jogo.Builder(4)
            .titulo("Crash bandicoot")
            .build();
        jogoService.cadastrar(jogo3);
        
        //cadastrar plataformas
        Plataforma ps4 = new Plataforma.Builder(new PlataformaPs4(5)).nome("Playstation 4").build();
        Plataforma xbox = new Plataforma.Builder(new PlataformaXbox(6)).nome("Xbox 360").build();
        plataformaService.cadastrar(ps4);
        plataformaService.cadastrar(xbox);
        
        //fazer a associação entre jogos e algumas plataformas
        JogoPlataforma jogoEPlataforma1 = new JogoPlataforma(1);
        JogoPlataforma jogoEPlataforma2 = new JogoPlataforma(2);
        
        // adicionar plataformas disponiveis
        jogoEPlataforma1.adicionarJogo(jogo1);
        jogoEPlataforma1.adicionarJogo(jogo2);
        jogoEPlataforma1.adicionarPlataforma(ps4);
        jogoEPlataforma1.adicionarPlataforma(xbox);
        
        jogoEPlataforma2.adicionarJogo(jogo3);
        jogoEPlataforma2.adicionarPlataforma(ps4);
        
        // Para obter os jogos disponíveis em uma determinada plataforma:
        Plataforma plataforma = xbox;
        for (Jogo jogo : plataforma.getJogoPlataforma(jogoEPlataforma1).getJogos()) {
            System.out.println("O jogo " + jogo.getTitulo()+ " está disponível em " + plataforma.getNome());
        }
    }
}
