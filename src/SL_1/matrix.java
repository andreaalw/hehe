package SL_1;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][]matrix = new int[5][5];

        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        int ncase = input.nextInt();
        int m = 0;
        int k = 0;
        int v = 0;
        for (int i = 0; i < ncase; i++) {
            m = input.nextInt();
            k = input.nextInt();
            v = input.nextInt();

            if(m == 0){
                for (int j = 0; j < 5; j++) {
                    matrix[k][j]  += v;
                }
            } else if (m == 1) {
                for (int j = 0; j < 5; j++) {
                    matrix[j][k] += v;
                }
            }
        }
       int sum = 0;
        int min = 0;
        int max = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
//                System.out.print(matrix[i][j]+" ");
                sum += matrix[i][j];
                min = Math.min(min,matrix[i][j]);
                max = Math.max(max, matrix[i][j]);
            }
//            System.out.println();
        }
        System.out.println(""+sum+" "+min+" "+max);
    }
}
