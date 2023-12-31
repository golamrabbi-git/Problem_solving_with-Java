public class Problem6 {
    static boolean isPalindrome(String s,int l, int r){
        int n = s.length();
        //Base Case
        if(l>= n/2) return true;

        if(s.charAt(l)!= s.charAt(r)) return false;
        return isPalindrome(s,l+1,r-1);
    }
    public static void main(String[] args) {
        String str = "racecar";
        int n = str.length();
        boolean res = isPalindrome(str,0,n-1);
        System.out.println(res);

    }
}
