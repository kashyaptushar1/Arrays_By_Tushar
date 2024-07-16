public class Maximum_SubArray_Sum {
//    static int Optimal_Solution(int arr[]){
//        int n = arr.length;
//        int max = Integer.MIN_VALUE;
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum += arr[i];
//            if(sum > max){
//                max = sum;
//            }
//            if(max < 0){
//                sum = 0;
//            }
//
//        }
//        return max;
//    }

    static int Optimal_Solution(int arr[]){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (sum == 0) start = i;
            sum += arr[i];
            if (sum > max) {
                ansStart = start;
                ansEnd = i;
                max = sum;
            }
            if (max < 0) {
                sum = 0;
            }

        }
        System.out.println("The subArray is : ");
        for (int j = ansStart; j <= ansEnd; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1, -2,1,5,-3};
        int ans = Optimal_Solution(arr);
        System.out.println(ans);

    }
}
