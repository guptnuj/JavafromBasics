import jdk.dynalink.beans.StaticClass;

import javax.swing.*;

public class Practice {


//   Problem 1 was to make method to get table of number - do it on own
//   Problem #2 - star pattern
//    static void star(int n){
//
//        for (int i =1;i<=n;i++){
//            for (int j = 1;j<=i;j++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//            }
//    }
    //Problem 3 - recursive function to sum n numbers
        static  int  Problem3(int n) {
            int j = 0;
            if(n <= 1){
                return 1;
            }


                return n + Problem3(n - 1);





        }
        public static void main(String[] args) {
//star(4); //Problem 2 - Method calling

     int c =  Problem3(1000);
        System.out.println(c);

    }
}
