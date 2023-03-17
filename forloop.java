import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {

        System.out.println("Enter number till you want to get odd numbers:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i=0;i<number; i++) {

           int  oddnumber = 2*i+1;
            System.out.println(oddnumber);
        }
    }
}