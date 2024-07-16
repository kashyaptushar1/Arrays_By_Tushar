public class Finding_Missing_Number_in_An_Array {
//    static int Brute_Approach(int arr[] , int n){
//        for (int i = 1; i <=5 ; i++) {
//            int flag = 0;
//            for (int j = 0; j < arr.length; j++) {
//
//                if(arr[j] == i){
//                    flag = 1;
//                    break;
//                }
//            }
//            if (flag == 0) return i;
//        }
//        return -1;
//    }

//    static int Batter_Approach(int arr[] , int n){
//        This Approach have time complexity [O(n) +O(n)] and space complexity is O(N)
//        int hash[] = new int[n+1];
//
//        for (int i = 0; i < n-1; i++) {
//            hash[arr[i]]++;
//        }
//        for (int i = 1; i <= n; i++) {
//            if (hash[i] == 0) {
//                return i;
//            }
//        }
//        return -1;
//    }


    public static int optimal_Approach(int []a, int N) {

        //Summation of first N numbers:
        int sum = (N * (N + 1)) / 2;

        //Summation of all array elements:
        int s2 = 0;
        for (int i = 0; i < N - 1; i++) {
            s2 += a[i];
        }

        int missingNum = sum - s2;
        return missingNum;
    }
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1,2,3,4};
        int ans = optimal_Approach(arr,n);
        System.out.println(ans);

    }
}
