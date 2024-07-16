import java.util.Scanner;

public class Print_The_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int r = sc.nextInt();
        System.out.print("Enter the column: ");
        int c = sc.nextInt();
        int mat[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the Element: ");
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("THis is the matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(mat[i][j] +" ");

            }
            System.out.println();
        }

    }
}
