package JavaLab8;

import java.text.DecimalFormat;
import java.util.*;

public class ArrayAverage {
    static double sumArray(double[] arr) {
        double sum = 0.0;
        for (double num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] inputs = new double[3];
        inputs[0] = scanner.nextDouble();
        inputs[1] = scanner.nextDouble();
        inputs[2] = scanner.nextDouble();
        double sum = 0.0;
        double average = 0.0;
        DecimalFormat df = new DecimalFormat("#.#");
        for (double num : inputs) {
            sum = sum + num;
            if(sum > 0){
                average = sum / 3;
            }
        }
        String arrayItems = Arrays.toString(inputs);
        System.out.println(arrayItems);
//        System.out.println("Array items: ");
        System.out.println("Average: " + df.format(average));
        scanner.close();
    }
}
