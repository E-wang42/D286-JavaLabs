package JavaLab4;
import java.util.*;

public class Format {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String age = scanner.nextLine();
        String salary = scanner.nextLine();
        String formatted = String.format("%s is %s and makes $%s.", name, age, salary);
        System.out.println(formatted);
        scanner.close();
    }
}
