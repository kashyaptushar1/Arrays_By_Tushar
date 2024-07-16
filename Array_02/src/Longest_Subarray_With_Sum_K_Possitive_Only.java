import java.util.*;
public class Longest_Subarray_With_Sum_K_Possitive_Only {
//    static int Brute_Approach(int arr[] , int K){
//        int n = arr.length;
//        int len = 0;
//        for (int i = 0; i < n; i++) {
//            long s = 0;
//
//            for (int j = i; j < n; j++) {
//                s += arr[j];
//                if (s == K) len = Math.max(len , j-i+1);
//            }
//        }
//        return len;
//    }


//    public static int Batter_Approach(int []a, long k) {
//        int n = a.length;
//        Map<Long, Integer> preSumMap = new HashMap<>();
//        long sum = 0;
//        int maxLen = 0;
//        for (int i = 0; i < n; i++) {
//            sum += a[i];
//            if (sum == k) {
//                maxLen = Math.max(maxLen, i + 1);
//            }
//            long rem = sum - k;
//            if (preSumMap.containsKey(rem)) {
//                int len = i - preSumMap.get(rem);
//                maxLen = Math.max(maxLen, len);
//            }
//            if (!preSumMap.containsKey(sum)) {
//                preSumMap.put(sum, i);
//            }
//        }
//
//        return maxLen;
//    }


    public static int Optimal_Solution(int []a, long k) {
        int n = a.length;

        int left = 0, right = 0;
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if (right < n) sum += a[right];
        }

        return maxLen;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,1,4,2,3};
        int k = 6;
        int ans = Optimal_Solution(arr,k);
        System.out.println(ans);
    }
}
