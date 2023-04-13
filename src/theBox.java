import java.util.Scanner;

public class theBox {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
       int input = n.nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <=input ; j++) {
                if(i == 1 || j == 1 || i == j || i == input || j == input || i + j == input + 1){
                    System.out.printf("*");
                }else{
                    System.out.printf(" ");
                }
            }
            System.out.println("");
        }
    }
}
