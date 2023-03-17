import java.util.Scanner;

public class printstarss {

    public static void main(String[] args) {
        System.out.println("Enter number of Stars you want?");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        while (i>=1) {
            int j = 1;
            while( j<=i){

                System.out.print("*");

                j++;

            }

            i--;
            System.out.println("\n");
        }
    }

}
