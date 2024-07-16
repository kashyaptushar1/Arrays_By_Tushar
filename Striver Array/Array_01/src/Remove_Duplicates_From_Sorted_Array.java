import java.util.HashSet;

public class Remove_Duplicates_From_Sorted_Array {
    // 👩 Brute Approach :- Time complexity [O(nlogn) + O(n)]
    // kyuki hash Set use kr rahe hai tho space complexity O(n) hogi
//    static int removeDuplicates(int[] arr) {
//        HashSet< Integer > set = new HashSet < > ();
//        for (int i = 0; i < arr.length; i++) {
//            set.add(arr[i]);
//        }
//        int k = set.size();
//        int j = 0;
//        for (int x: set) {
//            arr[j++] = x;
//        }
//        return k;
//    }

    // 🧑optimal Approach :- Time Complexity O(N) and space complexity is O(1).
    static int removeDuplicates(int [] arr){
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3,4,4,4,4,5,5,5};
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
