package application;

import characters.Inimigo;
import characters.Jogador;
import services.Game;

public class Main {
    public static void main(String[] args) {

        Jogador jogador = new Jogador(10, 10, 8);
        Inimigo inimigo = new Inimigo(8, 8, 4);
        jogador.setInimigo(inimigo);
        inimigo.setJogador(jogador);
        Game game = new Game(inimigo, jogador); //injeção de dependência
        game.turnos();



    }
}