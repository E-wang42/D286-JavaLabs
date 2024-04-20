import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Type your code here. */
        double[] items = new double[3];
        double sum = 0.0;
        double avg = 0.0;

        for (int i = 0; i < 3; i++) {
            items[i] = scanner.nextDouble();
        }

        for(double nums : items){
            sum += nums;
        }

        avg = sum / 3;

        System.out.println("Array items: " + items[0] + " " + items[1] + " " + items[2]);
        System.out.println("Average: " + avg);
    }
}