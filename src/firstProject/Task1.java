package firstProject;

import java.util.Scanner;

public class Task1 {
    /*Using Scanner create an array of integer values. After the array is created,
     calculate the sum of all stored elements in that array.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of the elements in the array is: " + sum);
    }
}
