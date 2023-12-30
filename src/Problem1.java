import java.security.PublicKey;
public class Problem1 {

   public static void main(String args[]){
       int[] arr = {1,2,3,4,5};
       int sum =0;
       int arr_size = arr.length;
       for(int i = 0 ; i < arr_size ; i++){
            sum += arr[i];
       }
       System.out.println(sum);
    }
}
