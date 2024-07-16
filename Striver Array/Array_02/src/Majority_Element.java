import java.util.HashMap;
import java.util.Map;

public class Majority_Element {
//    static int brute_Approach(int arr[]){
//        int n = arr.length;
//        int count;
//        for (int i = 0; i < n; i++) {
//            count = 0;
//            for (int j = 0; j < n; j++) {
//                if (arr[i] == arr[j]){
//                    count++;
//
//                }
//
//            }
//            if(count > n/2) return arr[i];
//
//        }
//        return -1;
//    }

//    static int Batter_Approach(int arr[]){
//        int n = arr.length;
//        HashMap<Integer,Integer> mpp = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            int value = mpp.getOrDefault(arr[i] , 0);
//            mpp.put(arr[i] , value+1);
//        }
//        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
//            if (it.getValue() > (n / 2)) {
//                return it.getKey();
//            }
//        }
//        return -1;
//    }

    static int Optimal_Approach(int arr[]){
        int n = arr.length;
        int element = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(count == 0){
                count++;
                element = arr[i];

            } else if (arr[i] == element) {
                count++;
            }else count--;
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) cnt++;
        }
        if (cnt > (n/2)) return element;
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,3,3,1,2,2,3,3,3};
        int ans = Optimal_Approach(arr);
        System.out.println(ans);
    }
}
