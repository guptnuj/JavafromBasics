public class array {
    public static void main(String[] args) {

//accessing array using for loop

        int [] a = new int[6]; //intializing array
        a[0] =98;
        System.out.println(a[1]);
        for (int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }

        //Using foreach loop to access array elements
        for (int element: a
             ) {
            System.out.println(element);

        }
    }
}
