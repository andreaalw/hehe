package ProjectSL1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.io.*;



class Person{
    public String name;
    public String address;
    public String phoneNumber;

    public Person(){

    }
    public Person(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public String getName(){

        return name;
    }

    public String getAddress(){

        return address;
    }

    public String getPhoneNumber(){

        return phoneNumber;
    }

    public String toString(){
        return name+" "+address+" "+phoneNumber;
    }
}

class Dosen extends Person{
    private int id_dosen;
    public Dosen(){

    }

    public Dosen(String name, String address, String phoneNumber, int id_dosen){
        super(name, address, phoneNumber);
        this.id_dosen = id_dosen;
    }

    public int getDosen(){
        return id_dosen;
    }
}

class Mahasiswa extends Person{
    private String id_mhs;
    private int numberMhs;
    private String Major;
    private String DOB;

    public Mahasiswa(){

    }

    public Mahasiswa(String name, String Major, String DOB, String address, String phoneNumber, String id_mhs, int numberMhs){
        super(name, address, phoneNumber);
        this.id_mhs = id_mhs;
        this.numberMhs = numberMhs;
        this.Major = Major;
        this.DOB = DOB;

    }

    public String getMhs(){
        return id_mhs;
    }

    public String getMajor(){
        return Major;
    }

    public String getDOB(){
        return DOB;
    }

    public int getNumberMhs() {
        return numberMhs;
    }

    public void setId_mhs(){
        id_mhs = id_mhs;
    }

    public void setNumberMhs(){
        numberMhs =numberMhs;
    }
}

class matakuliah{

    private Dosen dosen;
    private String code_mtk;
    private String name_mtk;


    public matakuliah(){

    }

    public matakuliah(String code_mtk, String name_mtk, Dosen dosen){
        this.code_mtk = code_mtk;
        this.name_mtk = name_mtk;
        this.dosen = dosen;
    }
    public String getCode(){
        return code_mtk;
    }

    public String getName_mtk(){
        return name_mtk;
    }

    public String toString(){
        return code_mtk+" "+name_mtk;
    }


}

class jadwal {

    private matakuliah mk;
    private String clsroom;
    private String day;
    private String date;

    public jadwal(){

    }

    public jadwal(String clsroom, String day, String date,matakuliah mk){
        this.mk = mk;
        this.clsroom = clsroom;
        this.day = day;
        this.date = date;
    }
    public String getClsroom(){
        return clsroom;
    }

    public String getDay(){
        return day;
    }
    public String getDate(){
        return date;
    }

    public String toString(){
        return clsroom+" "+day+" "+date;
    }

}

class Absent {

    private Mahasiswa mahasiswa;
    private String desc;

    public Absent(){

    }
    public Absent(String desc, Mahasiswa mahasiswa){
        this.desc  =desc;
        this.mahasiswa = mahasiswa;
    }
    public String getDesc() {
        return desc;
    }
}

class HitungIPK{

    private Mahasiswa mahasiswa;
    private double UTS;
    private double UAS;
    private double tugas;

    public HitungIPK(){

    }

    public HitungIPK(double UTS, double UAS, double tugas, Mahasiswa mahasiswa){
        this.mahasiswa  = mahasiswa;
        this.UTS = UTS;
        this.UAS = UAS;
        this.tugas =tugas;
    }

    public double getUTS() {
        return UTS;
    }

    public double getUAS() {
        return UAS;
    }

