package simpleTasks._155_uniqueElement;


import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Map<Integer, Integer> arr = new HashMap<>();

        for (int i = 0; i < size; i++) {
            int curr = scanner.nextInt();
            int value = arr.getOrDefault(curr, 0);
            value++;
            arr.put(curr, value);
        }
        int res = 0;
        for (int i : arr.keySet()) {
            if (arr.get(i) == 1) {
                res++;
            }
        }
        System.out.println(res);
        scanner.close();
    }
}
