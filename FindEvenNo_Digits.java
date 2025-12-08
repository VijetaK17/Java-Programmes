// Find Numbers with Even Number of Digits

public class FindEvenNo_Digits {
    public static int findNumbers(int[] arr){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int digit = 0;
            int number = arr[i];

            while (number > 0){
                number = number / 10;
                digit++;
            }

            if (digit % 2 == 0){
                count++;
            }
        }

        return  count;
    }

    public static void main(String[] args) {
        int[] arr = {123, 67, 3, 9, 80};

        int result = findNumbers(arr);
        System.out.println(result);
    }
}
