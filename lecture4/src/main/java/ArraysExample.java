public class ArraysExample {
    public static void main(String[] args) {
        int [][] a = new int [3][5];
        
        a[0] = new int[5];
        a[1] = new int[3];
        a[2] = new int[5];

        //System.out.println(a[1][2]); 
        
        int c [] = {3, 5, 5, 5};
        
        int b [][] =  {
            new int [] {1, 2, 4},
            new int [] {2, 5, 6, 6}
        };

        System.out.println(b[1][2]);
    }
}
