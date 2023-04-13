package Session06;

public class Panji extends Hero{
    @Override
    public void skill(Hero target) {
        target.setHp(target.getHp()+200);

    }
}
