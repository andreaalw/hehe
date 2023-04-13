package SL_1;
import java.util.Scanner;
public class time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String time = input.nextLine();
//        Double time = input.nextDouble();

        double jam = Integer.parseInt(time.substring(0,2));
        double menit = Integer.parseInt(time.substring(3,5));

        double minut = (menit/60)*360;
        double hour = (jam/12)*360 + (menit/60)*(360/12);

        double sudut = Math.abs(minut - hour);

        double hasil = Math.min(360-sudut,sudut);

        System.out.println(Math.abs(hasil));
    }
}
