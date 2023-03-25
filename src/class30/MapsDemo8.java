package class30;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapsDemo8 {
    /*Create a map of countries with it's capital that will store countries in alphabetical
     order and print all values from a country map using for each loop and iterator then print
      all values from a country map using for each loop and iterator */
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("Morocco", "Rabat");
        countries.put("USA", " Washington, D.C");
        countries.put("India", "New Delhi");
        countries.put("France", "Paris");

        // Set<Map.Entry<String,String>> entrySet=countries.entrySet();*** first part replaced with var
        var entrySet=countries.entrySet();
        for (var entry:entrySet) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        var iterator=countries.entrySet().iterator();
                while(iterator.hasNext()){
                    var entry=iterator.next();
                    System.out.println(entry.getKey()+" "+ entry.getValue());
                }
    }
}
