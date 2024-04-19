import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(7);
        nums.add(8);
        int arrayLast = nums.size() - 1;
        int lastValue = nums.get(arrayLast);
        System.out.println(lastValue);
    }
}