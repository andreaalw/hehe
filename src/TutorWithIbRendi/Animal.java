package TutorWithIbRendi;

import java.util.Scanner;

public class Animal {
    String name;
    int age;
    double weight;

    Animal(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat(){
        System.out.println(name + "is eating");
        weight +=0.2;
    }

    void sleep(){
        System.out.println(name +"is going to sleep");

    }
    void poop(){
        System.out.println(name+ "is pooping");
        weight -= 0.5;
    }
}

class Bird extends Animal{
    Bird(String name, int age, double weight){
        super(name, age, weight);
    }
    void fly(){
        System.out.println(super.name+" terbang");
    }
}

//class Mamalia extends Animal{
//    Bird(String name, int age, double weight){
//        super(name, age, weight);
//    }
//}

class run{
    public static void main(String[] args) {
//        Bird bird = new Bird("alen", 90,800);
//        bird.fly();


        try {
            String birdName;
            Double weight;
            int age;

            Scanner scanner = new Scanner(System.in);
            birdName  = scanner.nextLine();
            age = scanner.nextInt();
            weight = scanner.nextDouble();

            if(age == 0) throw new Exception ("Tolong lah mas umur 0 bang");

            //block statement
            Bird vbird = new Bird(birdName,age,weight);

        }catch (Exception e){
            System.out.println("Error");
            e.printStackTrace();//kalo ada error ditampilin
        }
    }
}
