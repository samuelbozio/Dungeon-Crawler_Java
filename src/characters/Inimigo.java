package characters;

import services.Atributos;

public class Inimigo extends Atributos {

    private Jogador jogador;

    public Inimigo(Jogador jogador) {
        super();
        this.jogador = jogador;
    }

    public Inimigo(int hp, int mana, int atk) {
        super(hp, mana, atk);
    }

    @Override
    public double ataque1() {
        int dano = getAtk();
        int hpJogador = jogador.getHp();

        int attHpJogador = hpJogador - dano;

        return attHpJogador;
    }

    @Override
    public double ataque2() {
        return 0;
    }


    @Override //
    public void setInimigo(Inimigo inimigo) {

    }


    @Override
    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }


}
