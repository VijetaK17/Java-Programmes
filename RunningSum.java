
import java.util.Arrays;

public class RunningSum {

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {10, 2, 3, 4, 7};
        int[] result = runningSum(nums);

        System.out.print(Arrays.toString(result));
    }
}
