package class9;

public class ArraysDemo2 {
    public static void main(String[] args) {

        //10 20 30 45 50
        int [] numbers={10,20,30,45,50};
        // write code to add all teh numbers from array
        int sum=0;
        for (int i = 0; i <numbers.length ; i++) {
            sum=sum+numbers[i];

        }
        System.out.println(sum);






    }
}
