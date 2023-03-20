public class arraypractice {
    public static void main(String[] args) {
       float  sum = 0;
        float[] arr = {1.0f,1.5f,2.6f,5.4f,2.9f};
        for (int i=0;i< arr.length;i++){

            sum = sum+arr[i];
           // System.out.println(sum);
        }
        System.out.println(sum/ arr.length);
    }

}
