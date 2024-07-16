public class Sort_An_Arrays_Of_ones_Twos_Threes {
    // We know that the Brute fource approach to solve the arr is using Arrays.sort();


//    static int[] Batter_Approach(int arr[]){
////        this Approach solve this problem in O(2N)
////        and space complexity is O(1) and use O(n) to return the answer .
//        int count0 = 0;
//        int count1 = 0;
//        int count2 = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == 0) count0++;
//            else if (arr[i] == 1) count1++;
//
//            else count2++;
//        }
//        for (int i = 0; i < count0; i++) {
//            arr[i] = 0;
//        }
//        for (int i = count0; i < count0+count1; i++) arr[i] = 1;
//
//        for (int i = count0+count1; i < arr.length; i++) {
//            arr[i] = 2;
//        }
//        return arr;
//    }


    static int[] Optimal_Approach(int arr[]){
        int n = arr.length;
        int low = 0, mid = 0;
        int high = n-1;
        while (mid <= high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] ==1) {
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
               
                high--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,0,1,2,1,2,0,0,0,1};
        int ans[] = Optimal_Approach(arr);
        for(int val: ans){
            System.out.print(val+" ");
        }
    }
}
