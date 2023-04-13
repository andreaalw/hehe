package SL_1;

import java.util.Scanner;

public class timeangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String time = input.nextLine();

        double jam = Integer.parseInt(time.substring(0,3));
        double menit = Integer.parseInt(time.substring(3,5));

        menit = (menit/60)*360;
        jam = (jam/12)*360 + (menit/60)*(360/12);

        double sudut = Math.abs(menit - jam);

        double hasil = Math.min(360-sudut,sudut);

        System.out.println(Math.abs(hasil));
    }
}
