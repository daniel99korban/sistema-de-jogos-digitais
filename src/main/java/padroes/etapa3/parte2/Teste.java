
package padroes.etapa3.parte2;
import padroes.etapa3.parte2.models.*;

/**
 *
 * @author danie
 */
public class Teste {
    public static void main(String[] args) {
//        for (Jogo jogo : plataforma.getJogoPlataforma(jogoEPlataforma2).getJogos()) {
//            System.out.println("O jogo " + jogo.getTitulo()+ " está disponível em " + plataforma.getNome());
//        }

        // SIMULAR ESTES CENÁRIO:
        //Quando um cliente (nome, email,telefone, senha) deseja fazer uma locação, ele informa 
        //quais jogos ele quer locar, informando inclusive de qual plataforma é cada jogo contido 
        //na locação a ser realizada. Quando a locação é realizada, a data atual deve ser registrada para esta locação. Para
        //cada jogo locado, o cliente informa quantos dias ele deseja ficar com cada um (note
        //que ele pode alugar, por exemplo, um jogo X da plataforma Xbox por 2 dias e um jogo Y
        //da plataforma PC por 5 dias, tudo para a mesma locação).
        // AUQUI
        
        //A locadora também possui alguns consoles de videogame, os quais podem ser usados no local pelos clientes por
        //um certo intervalo de tempo. Cada console possui um preço por cada hora (ou fração)
        //utilizada, e contém um conjunto de acessórios (headphone, controle, Kinect, etc.).
    }
}

//        // jogos
//        Jogo jogo1 = new Jogo.Builder(1).titulo("Mario Bros").build();
//        Jogo jogo2 = new Jogo.Builder(2).titulo("Sonic").build();
//        Jogo jogo3 = new Jogo.Builder(3).titulo("Crash Bandicoot").build();
//        
//        // plataformas
//        Plataforma ps4 = new Plataforma.Builder(new PlataformaPs4(1)).nome("Playstation 4").build();
//        Plataforma xbox = new Plataforma.Builder(new PlataformaXbox(1)).nome("Xbox 360").build();
//        
//        //fazer a associação entre jogos e algumas plataformas
//        JogoPlataforma jogoEPlataforma1 = new JogoPlataforma(1);
//        JogoPlataforma jogoEPlataforma2 = new JogoPlataforma(2);
//        
//        // adicionar plataformas disponiveis
//        jogoEPlataforma1.adicionarJogo(jogo1);
//        jogoEPlataforma1.adicionarJogo(jogo2);
//        jogoEPlataforma1.adicionarPlataforma(ps4);
//        jogoEPlataforma1.adicionarPlataforma(xbox);
//        
//        jogoEPlataforma2.adicionarJogo(jogo3);
//        jogoEPlataforma2.adicionarPlataforma(ps4);
//        
//        // Para obter os jogos disponíveis em uma determinada plataforma:
//        Plataforma plataforma = xbox;
//        for (Jogo jogo : plataforma.getJogoPlataforma(jogoEPlataforma1).getJogos()) {
//            System.out.println("O jogo " + jogo.getTitulo()+ " está disponível em " + plataforma.getNome());
//        }