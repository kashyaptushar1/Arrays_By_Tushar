public class Two_Sum_Brute {
   /* static boolean solution(int arr[] , int tar){
     This is a function for check 2 sum is exist or not.
     The time complexity of this code is O(n^2) and space complexity is O(1)
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == tar){
                    check = true;
                    return true;
                }
            }
        }
        return check;
    }*/
    static int[] solution(int arr[] , int t){
        int ans[] = new int[2];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] + arr[j] == t){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;

                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,6,5,8,11};
        int  ans[] = solution(arr,8);
        for(int val: ans){
            System.out.print(val+" ");
        }


    }
}
