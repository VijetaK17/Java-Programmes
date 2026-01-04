
public class RichestCustomerWeath {

    public static int maxWealth(int[][] accounts) {

        int[] result = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            result[i] = sum;
        }
        int maxWealth = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] > maxWealth) {
                maxWealth = result[i];
            }
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1},
            {4, 5, 6}
        };
        int result = maxWealth(accounts);

        System.out.print(result);
    }
}
