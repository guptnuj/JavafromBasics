import java.util.Scanner;

public class fibonacci {

    static int fib(int a) {

        if (a == 1 || a == 2) {
            return a - 1;

        } else {


            int  k= fib(a-1) + fib(a-2);

           return k;
        }

    }

    public static void main(String[] args) {


int j = fib(11);

        System.out.println(j);



//        int a =0;
//        int b =1;
//        System.out.print(a+" " +b+ " ");
//        for (int i=1;i<10;i++){
//           int  c =a+b;
//            System.out.print(c+ " ");
//            a =b;
//            b = c;

       }



    }

