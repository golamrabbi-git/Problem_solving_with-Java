public class Problem4 {
    static int[] reverse(int[] arr, int l, int r) {
        if (l >= r)
            return arr;

        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverse(arr, l + 1, r - 1);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        int n = arr.length;
        int[] ans = reverse(arr, 0, n - 1);

        // Print the reversed array
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}


