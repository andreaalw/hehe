import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> cars = new ArrayList<>();
        int umur;
        try {
            do {
                System.out.print("Input umurrr: ");
                umur = scan.nextInt();
            }while(umur <1 || umur > 90);
            cars.add("mirjak");
            cars.add("omai omaigad");
            System.out.println(cars);
        }catch(IndexOutOfBoundsException e){
            System.out.println(e);
//
        }

    }
}
