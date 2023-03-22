public class varags {

    //creating method which will take unlimited parameteres
    static int varc(int ...arr){

       int  result=0;

        for (int a:arr) {
            result+=a;


        }
        return result;
    }

    public static void main(String[] args) {

        //giving multiple parameteres everytime but still it's taking
        System.out.println(varc(1,3,24,36,47,585,8));
        System.out.println(varc());
        System.out.println(varc(1,22,4));
        System.out.println(varc(1,5,7));
    }
}
