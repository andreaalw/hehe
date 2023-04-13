package SL04;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {


//    public class loginSiswa{
//        String name;
//        String
//
//    }
//    public  static Siswa siswa = new Siswa();

    public static void main(String[] args) {

        teacher tcc;

        Scanner sc = new Scanner(System.in);
        ArrayList<teacher> teacher = new ArrayList<>();
        ArrayList<Siswa> ss = new ArrayList<>();

//        Siswa siswa = new Siswa();
//        teacher c= new teacher();
//        Siswa siswa;



        teacher I = new teacher("Romi Sipatukarang", "IPS", "akuguru", "12234");
        teacher.add(I);
        teacher I2 = new teacher("Dini Rapunjel", "IPA", "akuguru", "1456");
        teacher.add(I2);
        teacher I3 = new teacher("Vavanai Olo", "PKN", "akuguru", "23445");
        teacher.add(I3);


        //dibuat object dulu si siswa nya

//        Siswa A = new Siswa("Alen Yauha", "IPS", "akumurid", "111");
//        ss.add(A);
//        Siswa B = new Siswa("Wanda Nasa", "PkN", "akumurid2", "222");
//        ss.add(B);
//        Siswa C = new Siswa("Peter pan", "IPA", "akumurid3", "333");
//        ss.add(C);


        int role;
        String namae;
        String passworde;
        do {
            System.out.println("Welcome to Wakanda school");
            System.out.println("=========================");
            System.out.println("Please choose your role");
            System.out.println("1. Student");
            System.out.println("2. Teacher");
            System.out.printf(">>");
            role = sc.nextInt();

            if (role == 1) {
//                Person
                namae= sc.nextLine();
                passworde = sc.nextLine();
                String noind = sc.nextLine();
//                Siswa siswa = new Siswa(namae,passworde,noind);



//                siswa.login();
//                ss.add(siswa);


//                System.out.println("Welcome "+ siswa.getName());





//                siswa.display();

//                String inname, Pass;
//                  siswa.login(new Scanner(System.in));
//
//                System.out.printf("1. Input Your Name : ");
//                inname = sc.nextLine();
//
//                System.out.printf("2. input Your Password: ");
//                Pass = sc.nextLine();

            } else if (role == 2) {
//                tcc.login();
//                teacher.add(tcc);
            }

        }while (role !=3);
        }
    }
