import java.util.Scanner;

public class table {

    public static void main(String[] args) {
        System.out.println("enter number:");
        Scanner sc = new Scanner(System.in);
        int tablenumber = sc.nextInt();

        for (int i = 10; i>0; i--) {
            int value = (tablenumber*i);
            System.out.println(tablenumber + " * "+ i +"=" + value);
        }
    }
}
