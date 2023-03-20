public class reversearray {
    public static void main(String[] args) {

        int[] a ={1,2,3,4,5};

        int l = a.length;
       int  s = Math.floorDiv(l,2);
       int temp;
       int i;


        for (i=0;i<s;i++) {
            System.out.println("asdf");
            temp = a[i];
            a[i] = a[l-i-1];
            a[l-i-1] = temp;
        }
        for (int element:a)
        {
            System.out.print(element);
        }



    }
}