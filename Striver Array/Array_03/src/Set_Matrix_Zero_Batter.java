public class Set_Matrix_Zero_Batter {
    static int[][] Batter_Approach(int mat[][] , int r , int c){
        int row[] = new int[r];
        int col[] = new int[c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(row[i] == 1 || col[j] == 1){
                    mat[i][j] = 0;
                }
            }
        }
        return mat;
    }
    public static void main(String[] args) {
        int mat[][] = {{1,1,1,1},{1,0,0,1},{1,1,0,1}};
        int r = mat.length;
        int c = mat[0].length;
        int ans[][] = Batter_Approach(mat , r , c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(mat[i][j] +"  ");
            }
            System.out.println();
        }

    }
}
