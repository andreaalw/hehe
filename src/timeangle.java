import javax.swing.table.TableStringConverter;
import java.util.Scanner;

import static java.lang.Math.abs;

public class timeangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hh = sc.nextInt();
        int mm = sc.nextInt();

        double hasil = ((hh * 60) + mm) * 0.5;
        double hasil2 = mm * 6;

        double net_angle = Math.abs(hasil - hasil2);
        if (net_angle < 360 - net_angle) {
            System.out.println(net_angle);
        } else {
            System.out.println(360-net_angle);
        }
    }
}

