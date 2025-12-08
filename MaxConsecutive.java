public class MaxConsecutive {

    public static int maxConsecutive(int[] arr){
        int maxCount = 0;
        int currentCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                currentCount++;
                if (currentCount > maxCount){
                    maxCount = currentCount;
                }
            }else {
                currentCount = 0;
            }
        }

        return maxCount;
    }
    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 1, 0, 1, 0, 1, 1};

        int result = maxConsecutive(arr);
        System.out.println("Maximum number of consecutive 1s: " + result);
    }
}
