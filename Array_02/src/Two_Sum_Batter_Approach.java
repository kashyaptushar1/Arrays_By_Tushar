import java.util.HashMap;

public class Two_Sum_Batter_Approach {
    static int[] Batter_Solution(int arr[] , int t){
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int moreNeeded = t - num;
            if (mpp.containsKey(moreNeeded)){
                ans[0] = mpp.get(moreNeeded);
                ans[1] = i;
                return ans;

            }
            mpp.put(arr[i],i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,6,8,11};
        int t = 14;
        int ans[] = Batter_Solution(arr,t);
        for(int val : ans){
            System.out.print(val+" ");
        }
    }
}
