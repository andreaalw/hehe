public class Class1701 {
    public static void main(String[] args) {
        Hero p1 = new Hero("Alice in the Wonderland");
        p1.setAtk(10);
//        p1.name = "Mingyu";
//        p1.sleep();
        p1.show();

        p1.train();

        //p1.atk = 100 gabisa karena di private
        //p1.energi = 100; bisa karena masih satu package
        p1.show();
    }
}

class Hero { //hurufpertamaHuruf Besarrrrrr
    //attribute / variable
    private String name;
    private int atk; //cm bisa diaksis oleh dirinya senidir
    //private atk cuma bisa di class hero foang
    private int energi;

    //behavior / method


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() > 100){
            throw new IllegalArgumentException("kakean jenengmu bos");
        }
        this.name = name;
    }

    public int getEnergi() {
        return energi;
    }

    public void setEnergi(int energi) {
        this.energi = energi;
    }

    public void sleep() {
        if (energi + 50 < 100) {
            energi += 50;
        } else {
            energi = 100;
        }
        System.out.println("Energi: "+energi);
    }

    public void train() {
        if (energi - 10 >= 0) {
            atk += 5;
            energi -= 10;
            System.out.println("Atk : "+atk);
            System.out.println("Energi : "+energi);
        }
    }

    public void show(){
        System.out.println("Name : "+name);
        System.out.println("Atk : "+atk);
        System.out.println("Energi : "+energi);
    }

    // getter => untuk mengambil datanya
    //biasnya public getter dan setter
    public int getAtk(){
        return atk;
    }

    //setter
    void setAtk(int atk){
        if(atk > 1000 || atk < 0 ){
            throw new IllegalArgumentException("atk mesti diatara 0 - 1000 ndesssss");
        }
        this.atk = atk;
    }

    //constructor
    //tidak menerima passing parameter apapun
    //biasanya pake public
    public Hero(String name){
        setName(name);
        //22 nya mendriver ke name kalo cm name =name.
        //jadi kalo di set gaakan berubah
//        this.name = name;//mendriver ke parameter
        //name yang depan menunjuk ke dirinya sendiri nya/ ke atribut dia
        //jadi kalo bingung name nya yang mana pake thid
        energi = 101;

    }

    //overloading
    //nama parameter harus sama, jumblah parameter beda, tipe data nya beda
    public Hero (String name, int energi){
        setName(name);
        this.energi = energi;
    }
    //yang membedakan jumblah parameter, jadinya beda.
    //namanya sama HEro tapi jumblah nya beda.
    // String name dan Int energi

}
/*
Access modifier
                class | package | inheritance/turuan | public/all
Public          *     | *       | *                  | *
protected       *     | *       | *
package/default *     | *
=>tanpa akses modifer
private         *

 */

//camel Case
//snake_case
//PascalCase