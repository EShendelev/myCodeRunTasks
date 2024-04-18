package simpleTasks._81_rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean isRectangle = a < (b + c)
                && b < (a + c)
                && c < (a + b);
        if (isRectangle) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
