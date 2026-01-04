
public class ArrayConcatenation {

    public static int[] concatenateArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = arr[i];
            ans[i + n] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 6};
        int[] ans = concatenateArray(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
