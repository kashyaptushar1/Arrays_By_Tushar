import java.util.HashSet;
import java.util.Set;

public class Longest_Consercutive_Sequence {
    static int  Optimal(int arr[]){
        int n = arr.length;
        if (n == 0) return 0;
        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        for(int it : set){
            if(!set.contains(it-1)){
                int cnt = 1;
                int x = it;
                while(set.contains(x+1)){
                    x = x+1;
                    cnt = cnt + 1;

                }
                longest = Math.max(longest , cnt);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int arr[] = {102 , 4 , 100 , 1 , 101 , 3 , 2 , 1 , 1};
        int ans  = Optimal(arr);
        System.out.println(ans);
    }
}
