package JavaLab9;

import java.util.*;

public class Program {
    static boolean showResults(Random rand) {
        int random = rand.nextInt(2);
        if (random == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random(2);
        int input = scanner.nextInt();

        for(int i = 0; i < input; i++){
            boolean result = showResults(rand);
            System.out.println(result);
        }
    }
}
