import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {

        System.out.println("Enter number till you want to get odd numbers:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int oddnumber = 0;
        int i = 0;

        while (oddnumber<number-2)
    {
            oddnumber = 2*i+1;
            i++;
            System.out.print(oddnumber);
        }

    }
}