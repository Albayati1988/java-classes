package class11;

import java.util.Scanner;

public class DogTester {
    public static void main(String[] args) {
       // creating an actual object from class Scanner
       // Scanner scanner=new Scanner(System.in);
        //scanner.next();
        // this is how we create the objects of a class
        Dog dog1= new Dog();
        dog1.sleep();
        Dog dog2=new Dog();
        dog2.bark();
        Dog dog=new Dog();
        dog.eat();
    }
}
