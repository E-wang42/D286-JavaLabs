package JavaLab3;

import java.util.*;

// each table seats 10 guests
public class Tables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guests = scanner.nextInt();
        int tableSize = 10;
        double calc = guests / tableSize;
        int tablesFilled = (int)Math.floor(calc);
        System.out.println("Tables filled: " + tablesFilled);
        scanner.close();
    }
}
