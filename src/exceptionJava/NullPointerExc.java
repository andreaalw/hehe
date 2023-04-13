package exceptionJava;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class NullPointerExc {
    public static void main(String[] args) {
//        Boolean sprintHello = null;
//        if(sprintHello){
//            System.out.println("Hello");
//        }

//        List<String>favo= new ArrayList<>();
//        for (String burger : favo){
//            System.out.println(burger);
//        }

//        String[] pets = {"dogs", "cats", "monkey"};
//        System.out.println(pets[3]);

//        int i = "alex";

//        ArrayList<String> list = new ArrayList<>();
//        list.get(0);

//        ArrayList<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//
//        Iterator<String> it = list.iterator();
//        it.remove();

//        FileReader fileReader = new FileReader("Test.txt");
//        System.out.println(fileReader.read());
//        fileReader.close();


        int[] arrayData = {0,1,2,3,4};

        Scanner sc = new Scanner(System.in);

        System.out.println("data ke-: ");
        int indexInput = sc.nextInt();

        //exception biasa
        System.out.println("exception biasa");
        try {
            System.out.printf("data dari array ke -%d adalah %d\n\n", indexInput,arrayData[indexInput]);
        }catch (Exception e){
            System.err.println(e);
        }

        //exception dalam fungsi
        System.out.println("exception dalam fungsi");
        int data = ambildata(arrayData,indexInput);
        System.out.printf("data dari array ke -%d adalah %d\n\n", indexInput,data);

        // Exception Thriow by method
        System.out.println("exception by method");
        int data2 = 0;
        try {
            data2 = ambildataAr(arrayData,indexInput);
        }catch (Exception e){
            System.err.println(e);
        }

        System.out.printf("data dari array ke -%d adalah %d\n\n", indexInput,data2);
        System.out.println("\n\nakhir dari program");
    }

    private static int ambildataAr(int[] array, int index)throws Exception{
        int hasil = array[index];
        return hasil;
    }
    private static int ambildata(int[] array, int index) {
        int hasil =0;
        try {
            hasil = array[index];
        } catch (Exception e) {
            System.err.println(e);
        }
        return hasil;
    }
}
