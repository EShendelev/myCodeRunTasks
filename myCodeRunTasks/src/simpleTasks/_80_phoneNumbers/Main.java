package simpleTasks._80_phoneNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String current = scanner.nextLine().replaceAll("\\D", "");
        String[] numbers = new String[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextLine().replaceAll("\\D", "");
        }
        System.out.println(current + "\n" + Arrays.toString(numbers));
        scanner.close();
    }
}
