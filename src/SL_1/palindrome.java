package SL_1;

import org.w3c.dom.ls.LSInput;
//package main;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();

//        System.out.println("input = " + input); // buat scan string
        String temp = "";

        for (int i =input.length()-1;i>=0;i--){
            char c = input.charAt(i);
            temp += String.valueOf(c);
        }
        if(input.equals(temp)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
