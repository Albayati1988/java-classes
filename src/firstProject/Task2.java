package firstProject;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /* Using Scanner create an array of countries. When an array is created, retrieve all values from
        it and while retrieving those values print capital for each country. (use 2 different loops).*/

        Scanner scanner= new Scanner(System.in);
        String[] countries = new String[5];
        for (int i = 0; i < countries.length; i++) {
            System.out.print("Enter a country: ");
            countries[i] = scanner.nextLine();
        }
        for (String country : countries) {
            String capital = (country);
            System.out.println(capital);
        }




    }
}
