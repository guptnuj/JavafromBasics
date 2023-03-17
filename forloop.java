import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {

        System.out.println("Enter number till you want to get numbers:");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        for(int i=1;i <=b; i++) {
            System.out.println(i);
        }
    }
}