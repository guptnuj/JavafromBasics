import java.util.Scanner;

public class Printstars {
    public static void main(String[] args) {
        System.out.println("Enter number of Stars you want?");
        Scanner sc = new Scanner(System.in);
        int nooftimes = sc.nextInt();

        for (int i=nooftimes;i>0;i--) {
            for (int a = 0; a < i; a++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }

        for (int i=0;i<nooftimes;i++) {
            for (int j =0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }
}
