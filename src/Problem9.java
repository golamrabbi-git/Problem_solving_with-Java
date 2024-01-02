public class Problem9 {
    static int linear_search(int[] arr, int n, int x){
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == x)
                return i;
        }
            return -1;
    }

    public static void main(String[] args) {
        int[] arr ={12,43,7,23,3,17};
        int len = arr.length;
        int x = 23;
        int res = linear_search(arr,len,x);
        System.out.println(x + " found at position " +res);
    }
}
