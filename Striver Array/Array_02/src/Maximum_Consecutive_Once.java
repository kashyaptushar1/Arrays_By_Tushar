import java.util.*;
public class Maximum_Consecutive_Once {
    static int solution(int arr[]){
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                count++;
            }
            else{
                count = 0;
            }
            max = Math.max(max , count);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1,0,0,0,0,1,1};
        int ans = solution(arr);
        System.out.println(ans);
    }
}
