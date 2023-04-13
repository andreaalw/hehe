import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        System.out.println("Masukan total Angka yang diurut ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println("====");
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        System.out.println("Masukan pilihan anda[1-2]");
        int pil = scan.nextInt();
        
//        int i;
        
        switch (pil){
            case 1:
                for (int i = 1; i <= n; i++) {
                    System.out.println(i);
                }
                break;
            case 2:
                for (int i = n; i > 0 ; i--) {
                    System.out.println(i);
                }
                break;
        }
    }
}
