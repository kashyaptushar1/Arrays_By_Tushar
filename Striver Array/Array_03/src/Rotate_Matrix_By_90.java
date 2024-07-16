import java.util.Scanner;

public class Rotate_Matrix_By_90 {
//    static void Brute_Approach(int mat[][],  int r , int c){
//        int ans[][] = new int[c][r];
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c; j++) {
//                ans[j][(r-1)-i] = mat[i][j];
//            }
//        }
//        for (int i = 0; i < c; i++) {
//            for (int j = 0; j < r; j++) {
//                System.out.print(ans[i][j] +" ");
//            }
//            System.out.println();
//        }
//    }

    static void Optimal_Approach(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row: ");
        int r = sc.nextInt();
        System.out.println("Enter the col: ");
        int c = sc.nextInt();
        int mat[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter the Element: ");
                mat[i][j] = sc.nextInt();

            }
        }
        Optimal_Approach(mat);

    }
}
