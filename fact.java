import java.util.Scanner;

public class fact {
        public static void main(String[] args) {


            System.out.println("enter number");
            Scanner sc = new Scanner(System.in);
            int g = sc.nextInt();
            int c = 1;
            for (int i=g;i>0;i--){

                c  =c* i;

            }
            System.out.println("after for " + c);
        }
    }

