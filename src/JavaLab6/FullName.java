package JavaLab6;

import java.util.*;


public class FullName {
    public static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        String firstName = capitalizeFirstLetter(words[0]);
        char lastInitial;
        char middleInitial;
        if (words.length < 3) {
            lastInitial = words[1].toUpperCase().charAt(0);
            System.out.format("%s., %s\n", lastInitial, firstName);
        } else {
            lastInitial = words[2].toUpperCase().charAt(0);
            middleInitial = words[1].toUpperCase().charAt(0);
            System.out.format("%s., %s %s.\n", lastInitial, firstName, middleInitial);
        }
        scanner.close();
    }
}
