import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class limajan {
    public static void main(String[] args) {
        //ini pertemuan tanggal 10 januari sama pa harvey

        int arr[] = new int[100];
        arr[0] = 123;
//        System.out.println(arr[0]);

        int[][] duaD = new int[10][10];
        array_list();

    }
    static Scanner sc = new Scanner(System.in);
    //method
    static void array_list(){
        ArrayList<Integer> score = new ArrayList<Integer>();//kalo yang kanan gaada integer nya juga gapap
        //beda fungsi tapi namanya sama add()
        score.add(100); //pushTail
        score.add(0,456); // pushMid

        // method overloading / func overloading
        // SYARAT : beda jumblah parameter, nama func nya sama, beda tipe data parameter.
        score.set(1,999);//menimpa
        System.out.println(score.get(0));//indexing dari 0-
        System.out.println(score.get(1));
        //remove
        for (int i = 0; i < 100; i++) {
            score.add((int)(Math.random()*1000));
            //dikalikan dulu baru di typecase ke integer
        }
//        Collections.sort(score); //sorting yang enak
//        score.sort(limajan::compare);//sedikit rewel jangan lah, harus pake pembanding
        //kalo sorting dari class pake object itu udah beda ya.
        score.sort(Integer::compareTo);//ga perlu pake function.
        for (int i = 0; i < score.size(); i++) {
            System.out.println(score.get(i));
        }
        score.remove(0); //pop head
        score.remove(score.size()-1); //pop tail
        System.out.println(score.get(0));
        System.out.println("size : "+score.size());
        score.clear();//pop_all
        System.out.println("size: "+score.size());
//        System.out.println(score.get(0));//error IndexOutOfBounds
    }

    static void vektor(){
        Vector<String> ppti = new Vector<>();
        ppti.add("Andrea");
        ppti.add(1,"Dino");
//        ppti
        System.out.println();

    }

    static int compare(int a, int b){
        if (a == b)return 0;
        if(a>b)return -1; //kalo mau jadi dibalik itu jadi (a>b) dari besar kek kecil
        return 1;
    }
}
