
package padroes.etapa3.parte2;

import padroes.etapa3.parte2.models.Jogo;

/**
 *
 * @author danie
 */
public class Teste {
    public static void main(String[] args) {
        Jogo marioBros = Jogo.Builder(1)
            .nome("Mario Bros")
            .plataformas(null)
            .build();
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
