import java.util.Scanner;

public class While {

    public static void main(String[] args) {


        System.out.println("While loop will execute number of time you want but not more than 10 times");
        System.out.println("Enter no. of time you want to run");
        Scanner sc = new Scanner(System.in);
        int numberoftimes =sc.nextInt();

        // While loop
        while (numberoftimes<10){
            System.out.println("Anuj is Great");
            numberoftimes++;
        }

        // DO wHile
        do {
            System.out.println("Anuj does great work");
            numberoftimes++;
        }
        while(numberoftimes<10);



    }
}
