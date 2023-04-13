package SL04Baru;

import java.util.ArrayList;
import java.util.Scanner;

public class Course {
    protected String mapel;
   protected String tipe;
//    int nilai;

    public String getMapel() {
        return mapel;
    }

    public String getTipe() {
        return tipe;
    }

    Scanner sc = new Scanner(System.in);

    Course(String mapel,String tipe){
        this.mapel = mapel;
        this.tipe = tipe;
    }


    void view(){
//        addCourse();
        System.out.println("Choose Your Courses: ");
        System.out.println("1. Matematika");
        System.out.println("2. Indonesia");
        System.out.println("3. IPA");

    }

    void input(Scanner sc){

// kata dia: aku gunanya apa ya kak?
    }





}
