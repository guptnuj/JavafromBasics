public class maxelement {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int i,temp = 0;
        for (i=0;i< a.length;i++){
            if (a[i]>temp){
                temp = a[i];
            }

        }

        System.out.println(temp);
    }
}