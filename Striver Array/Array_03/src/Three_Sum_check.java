public class Three_Sum_check {
    static boolean Solution(int arr[]){
        boolean check = false;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        boolean check = Solution(arr);
        System.out.println(check);
    }
}
