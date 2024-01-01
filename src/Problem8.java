public class Problem8 {
    static int fibonacci(int n){
        if(n == 0 || n ==1) return n;

        return (fibonacci(n-1) + fibonacci(n-2));
    }
    public static void main(String[] args) {
        int n = 5,i =0;
        while (i < n){
            System.out.println(fibonacci(i));
            i++;
        }
    }
}
