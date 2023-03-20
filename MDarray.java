public class MDarray {
    public static void main(String[] args) {
        int[][] a ={{1,2,3},
                     {2,3,5}};

            int[][] b = {{2,5,77},
                        {7,99,0}};
            int[][] result = new int[2][3];
        for (int i =0;i< a.length;i++){
            for (int c=0;c<a[i].length;c++){
                result[i][c] = a[i][c] +b[i][c];
                System.out.printf("Added element at %d and %d \n",i,c);
                System.out.println(result[i][c]);
            }
        }


    }
}
