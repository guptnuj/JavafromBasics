import jdk.dynalink.beans.StaticClass;



public class method {

    //Creating method unstatic with same name but different parameters
    int um(int a, int b){
        int  c = a+b;
        System.out.println(c);
        return 2;
    }
    int um(int a){

        System.out.println(a);
        return 1;
    }
    int um(int a, int b,int c){
        int  z = a+b+c;
        System.out.println(z);
        return 3;
    }

   public static void main(String[] args) {
    //calling method

       method objjj  =new method();

       int gumm =objjj.um(3,4);
       int gum =objjj.um(2);
       int gu = objjj.um(13,4,6);
       System.out.println(gumm);

       //can create multiple methods with same name but parameters should be different


    }
}
