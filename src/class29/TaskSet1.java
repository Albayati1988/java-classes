package class29;

import java.util.TreeSet;

public class TaskSet1 {
    public static void main(String[] args) {
        /* Create a Set collection in which you need to add names of the countries.
     In this set we want all objects to be sorted in alphabetical order.
     Using 2 different ways retrieve all elements from set.*/
        TreeSet<String> country=new TreeSet<>();
        country.add("USA");
        country.add("France");
        country.add("Italy");
        country.add("Spain");
        country.add("Portugal");

        System.out.println(country);

        for(String x:country){
            System.out.print(x+" ");
        }



}
}
