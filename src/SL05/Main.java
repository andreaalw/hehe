package SL05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int menu;
        Scanner sc = new Scanner(System.in);
        boolean check = true;

        do{
            System.out.println("Hello welcome to Yaya Bank");
            System.out.println("please select a menu");
            System.out.println("1.Savings");
            System.out.println("2.Deposit");
            System.out.print(">>");
            menu = sc.nextInt();

            switch (menu){
                case 1:

                    break;
                case 2:
                    break;
            }
        }while(menu!=3);


    }
}
