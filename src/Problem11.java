import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.Arrays;

public class Problem11 {
    static ArrayList<Integer> find_duplicates(int[] arr, int n){
        ArrayList<Integer>ans = new ArrayList<Integer>();
        //List<Integer> ans = new ArrayList<Integer>();
        Arrays.sort(arr);
        for(int i = 0 ; i < n-1 ; i++){
            if(arr[i] == arr[i+1]){
                ans.add(arr[i]);
            }
        }
        return(ans);
    }

    public static void main(String[] args) {
        int[] arr ={4,2,5,2,1,5};
        System.out.println( find_duplicates(arr,6));

    }
}
