import java.util.*;
public class Moves_All_Zeros_To_The_End_Of_Array {
//    public static int[] Brute_Approach ( int []a) {
//        int n = a.length;
//        ArrayList<Integer> temp = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            if (a[i] != 0)
//                temp.add(a[i]);
//        }
//        int nz = temp.size();
//        for (int i = 0; i < nz; i++) {
//            a[i] = temp.get(i);
//        }
//        for (int i = nz; i < n; i++) {
//            a[i] = 0;
//        }
//        return a;
//    }


    static int[] Optimal_Approach(int arr[]){
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                j = i;
                break;
            }
        }
        if (j == -1) return arr;
        for (int i = j+1; i < arr.length; i++) {
            if (arr[i] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int arr[] = {1,0,2,3,2,0,0,4,5};
//        int ans[] = Brute_Approach(arr);
          int ans[] = Optimal_Approach(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] +" ");
        }

    }
}
