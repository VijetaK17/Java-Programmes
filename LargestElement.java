import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int largest = numbers[0];
        int i = 0;
        while (i < numbers.length) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            i++;
        }
        System.out.println("Largest number is = " + largest);
    }
}
