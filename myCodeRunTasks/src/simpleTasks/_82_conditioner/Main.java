package simpleTasks._82_conditioner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tRoom = scanner.nextInt();
        int tCond = scanner.nextInt();
        String reg = scanner.next();

        switch (reg) {
            case "freeze":
                System.out.println(Math.min(tRoom, tCond));
                break;
            case "heat":
                System.out.println(Math.max(tRoom, tCond));
                break;
            case "fan":
                System.out.println(tRoom);
                break;
            case "auto":
                System.out.println(tCond);
                break;
        }
        scanner.close();
    }
}
