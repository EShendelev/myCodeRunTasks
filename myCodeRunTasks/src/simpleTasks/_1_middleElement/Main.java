package simpleTasks._1_middleElement;

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputStr = reader.readLine().split(" ");
        int[] arr = new int[inputStr.length];
        for (int i = 0; i < inputStr.length; i++) {
            arr[i] = Integer.parseInt(inputStr[i]);
        }
//        System.out.println(middleElement(arr));
        writer.write(String.valueOf(middleElement(arr)));
        reader.close();
        writer.close();
    }

    static int middleElement(int[] arr) {
        Arrays.sort(arr);
        return arr[1];
    }
}