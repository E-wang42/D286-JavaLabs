package JavaLab10;

import java.util.*;

public class CustomerAge {
    public static void printInfo(String name, int age){
        String format = String.format("Customer that is older:\nName: %s\nAge: %d", name, age);
        System.out.println(format);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        int age1 = scanner.nextInt();
        scanner.nextLine();

        String name2 = scanner.nextLine();
        int age2 = scanner.nextInt();

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        customer1.setName(name1);
        customer2.setName(name2);
        customer1.setAge(age1);
        customer2.setAge(age2);

        if(customer2.getAge() > customer1.getAge()){
            printInfo(customer2.getName(), customer2.getAge());
        }else {
            printInfo(customer1.getName(), customer1.getAge());
        }
    }
}
