public class Two_Sum_Optimal_Approach {
    static boolean Optimal(int arr[] , int t){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == t) return true;
            else if (sum < t) left++;
            else right--;


        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {-1, 2, 3, 5};
        int tar = 2;
        boolean ans = Optimal(arr, tar);
        System.out.println(ans);

    }
}
