package class12;

public class StringDemo1 {
    public static void main(String[] args) {
        String strobj=new String("Java");   // Creating an object of the String class
        String strobj2="Java"; // another way of creating an object of string class a shorter way

            //Creating an object of the String class
            String strObj = new String("Java");
            // another way of creating an object of String class a shorter way
            // mostly this is how we create the objects of String class
            String strObj2 = "Java";
            System.out.println(strObj2.length());
            String str = "Banana ";
            int len = str.length();
            System.out.println(len);
            String name = "Hamid poya ";
            if (name.length() > 10) {
                System.out.println("Name can't be more than 10 letters");
            }


        }
    }

