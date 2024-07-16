public class Best_Time_To_Buy_And_Sell_Stock_By_dynamic_Programming {
    static int Solution(int arr[]){
        int maxProfit = 0;
        int mini = arr[1];
        for (int i = 1; i < arr.length; i++) {
            int curProfit = arr[i] - mini;
            maxProfit = Math.max(maxProfit , curProfit);
            mini = Math.min(mini , arr[i]);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
    int arr[] = {7,1,5,3,6,4};
    int ans = Solution(arr);
        System.out.println(ans);
    }
}
