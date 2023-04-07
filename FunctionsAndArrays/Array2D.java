public class Array2D {
    public static void main(String[] args) {
        int[][] a = new int[3][3]; 
        int row = 3;
        int col = 3;
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        a[1][0] = 4;
        a[1][1] = 5;
        a[1][2] = 6;
        a[2][0] = 7;
        a[2][1] = 8;
        a[2][2] = 9;
    
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < a.length; i++) {
            if (col % 2 == 0) {
                for (int j = 0; j < a.length; j++) {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            else {
                for (int j = a.length; j < 0; j--) {
                    System.out.print(a[j][i] + " ");
                }
                System.out.println();
            }
        }



    }    
}
