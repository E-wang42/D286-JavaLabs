package JavaLab10;

import java.util.*;

public class CustomerAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();


        // TODO: Declare name and age variables (string, and int)
        String name;
        int age;

        // TODO: Read name and age input for customer 1
        name = scanner.nextLine();
        age = scanner.nextInt();
        scanner.nextLine();

        // TODO: Set customer 1 name and age fields using mutator methods (setName() and setAge())
        customer1.setName(name);
        customer1.setAge(age);

        // TODO: Read name and age input for customer 2
        name = scanner.nextLine();
        age = scanner.nextInt();


        // TODO: Set customer 2 name and age fields using mutator methods (setName() and setAge())
        customer2.setName(name);
        customer2.setAge(age);

        System.out.println("Customer that is older:");

        /// TODO: Determine older customer (use getAge())
        //       and output older customer's info (use printInfo())

        if(customer2.getAge() > customer1.getAge()){
            customer2.printInfo();
        }else{
            customer1.printInfo();
        }
    }
}