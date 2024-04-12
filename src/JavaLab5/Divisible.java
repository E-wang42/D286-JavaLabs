package JavaLab5;

import java.util.*;

public class Divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();
        String str1 = String.valueOf(input1);
        String str2 = String.valueOf(input2);
        String str3 = String.valueOf(input3);
        int sum = input1 + input2 + input3;
        if (input1 < 0 || input2 < 0 || input3 < 0) {
            System.out.println("Invalid Input!");
        } else if (sum % 3 == 0) {
            System.out.println(str1 + str2 + str3 + " is divisible by 3!");
        } else if (sum % 3 != 0) {
            System.out.println(str1 + str2 + str3 + " is not divisible by 3!");
        }
        scanner.close();
    }
}
