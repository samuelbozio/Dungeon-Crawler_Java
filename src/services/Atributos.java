package services;

public abstract class Atributos implements Ataques {


    public Atributos(){

    }
    public Atributos(int hp, int mana, int atk) {
        this.hp = hp;
        this.mana = mana;
        this.atk = atk;
    }

    private int hp;
    private int mana;
    private int atk;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }
}
