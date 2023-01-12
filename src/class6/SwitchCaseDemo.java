package class6;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        String country=scanner.next();

        switch(country.toLowerCase()){ // converts the text to Lowercase USA=>usa

            case "usa":
                System.out.println("Burger");
                break;
            case "italy":
                System.out.println("pasta");
                break;
            case "afghanishtan":
                System.out.println("Kebab");
                break;
            default:
                System.out.println("Wrong country");

        }
    }
}
