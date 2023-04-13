package Session06;

public class GatotKaca extends Hero {
    public GatotKaca(){
//        super(); //manggil konstarktor, langsung ngeset di 0 si level, gapake super ternyata bisa
//        super(15);
        atk = 200;
        hp = 1000;
        mp =  100;
    }

    @Override
    public void attack(Hero enemy) {
        super.attack(enemy);
        this.hp += this.atk *0.1;
    }

    public void skill(Hero target){//ini skill 1
        target.setHp(target.getHp()-100);
    }

}
