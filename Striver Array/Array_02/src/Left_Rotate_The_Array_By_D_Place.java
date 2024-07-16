public class Left_Rotate_The_Array_By_D_Place {
//    static void BruteSolution(int arr[] , int d){
//        int n = arr.length;
//        d = d%n;
//
//        int temp[] = new int[d];
//        for (int i = 0; i < d; i++) {
//            temp[i] = arr[i];
//        }
//        for (int i = d; i <n; i++) {
//            arr[i-d] = arr[i];
//        }
//        for (int i = 0; i < n-d; i++) {
//            System.out.print(arr[i] +" ");
//        }
//        for (int i = 0; i < d; i++) {
//            System.out.print(temp[i] +" ");
//        }
//
//    }
    static void Reverse(int arr[] , int start , int end){
        // Two pointer approach to reverse the array
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void Optimal_Approach(int arr[] , int d){
        int n = arr.length;
        d = d%n;

        Reverse(arr,0,d-1);
        Reverse(arr,d,n-1);
        Reverse(arr,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
//        BruteSolution(arr,15);
        Optimal_Approach(arr,3);

    }
}
