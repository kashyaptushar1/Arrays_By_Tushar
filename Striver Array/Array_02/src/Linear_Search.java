public class Linear_Search {
    static int Solution(int arr[] , int n){
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == n){
                idx = i;
                return idx;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7,8,9};
        int ans = Solution(arr,9);
        System.out.println(ans);

    }
}
