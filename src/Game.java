import java.util.Scanner;

public class Game {

    private Inimigo inimigo;
    private Jogador jogador;
    private boolean turnoJogador;
    private Scanner sc = new Scanner(System.in);


    public Game(Inimigo inimigo, Jogador jogador) {
        this.inimigo = inimigo;
        this.jogador = jogador;
        this.turnoJogador = true;
    }

    public void turnos() {

        while (jogador.getHp() > 0) {
            System.out.println("TURNO JOGADOR");
            System.out.println("Selecione seu ataque 1 ou 2");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    jogador.ataque1();
                    break;
                case 2:
                    System.out.println("2");
                    break; //Ajustar switch
            }

            turnoJogador = false;
            //Fazer lógica do inimigo.
            inimigo.ataque1();

        }

    }


}
