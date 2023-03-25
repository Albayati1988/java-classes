package class30;

import java.util.TreeMap;

public class MapsDemo9 {
    /*Create a map of countries with it's capital that will store countries in alphabetical
     order and print all values from a country map using for each loop and iterator then print
      all values from a country map using for each loop and iterator */
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("Morocco", "Rabat");
        countries.put("USA", " Washington, D.C");
        countries.put("India", "New Delhi");
        countries.put("France", "Paris");
        var values=countries.values();
        for (var value:values) {
            System.out.println(value);

        }
        var iterator=countries.values().iterator();
        while(iterator.hasNext()){
            var value=iterator.next();
            System.out.println(value);
        }
    }
}
