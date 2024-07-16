import java.util.ArrayList;
import java.util.List;

public class Leader_In_An_Arrays {
    static List<Integer> Brute(int arr[]){
        ArrayList<Integer> ll = new ArrayList<>();
        int n = arr.length;


        for (int i = 0; i < n; i++) {
            boolean leader = true;
            for (int j = i+1; j < n; j++) {
                if (arr[j]>arr[i]){
                leader = false;
                break;
                }

            }
            if (leader == true) ll.add(arr[i]);
        }
        return ll;
    }



    public static void main(String[] args) {
        int arr[] = {10 , 22 , 12 , 3 , 0 , 9};
        List<Integer> ans = Brute(arr);
        for(int val: ans){
            System.out.print(val+" ");
        }
    }
}
