public class Check_Array_is_Sorted_Or_Not {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,4};
        int n = arr.length;
        boolean check = true;
        for (int i = 1; i < n; i++) {
            if (arr[i]<=arr[i-1]){
                check = false;
            }else{
                check =  true;
            }
        }
        System.out.println(check);
    }
}
