package class9;

public class ArraysDemo6 {
    public static void main(String[] args) {
     //{create an empty arry then store 45 44 33 20 and the 10 in it then use a loop
        // to add all the elements which are present in even indexes and print it after adding them}
     // create an array and store 10,20,30,4,5,6,7,80
     //add all teh element which are multple of 2
        int[] numbers=new int[5];
        numbers[0]=45;
        numbers[1]=44;
        numbers[2]=33;
        numbers[3]=20;
        numbers[4]=10;
       // numbers[5]=50; will give me error
        
        int sum=0;
        for (int i = 0; i <numbers.length ; i++) {
            if (i%2==0){
                sum=sum+numbers[i];
            }

        }

        System.out.println(sum);
        
        
        
    }
}
