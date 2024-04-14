package JavaLab7;

import java.util.*;

public class Smallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int smallest = Integer.MAX_VALUE;
        while (true) {
            int input = scanner.nextInt();
            if (input < 0) {
                break;
            } else if (input < smallest) {
                smallest = input;
            }
            sum += input;
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
