public class Jogador extends Atributos{

    private Inimigo inimigo;

    public Jogador(Inimigo inimigo) {
        super();
        this.inimigo = inimigo;

    }
    public Jogador(int hp, int mana, int atk) {
        super(hp, mana, atk);
    }

    @Override
    public double ataque1() {
        int dano = getAtk();
        int hpInimigo = inimigo.getHp();
        System.out.println("DANO JOGADOR: " + dano + " - " + "HP INIMIGO: " + hpInimigo);

        int attHpInimigo = hpInimigo = dano; //Corrigir cálculo dano.
        System.out.println("HP INIMIGO APÓS ATAQUE: " + attHpInimigo);
        return attHpInimigo;

    }

    @Override
    public double ataque2() {
        return 0;
    }


    @Override
    public void setInimigo(Inimigo inimigo) {
        this.inimigo = inimigo;
    }

    @Override //
    public void setJogador(Jogador jogador) {

    }


}
