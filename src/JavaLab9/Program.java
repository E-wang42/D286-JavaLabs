package JavaLab9;

import java.util.*;

public class Program {
    static boolean showResults(Random rand) {
        int randomInt = rand.nextInt(2);
        return randomInt == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random(2);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            boolean result = showResults(rand);
            System.out.println(result);
        }
    }
}
