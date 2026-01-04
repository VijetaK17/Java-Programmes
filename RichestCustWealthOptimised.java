
public class RichestCustWealthOptimised {

    public static int maxWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {
            {1, 3, 3},
            {3, 1, 1},
            {4, 1, 6}
        };
        int result = maxWealth(accounts);
        System.out.print(result);
    }
}
