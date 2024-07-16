public class Left_Rotate_The_Array_by_One_Place {
    static void Solution(int arr[]){
        int n = arr.length;
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +" ");
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        Solution(arr);


    }
}
