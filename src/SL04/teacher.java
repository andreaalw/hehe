package SL04;

import java.util.Scanner;

public class teacher extends Person{
//    teacher(){ //default constractor.
//        this.matkul = matkul;
//    }
//    teacher ta = new teacher(bindo);
    Scanner sc = new Scanner(System.in);
    String NoIn;

//    void teacher(String noIn) {
//        this.NoIn = noIn;
//    }

    public teacher(String name, String Matkul, String pass, String Noin){
        super(name, Matkul, pass);
        this.name = name;

//        super(name,Matkul,pass);
        this.NoIn = Noin;

    }

//    public teacher() {
//        super("andere","jskjd","sdfs");
//    }
//    public static void login(){
//
//    }



//    public void login(Scanner scan) {
//        login(scan);
//
////        System.out.println("input Your NO:");
////        NoIn = scan.nextLine();
//
//    }

//    @Override
//    public void login(Person name, Person Matkul, Person pass) {
//        System.out.println("Hallo please input your Name: ");
//
//
//
//    }

//    @Override
    public void login() {

        System.out.printf("1. input your name: ");
        name = sc.nextLine();


        System.out.printf("2. input your Nomor Pengajar: ");
        NoIn = sc.nextLine();
        while(!pass.equals(355)){
            System.out.printf("3. input your password: ");
            pass = sc.nextLine();
        }



    }



    public void display(){
        display();
    }

//    @Override
//    public void login(Siswa name, Siswa pass) {
//
//    }
//
//    @Override
//    public void login(teacher name, teacher pass) {
//
//    }


//    @Override
//   public void login(String name, String Pass) {
//        int input;
//        Scanner sc = new Scanner(System.in);
//        do{
//            System.out.println("Hi");
//            System.out.println("mau milih berapa");
//            input = sc.nextInt();
//        }while (input !=3);
//
//    }

//    teacher I = new teacher("Romi Sipatukarang", "IPS", "akuguru", "12234");
//
//        teacher I2 = new teacher("Dini Rapunjel", "IPA", "akuguru", "1456");
////        teacher.add(I2);
//        teacher I3 = new teacher("Vavanai Olo", "PKN", "akuguru", "23445");
////        teacher.add(I3);


}
