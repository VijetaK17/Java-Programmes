
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzzOptimized {

    public static List<String> fizzBuzz(int num) {
        List<String> result = new ArrayList<>(num);

        for (int i = 1; i <= num; i++) {
            String s = "";
            if (i % 3 == 0) {
                s += "Fizz";
            }
            if (i % 5 == 0) {
                s += "Buzz";
            }

            result.add(s.isEmpty() ? String.valueOf(i) : s);
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        List<String> result = fizzBuzz(num);
        for (String s : result) {
            System.out.print(s + " ");
        }
    }
}
