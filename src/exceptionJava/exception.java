package exceptionJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class exception {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        int n = input.nextInt();
        int[] array = new int[angka];

//        System.out.println("ini angka nya : " + angka);
//        System.out.println("geser nya berapa kali: " + geser);
        for (int i = 0; i < angka; i++) {
            array[i] = input.nextInt();
        }

//        int panjang = array.length;
        n = n%angka;
        int[] masuk = new int[angka];

        for (int j = 0; j < angka; j++) {
            masuk[(n+j)%angka] = array[j];
        }
//        System.out.println("Sesudah dirotasi: ");
        System.out.println(Arrays.toString(masuk));
//        for (int i = 0; i < angka; i++) {
//            System.out.println(""+masuk[i]);
//        }
    }
}