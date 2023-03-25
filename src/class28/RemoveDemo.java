package class28;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDemo {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("computer");
        words.add("Lava");

        words.removeIf(s -> s.endsWith("a"));

        System.out.println(words);
    }
}