public class Problem2 {
    public static void main(String[] args) {
        int[] arr =  {12, 13, 1, 10, 34, 10};
        int n = arr.length;
        int largest = 0;
        for(int i=0 ; i<n ; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);

    }

}
