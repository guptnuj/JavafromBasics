import jdk.dynalink.beans.StaticClass;



public class method {

    //Creating method unstatic
    int um(int a, int b){
        int  c = a+b;
        System.out.println(c);
        return 2;
    }

   public static void main(String[] args) {
    //calling method

       method objjj =new method();
       int   gumm =objjj.um(3,4);
       System.out.println(gumm);
    }
}
