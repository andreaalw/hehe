package Session06;

public abstract class Hero {
    int atk;
    protected int hp;
    int mp;
    private int lvl;

    public int getLvl() {
        return lvl;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Hero() {
        lvl= 1;
    }
//public Hero 2 2 nya overloading
    public Hero(int lvl) {
        this.lvl=lvl;//buat ngeset, kalo get cm buat ambil doang
    }

    public void attack(Hero enemy){
        enemy.hp-=this.atk;

    }

    public abstract void skill(Hero target); //abstract class adalah kelas yang memiliki abstravct method

}
