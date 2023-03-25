package class11;

public class Example1 {
    public static void main(String[] args) {
        int [][] matrix={{10,20,30},
                        {45,55,66},
                        {30,40,20,10,25}
        };
        // write a loop to print all the elements from this 2D array
        //matrix.length tells us how many 1D arrays are present in this 2D array
        for (int i = 0; i < matrix.length ; i++) {


            for (int j = 0; j <matrix[i].length ; j++) {// matrix[i].length the size of each  1D array
                if (matrix[i][j]%2!=0)
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("************************************");
        //printing all numbers using enhanced ForEachLoop
        int [][] matrix1={{10,20,30},
                {45,55,66},
                {30,40,20,10,25}
        };
        for(int[] arr:matrix){
            for (int number:arr) {
                System.out.print(number+" ");

            }
            System.out.println();
        }

    }

}
