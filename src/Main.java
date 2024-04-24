import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int items;
        int product = 1;

       while((items = scanner.nextInt()) > -1){
           list.add(items);
           product = product * items;
       }
        System.out.println(list);
        System.out.println(product);
    }
}