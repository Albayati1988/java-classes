package class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        /*
        Scanner => Name of the class
        scan is just a variable like we create primitive variables
        = => assignment operator
        System.in => tell the computer we want the data the keyboard.
         */

       /* System.out.println("please enter your age");
        int age=scan.nextInt();
        System.out.println("you are "+age+" years old");*/

        /*System.out.println("please enter your weight ");
        double weight=scan.nextDouble();
        System.out.println("your weight is "+weight);
        boolean hungry=scan.nextBoolean();
        System.out.println("Hungry "+hungry);*/


        /*System.out.println("please Enter your gender");
        char gender=scan.next().charAt(0);
        System.out.println("your gender is "+gender);*/

       /* System.out.println("please enter your name ");
        String name=scan.next();
        System.out.println("your name is "+name);*/

        System.out.println("please Enter you name");
        String name=scan.nextLine();
        System.out.println("Your full name is "+name);
        scan.nextLine();
        System.out.println("please enter your full name ");
        String fullName=scan.nextLine();
        System.out.println("Your full name is "+fullName);

    }



}
