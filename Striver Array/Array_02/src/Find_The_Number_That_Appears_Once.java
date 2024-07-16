public class Find_The_Number_That_Appears_Once {
//    static int Solution(int arr[]){
//        for (int i = 0; i < arr.length; i++) {
//            int num = arr[i];
//            int cnt = 0;
//            for (int j = 1; j < arr.length; j++) {
//                if (arr[j] == num){
//                cnt++;
//                }
//
//            }
//            if (cnt == 1)return num;
//        }
//        return -1;
//    }
    static int Solution(int arr[]){
        int n = arr.length;
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,9,2,3,3,4,4};
        int ans = Solution(arr);
        System.out.println(ans);
    }
}
