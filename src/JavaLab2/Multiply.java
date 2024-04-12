package JavaLab2;

import java.util.*;

public class Multiply {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        int startingNum = input.nextInt();
        int multiplier = input.nextInt();
        int result = startingNum * multiplier;
        int result2 = result * multiplier;
        int result3 = result2 * multiplier;
        System.out.println(result + " " + result2 + " " + result3);
        input.close();
    }
}
