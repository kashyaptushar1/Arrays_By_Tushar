public class Set_Matrix_Zero_Brute {
    static void row(int mat[][] , int i , int r , int c) {
        for (int j = 0; j < c; j++) {
            if(mat[i][j] == 1){
                mat[i][j] = -1;
            }

        }
    }
    static void col(int mat[][] , int j , int r , int c) {
        for (int i = 0; i < r; i++) {
            if(mat[i][j] == 1){
                mat[i][j] = -1;
            }

        }
    }
    public static void main(String[] args) {
        int mat[][] = {{1,1,1,1} , {1,0,0,1},{1,1,0,1},{1,1,1,1}};
        int r = mat.length;
        int c = mat[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == 0){
                    row(mat,i, r , c);
                    col(mat,j, r , c);
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == -1){
                    mat[i][j] = 0;
                }
            }
        }
        System.out.println("Print The Matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
