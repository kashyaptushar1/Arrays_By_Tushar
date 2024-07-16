import java.util.Arrays;

public class Second_Largest_Element {
    public static void main(String[] args) {
                int arr[] = {1,2,4,7,7,5,3};

        // Brute Approach :- Time complexity is [O(nlogn) + O(n)]
//        int n = arr.length;
//        Arrays.sort(arr);
//        int largest = arr[n-1];
//        int SecondLarge = -1;
//        for (int i = n-1; i >= 0 ; i--) {
//            if(arr[i] != largest){
//                SecondLarge = arr[i];
//                break;
//            }
//        }
//        System.out.println(SecondLarge);

        // Batter Approach: In this there are 2 passes of O(n) so time complexity in this O(2N).
//        int largest = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > largest){
//                largest = arr[i];
//            }
//        }
//        int secondLargest = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if ((arr[i] > secondLargest) && (arr[i] != largest)){
//                secondLargest = arr[i];
//            }
//        }
//        System.out.println(secondLargest);

        // Optimal Approach:

        int largest = arr[0];
        int secondLargest = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }

        }
        System.out.println(secondLargest);
    }
}
