import java.util.*;
public class Largest_Element_In_Array {
    public static void main(String[] args) {
        int arr[] = {11,34,45,23,76,95,43,21,10,13};

//    👩   Brutefourse Approach: which has time complecity [O(nlong)]
//        int n = arr.length;
//        Arrays.sort(arr);
//        System.out.println("The lagest no is: "+arr[n-1]);

//     🧑   optimal Approach : Which has time complexity [O(n)]
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.print("The largest Element is: "+largest);
    }
}
