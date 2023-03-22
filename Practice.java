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
//        static  int  Problem3(int n) {
//            int j = 0;
//            if(n <= 1){
//                return 1;
//            }
//
//
//                return n + Problem3(n - 1);
//        }


    // Problem 4 - reverse star
    static void star22(int n){

        for(int i=n;i>=1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
        public static void main(String[] args) {
//star(4); //Problem 2 - Method calling

            star22(4); //problem 4



//     int c =  Problem3(1000);// Problem 3
//        System.out.println(c);// Problem 3

    }

}
