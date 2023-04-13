package SL_1;

import java.util.Arrays;
import java.util.Scanner;

public class slGpa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ncase = input.nextInt();
        Double[] ipk =new Double[ncase];

        for (int i = 0; i < ncase; i++) {
            ipk[i] = input.nextDouble();
        }

        int count = 1; //gagerak
        int count2 = 1; //gerak

        Arrays.sort(ipk);
        for (int i = ncase - 1; i >= 0; i--) {
            if (i > 0) {
                if (ipk[i].equals(ipk[i - 1])) {
                    System.out.println(""+count+String.format(" %.2f",ipk[i]));
                    count2++;
                }else{
                    System.out.println(""+count+String.format(" %.2f",ipk[i]));
                    count = count2;
                    count++;
                    count2++;
                }
            }else{
                if (ipk[i].equals(ipk[i + 1])){
                    System.out.println(""+count+String.format(" %.2f",ipk[i]));
                    count2++;
                }else{
                    System.out.println(""+count+String.format(" %.2f",ipk[i]));
                    count = count2;
                    count++;
                    count2++;
                }
            }
        }
    }
}