    public double getTugas() {
        return tugas;
    }
}

public class ecampuz_app {
    public static void main(String[] args) {
        ArrayList<Dosen> dosenList = new ArrayList<>();
        ArrayList<Mahasiswa> mshList = new ArrayList<>();
        ArrayList<jadwal> jadwals = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        int choose = 0;
        int role = 0;
        int see = 0;
        int search = 0;

        do {
            System.out.println("=====================================");
            System.out.println("   Welcome to E-Campus Application!  ");
            System.out.println("=====================================");
            System.out.println("1).Insert Data");
            System.out.println("2).View Data");
            System.out.println("3).View Schedule");
            System.out.println("4).Search Data");
            System.out.println("5).Delete Data");
            System.out.println("6).Update Data");
            System.out.println("7).Calculate IPK");
            System.out.println("8).Presence");
            System.out.println("9).Exit Program");
            System.out.println("=====================================");
            System.out.print("Enter your choice: ");
            choose = scan.nextInt();


            switch (choose) {
                case 1:
                    System.out.println("Whose Data Do You Want to Add?");
                    System.out.println("1. Dosen");
                    System.out.println("2. Mahasiswa");
                    System.out.print(">> ");
                    role = scan.nextInt();

                    if (role == 1) {
                        String name, address, phoneNumber;
                        String id_dosen;

                        //Integer dosen= Integer.toString(id_dosen);
                        do {
                            System.out.print("Enter Your Number Dosen [4 Digits]: ");
                            id_dosen= scan1.nextLine();
                        } while (id_dosen.length()!=4);

                        do {
                            System.out.print("Enter Your Name [1-25 Characters]: ");
                            name = scan1.nextLine();
                        } while (name.length() < 5 || name.length() > 25);

                        do {
                            System.out.print("Enter Your Address [Must be Less than 50 Characters]: ");
                            address = scan1.nextLine();
                        } while (address.length() > 50);

                        do {
                            System.out.print("Enter Your Phone Number [12 digits] : ");
                            phoneNumber = scan1.nextLine();
                        } while (phoneNumber.length() != 12);

//                        String NIDN ="Andra";
//                        do {
//                            System.out.print("Enter Your NIDN [5 character]: ");
//                        } while(NIDN.length()!=5);


                        dosenList.add(new Dosen(name,address,phoneNumber,Integer.parseInt(id_dosen)));

                    } else if (role == 2) {
                        String name, address, phoneNumber, Major, DOB;
                        String numberMhs;
                        do {
                            System.out.print("Enter Your Student Number [4 digits]: ");
                            numberMhs = scan1.nextLine();
                        } while (numberMhs.length() != 4);
                        do {
                            System.out.print("Enter Your Name [1-25 Characters]: ");
                            name = scan1.nextLine();
                        } while (name.length() < 5 || name.length() > 25);

                        do {
                            System.out.print("Enter Your Address [Must be Less than 50 Characters]: ");
                            address = scan1.nextLine();
                        } while (address.length() > 50);

                        do {
                            System.out.print("Enter Your Phone Number [12 digits] : ");
                            phoneNumber = scan1.nextLine();
                        } while (phoneNumber.length() != 12);

                        String id_mhs;
                        do {
                            System.out.print("Enter Your NIM [4 digits]: ");
                            id_mhs = scan1.nextLine();
                        } while (id_mhs.length() != 4);

                        do {
                            System.out.print("Enter Your Major: ");
                            Major = scan1.nextLine();
                        } while (Major.length() > 30);

                        do {
                            System.out.print("Enter Your Date of Birth [MM-DD-YYYY]: ");
                            DOB = scan1.nextLine();
                        } while (DOB.equals("MM-DD-YYYY"));

                        mshList.add(new Mahasiswa(name, Major,DOB,address,phoneNumber, id_mhs, Integer.parseInt(numberMhs)));
                    } else {
                        System.out.println("The number you selected isn't available");
                    }
                    break;

                case 2:
                    System.out.println("Whose Data Do You Want to See?");
                    System.out.println("1. Dosen");
                    System.out.println("2. Mahasiswa");
                    System.out.print(">> ");
                    see = scan.nextInt();

                    if (see == 1) {
                        System.out.println("--------------------------------------------------------------------");
                        System.out.println("|                       Data Biodata Dosen                         |");
                        System.out.println("--------------------------------------------------------------------");
                        System.out.println(" Number\t\t\t Name\t\t\t   Adress\t\t\t Phone Number\t\t\t" );

                        for (Dosen d : dosenList) {
                            System.out.print("["+d.getDosen() +" \t\t\t");
                            System.out.print( d.getName() + "   \t\t\t");
                            System.out.print(d.getAddress() + "\t\t\t");
                            System.out.println(d.getPhoneNumber() + "  ]");
                        }
                    } else if (see == 2) {
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("|                                                 Data Biodata Mahasiswa                                                    |");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
                        System.out.println(" Number\t\t\t Name\t\t\tAdress\t\t\tPhone Number\t\t\tStudent Number\t\tMajor\t\t\tDOB\t" );
                        for (Mahasiswa m : mshList) {
                            System.out.print("[" + m.getNumberMhs() + "\t\t\t");
                            System.out.print(m.getName() + "\t\t\t");
                            System.out.print(m.getAddress() + "\t\t\t");
                            System.out.print(m.getPhoneNumber() + "\t\t\t");
                            System.out.print("\t"+m.getMhs() + "\t\t\t");
                            System.out.print(m.getMajor() + "\t\t\t");
                            System.out.println(m.getDOB() + "]");
                        }
                    } else {
                        System.out.println("The Number You Selected Isn't Available");
                    }
                    break;

                case 3:
                    String day;
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("|                              SCHEDULE                              |");
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("\tLECTURER ID\t COURSE CODE\t COURSE NAME\t\t\t\t\tROOM\t\t");
                    System.out.println("\t1222\t\t MATH6031\t\t CALCULUS\t\t\t\t\t\t10LA\t");
                    System.out.println("\t2231\t\t COMP6048\t\t DATA STRUCTURES\t\t\t\t10LA\t");
                    System.out.println("\t3440\t\t COMP6800\t\t HUMAN AND COMPUTER\t\t\t\t10LC\t");
                    System.out.println("\t5687\t\t COMP6820\t\t OBJECT ORIENTED PROGRAMMING\t10LB\t");
                    System.out.println("\t6897\t\t MATH6183\t\t SCIENTIFIC COMPUTING\t\t\t10LB\t");

                    do {
                        System.out.print("Select Day [Monday|Tuesday|Wednesday|Thursday|Friday]: ");
                        day = scan1.nextLine();
                    }while(day.equals("Saturday")||day.equals("Sunday"));

                    System.out.println("----------------------------------------------");
                    System.out.println("COURSE NAME\t\t\t\t\t\t\tTIME");
                    System.out.println("----------------------------------------------");
                    if (day.equals("Monday")) {
                        System.out.println("CALCULUS\t\t\t\t\t\t07.15-08.30");
                        System.out.println("OBJECT ORIENTED PROGRAMMING\t\t09.15-11.30");
                        System.out.println("----------------------------------------------");
                    }else if(day.equals("Tuesday")){
                        System.out.println("HUMAN AND COMPUTER\t\t\t\t07.30-09.45");
                        System.out.println("----------------------------------------------");
                    }else if(day.equals("Wednesday")){
                        System.out.println("DATA STRUCTURES\t\t\t\t\t08.15-10.30");
                        System.out.println("SCIENTIFIC COMPUTING\t\t\t11.15-13.30");
                        System.out.println("----------------------------------------------");
                    }else if(day.equals("Thursday")){
                        System.out.println("HUMAN AND COMPUTER\t\t\t\t07.30-09.45");
                        System.out.println("CALCULUS\t\t\t\t\t\t11.15-13.30");
                        System.out.println("----------------------------------------------");
                    }else{
                        System.out.println("CALCULUS\t\t\t\t\t\t07.15-08.30");
                        System.out.println("DATA STRUCTURES\t\t\t\t\t09.15-11.30");
                        System.out.println("----------------------------------------------");
                    }
                break;
                case 4:
                    System.out.println("Whose Data Do You Want to Search?");
                    System.out.println("1. Dosen");
                    System.out.println("2. Mahasiswa");
                    System.out.print(">> ");
                    search = scan.nextInt();

                    if (search == 1) {
                        boolean found = false;
                        System.out.print("Enter LECTURER NUMBER to Search : ");
                        int id_dosen = scan.nextInt();
                        System.out.println("-------------------------------------");

                        Iterator<Dosen> i = dosenList.iterator();
                        i = dosenList.iterator();
                        while (i.hasNext()) {
                            Dosen e = i.next();
                            if (e.getDosen() == id_dosen) {
                                System.out.println(e);
                                found = true;
                            }
                        }
                        if (!found) {
                            System.out.println("Data Not Found");
                        }
                        System.out.println("-------------------------------------");

                    } else if (search == 2) {
                        boolean found = false;
                        System.out.print("Enter STUDENT NUMBER to Search : ");
                        int numberMhs = scan.nextInt();
                        System.out.println("---------------------------------------------------------");

                        Iterator<Mahasiswa> i = mshList.iterator();
                        i = mshList.iterator();
                        while (i.hasNext()) {
                            Mahasiswa e = i.next();
                            if (e.getNumberMhs() == numberMhs) {
                                System.out.println(e);
                                found = true;
                            }
                        }
                        if (!found) {
                            System.out.println("Data Not Found");
                        }
                        System.out.println("---------------------------------------------------------");
                    } else {
                        System.out.println("The Number You Selected Isn't Available");
                    }
                    break;

                case 5:
                    System.out.println("Whose Data Do You Want to Delete?");
                    System.out.println("1. Dosen");
                    System.out.println("2. Mahasiswa");
                    System.out.print(">> ");
                    search = scan.nextInt();

                    if (search == 1) {
                        boolean found = false;
                        System.out.print("Enter LECTURER NUMBER to Delete : ");
                        int id_dosen = scan.nextInt();
                        System.out.println("-------------------------");

                        Iterator<Dosen> i = dosenList.iterator();
                        i = dosenList.iterator();

                        while (i.hasNext()) {
                            Dosen e = i.next();
                            if (e.getDosen() == id_dosen) {
                                i.remove();
                                found = true;
                            }
                        }

                        if (!found) {
                            System.out.println("Data Not Found");
                        } else {
                            System.out.println("Data is Deleted Successfully!");
                        }
                        System.out.println("-------------------------");

                    } else if (search == 2) {
                        boolean found = false;
                        System.out.print("Enter STUDENT NUMBER to Delete : ");
                        int numberMhs = scan.nextInt();
                        System.out.println("-------------------------");

                        Iterator<Mahasiswa> i = mshList.iterator();
                        i = mshList.iterator();

                        while (i.hasNext()) {
                            Mahasiswa e = i.next();
                            if (e.getNumberMhs() == numberMhs) {
                                i.remove();
                                found = true;
                            }
                        }

                        if (!found) {
                            System.out.println("Data Not Found");
                        } else {
                            System.out.println("Data is Deleted Successfully!");
                        }
                        System.out.println("-------------------------");
                    } else {
                        System.out.println("The Number You Selected Isn't Available");
                    }
                    break;

                case 6:
                    System.out.println("Whose Data Do You Want to Update?");
                    System.out.println("1. Dosen");
                    System.out.println("2. Mahasiswa");
                    System.out.print(">> ");
                    search = scan.nextInt();

                    if (search == 1) {
                        boolean found = false;
                        System.out.print("Enter LECTURER NUMBER to Update : ");
                        int id_dosen = scan.nextInt();
                        System.out.println("-------------------------");

                        ListIterator<Dosen> i = dosenList.listIterator();

                        while (i.hasNext()) {
                            Dosen e = i.next();
                            if (e.getDosen() == id_dosen) {
                                System.out.print("Enter new NIDN: ");
                                String NIDN = scan1.nextLine();

                                System.out.print("Enter new Name: ");
                                String name = scan1.nextLine();

                                System.out.print("Enter new Address: ");
                                String address = scan1.nextLine();

                                System.out.print("Enter new Phone Number: ");
                                String phoneNumber = scan1.nextLine();

                                i.set(new Dosen(name, address,phoneNumber,id_dosen));
                                found = true;
                            }
                        }

                        if (!found) {
                            System.out.println("Data Not Found");
                        } else {
                            System.out.println("Data is Updated Successfully!");
                        }
                        System.out.println("-------------------------");

                    } else if (search == 2) {
                        boolean found = false;
                        System.out.print("Enter STUDENTS NUMBER to Update : ");
                        int numberMhs = scan.nextInt();
                        System.out.println("-------------------------");

                        ListIterator<Mahasiswa> i = mshList.listIterator();

                        while (i.hasNext()) {
                            Mahasiswa e = i.next();
                            if (e.getNumberMhs() == numberMhs) {

                                System.out.println("Enter New NIM: ");
                                String id_mhs = scan1.nextLine();

                                System.out.print("Enter new Name: ");
                                String name = scan1.nextLine();

                                System.out.print("Enter new Address: ");
                                String address = scan1.nextLine();

                                System.out.print("Enter new Phone Number: ");
                                String phoneNumber = scan1.nextLine();

                                System.out.print("Enter new Major: ");
                                String Major = scan1.nextLine();

                                System.out.print("Enter new Date of Birth: ");
                                String DOB = scan1.nextLine();

                                i.set(new Mahasiswa(name, Major,DOB,address,phoneNumber, id_mhs, numberMhs));
                                found = true;
                            }
                        }

                        if (!found) {
                            System.out.println("Data Not Found");
                        } else {
                            System.out.println("Data is Updated Successfully!");
                        }
                        System.out.println("-------------------------");
                    }else{
                        System.out.println("The Number You Selected Isn't Available");
                    }
                    break;

                case 7:
                    int id_mhs;

                    System.out.println("I'm here for help you calculate your IPK");

                    double UTS, UAS, Assigment;

                    System.out.printf("Enter Your Student ID: ");
                    id_mhs= scan.nextInt();

                    do {
                        System.out.printf("1. UTS :");
                        UTS = scan.nextDouble();
                    }while (UTS > 100 || UTS < 1);

                    do {
                        System.out.printf("2. UAS : ");
                        UAS = scan.nextDouble();
                    }while (UAS >  100 || UAS < 1);

                    do {
                        System.out.printf("3. Assigment : ");
                        Assigment = scan.nextDouble();
                    }while (Assigment > 100 || Assigment < 1);

                    double Calcu = ((UTS*0.35) + (UAS*0.4) + (Assigment*0.25));


                    System.out.println("Student with ID "+id_mhs);
                    System.out.println("Your Total Score is  "+Calcu);

                    if (Calcu > 89 && Calcu <=100 ){
                        System.out.println("with weight 4.00");
                    } else if (Calcu >84 && Calcu <90) {
                        System.out.println("With weight 3.67");
                    } else if (Calcu >79 && Calcu <= 84) {
                        System.out.println("With weight 3");
                    } else if (Calcu > 69 && Calcu <=69) {
                        System.out.println("With weight 2.5");
                    }else {
                        System.out.println("You failed, Work Harder!!");
                    }

                    break;

                case 8:
                    String Absen,name;

                    System.out.println("please Enter your presence");

                    System.out.printf("Enter Your name: ");
                    name = scan1.nextLine();

                    System.out.printf("Enter Your Student ID: ");
                    id_mhs= scan.nextInt();

                    System.out.printf("Input your permission ");
                    Absen = scan1.nextLine();

                    System.out.println(name+" with student id "+ id_mhs +" your descreption "+Absen);
                    break;
                case 9:
                    System.out.println("Thank You For Using This Program. I Hope U Have a Good Day!!");
                    break;
                default:
            }
        }while(choose<9);
    }
}


