import java.util.ArrayList;

public class Rearrange_Array_Element_By_Sign {
//    static int[] Brute_Solution(int arr[]) {
//    int n = arr.length;
//        ArrayList<Integer> poss = new ArrayList<>();
//        ArrayList<Integer> neg = new ArrayList<>();
//        for(int i=0;i<n;i++){
//
//            if(arr[i]>0) poss.add(arr[i]);
//            else neg.add(arr[i]);
//        }
//        for (int i = 0; i < n; i++) {
//            if(arr[i] > 0) poss.add(arr[i]);
//            else neg.add(arr[i]);
//        }
//        for (int i = 0; i < n/2; i++) {
//            arr[2*i] = poss.get(i);
//            arr[2*i+1] = neg.get(i);
//        }
//        return arr;
//    }


//    static int[] Optimal_Solution(int arr[]){
//        int n = arr.length;
//        int pidx = 0;
//        int nidx = 1;
//        int res[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            if(arr[i] > 0){
//                res[pidx] = arr[i];
//                pidx = pidx + 2;
//            }
//           else{
//                res[nidx] = arr[i];
//                nidx = nidx + 2;
//            }
//        }
//        return res;
//    }


    static int[] Optimal_Solution(int arr[]) {
        int n = arr.length;
        int[] pos = new int[n];
        int[] neg = new int[n];
        int pidx = 0, nidx = 0;

        // Separate positive and negative elements
        for (int num : arr) {
            if (num > 0) {
                pos[pidx++] = num;
            } else {
                neg[nidx++] = num;
            }
        }

        // Create the result array
        int[] res = new int[n];
        int i = 0, j = 0, k = 0;

        // Fill the result array with alternating positive and negative elements
        while (i < pidx && j < nidx) {
            res[k++] = pos[i++];
            res[k++] = neg[j++];
        }

        // If there are remaining positive elements, add them to the result array
        while (i < pidx) {
            res[k++] = pos[i++];
        }

        // If there are remaining negative elements, add them to the result array
        while (j < nidx) {
            res[k++] = neg[j++];
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = {3,1,-2,-5,2,5,1,9,-4};
        int ans[] = Optimal_Solution(arr);
        for(int vel: ans){
            System.out.print(vel+" ");
        }

    }
}
