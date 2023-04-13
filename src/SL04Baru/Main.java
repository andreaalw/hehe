package SL04Baru;

import SL04.Siswa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course course = new Course(null,null);
        Score score = new Score(null,null,0);

        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        boolean wakanda = true;

        int role,menu = 0,menu1=0;
        do {
            do{
                System.out.println("\n" +
                        "░██╗░░░░░░░██╗░█████╗░██╗░░██╗░█████╗░███╗░░██╗██████╗░░█████╗░  ░██████╗░█████╗░██╗░░██╗░█████╗░░█████╗░██╗░░░░░\n" +
                        "░██║░░██╗░░██║██╔══██╗██║░██╔╝██╔══██╗████╗░██║██╔══██╗██╔══██╗  ██╔════╝██╔══██╗██║░░██║██╔══██╗██╔══██╗██║░░░░░\n" +
                        "░╚██╗████╗██╔╝███████║█████═╝░███████║██╔██╗██║██║░░██║███████║  ╚█████╗░██║░░╚═╝███████║██║░░██║██║░░██║██║░░░░░\n" +
                        "░░████╔═████║░██╔══██║██╔═██╗░██╔══██║██║╚████║██║░░██║██╔══██║  ░╚═══██╗██║░░██╗██╔══██║██║░░██║██║░░██║██║░░░░░\n" +
                        "░░╚██╔╝░╚██╔╝░██║░░██║██║░╚██╗██║░░██║██║░╚███║██████╔╝██║░░██║  ██████╔╝╚█████╔╝██║░░██║╚█████╔╝╚█████╔╝███████╗\n" +
                        "░░░╚═╝░░░╚═╝░░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚══╝╚═════╝░╚═╝░░╚═╝  ╚═════╝░░╚════╝░╚═╝░░╚═╝░╚════╝░░╚════╝░╚══════╝");
                System.out.println("Choose Your role");
                System.out.println("1. Teacher");
                System.out.println("2. Student");
                System.out.println("3. Exit");
                System.out.print(">>");
                role = sc.nextInt();


                if(role == 1){
                    String name = Teacher.name;
                    String pass = Teacher.pass;
                    System.out.println("Hi Teacher!!");
                    do {
                        System.out.printf("1. Input Your username[>5 char]: ");
                        name = sc.next();
                    }while (name.length()<5);
                    boolean check2 = true;

                    do {

                        System.out.printf("2. input Your password: ");
                        pass = sc.next();

                        if (Teacher.checkPass(pass)) {
                            do {

                                System.out.println("Hello Ms/Mr "+name+" !!");
                                System.out.println("1. Input Value");
                                System.out.println("2. See overall Value ");
                                System.out.println("3. See alllllll");
                                System.out.println("4. Logout");
                                System.out.printf(">>");
                                menu1 = sc.nextInt();

                                switch (menu1) {
                                    case 1:
                                        score.input(sc);
                                        break;
                                    case 2:
                                        score.viewBener();
//                                    System.out.println("\n");
//                                    score.Calculate();
//                                    System.out.println("\n");
                                        break;
                                    case 3:
                                        score.Calculate();
//                                    score.hitungsemua;
                                        break;

                                    case 4:
//                                    score.Calculate();
                                        sc.nextLine();
                                        role = 0;
                                        wakanda = false;
                                        break;
                                }


                            } while (menu1 != 4);
                        } else {
                            check2 = false;
                        }
                    }while (!check2);

                    teachers.add(new Teacher(name,pass));

                }else if(role == 2) {
                    String name1 = Student.name;
                    String pass1 = Student.pass;
//                String name, pass;
                    System.out.println("Hi student!!");
                    do {
                        System.out.printf("1. Input Your username[>5 char]: ");
                        name1 = sc.next();
                    }while (name1.length()<5);

                    boolean check = true; //variable check

                    do {
                        System.out.printf("2. Input Your Pass: ");
                        pass1 = sc.next();

                        if(Student.checkPass(pass1)){
                            do{
                                System.out.println("Helllo "+name1+" student Of Wakanda School");
                                System.out.println("1. See OverAll Value");
                                System.out.println("2. Logout");
                                System.out.print(">>");
                                menu = sc.nextInt();

                                switch (menu){
                                    case 1:
//                                    System.out.println("Hallo");

                                        score.Calculate();
//                                    score.viewBener1();
//                                    System.out.println(""+score1.scores+""+score1.tipe);

                                        break;
                                    case 2:
                                        System.out.println("Back");
                                        sc.nextLine();
                                        role = 0;
                                        wakanda = false;
                                        break;
                                }
                            }while(menu!=2);
                        }else {
                            check = false;
                        }
                    }while (!check);

                    students.add(new Student(name1, pass1));

                }
                else if (role  == 3){
                    System.out.println("you have logged out...");
                    System.out.println("thank you for using this application!");
                    System.exit(0);
                }

            }while (role!=3);

        }while (wakanda = true);
    }
}
