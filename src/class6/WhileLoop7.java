package class6;

public class WhileLoop7 {
    public static void main(String[] args) {
        //print below sequence with the hlp of loop
      //1 2 3 4  6 7 8 9 11 12 13 14 16

        int number=1;
        while(number<=16){
            if(number%5!=0){
                System.out.println(number);
            }
            number++;
        }



    }
}
