package Session06.Main;

import Session06.GatotKaca;
import Session06.Hero;
import Session06.Panji;

public class Main {
    /*
     overloading
     1 class
     -sama nama function
     -beda jumblah parameter
     -beda tipe data parameter


     overriding
     -beda class
     -sama nama, jumlah, type data paramerter



     abstract class -> abstract class adalah kelas yang memiliki abstravct method
     abstract method -> method yang belum didefinisikan/deskripsikan
     interface


     */
    public static void main(String[] args) {
        GatotKaca p1 = new GatotKaca();
        GatotKaca p2 = new GatotKaca();
//        Hero h1 = new Hero(); //bisa aja, boleh\

        Hero p3 = new Hero() {
            @Override
            public void skill(Hero target) {
                System.out.println("Skill 1");
            }
        };
        //anonymus class
        Hero p4 = new GatotKaca();//polimorphism => banyak bentuk,
        Hero p5 = new Panji();
        System.out.println("Level: "+p1.getLvl());
        p1.attack(p2);
        p2.skill(p1);
        p4.skill(p3);
        p3.skill(p4);
        p5.skill(p3);
        System.out.println("Hp p1 ="+p1.getHp());
        System.out.println("Hp p2 ="+p2.getHp());
        System.out.println("Hp p3 ="+p3.getHp());
        System.out.println("Hp p4 ="+p4.getHp());
    }


}