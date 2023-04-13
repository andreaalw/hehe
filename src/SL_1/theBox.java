package SL_1;

import java.util.Scanner;

public class theBox {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        int input = n.nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <=input ; j++) {
                if(i == 0 || j == 0 || i == j){
                    System.out.printf("*");
                }else{
                    System.out.printf(" ");
                }
            }
            System.out.println("");
        }
    }
}
