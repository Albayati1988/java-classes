package class11;

public class Task1 {
    public static void main(String[] args) {
        /* print
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
         */
        for (int i = 1; i <=4 ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i <=4 ; i++) {
            for (int j = 0; j <3-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
