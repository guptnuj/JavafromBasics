import java.util.Scanner;

public class Sumofevennumbers {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("You entered "+ n);

        int sum = 0;
        int i =1;
        while (sum<n){

            int even = 2*i;
            sum = sum +even;
            System.out.println(even);
            i++;
        }
        System.out.println("total sum is " +sum);
    }
}
