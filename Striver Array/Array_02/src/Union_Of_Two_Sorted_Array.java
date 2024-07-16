import java.util.ArrayList;
import java.util.HashSet;

public class Union_Of_Two_Sorted_Array {
    static ArrayList<Integer> Find_Union(int arr1[] , int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> Union = new ArrayList<>();
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < n; i++) {
            s.add(arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            s.add(arr2[i]);
        }
        for (int it:s){
            Union.add(it);
        }
        return Union;
    }
    public static void main(String[] args) {
        int arr1[] = {1,1,2,3,3,4};
        int arr2[] = {1,2,3,4,5,6,6,7,8,9};
        ArrayList<Integer> Union = Find_Union(arr1, arr2);
        for (int val :Union) {
            System.out.print(val+" ");
        }


    }
}
