public class Spiral_Matrix_Traversal {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4,5,6}};
        int r = arr.length;
        int c = arr[0].length;
        int top = 0;
        int left = 0;
        int right = c-1;
        int bottom = r-1;
       while(top <= bottom && left <= right){
           // left to right
           for (int i = left; i <=right; i++) {
               System.out.print(arr[top][i]+" ");
           }
           top++;
           // top to bottom
           for (int i = top; i <= bottom ; i++) {
               System.out.print(arr[i][right] +" ");
           }
           right--;
           // right to left
           if(top <= bottom){
               for (int i = right; i >=left ; i--) {
                   System.out.print(arr[bottom][i]+" ");
               }
               bottom--;
           }
           for (int i = bottom; i >=top ; i--) {
               System.out.print(arr[i][left]+" ");
           }
           left++;

       }


    }
}
