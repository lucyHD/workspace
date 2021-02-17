package fundamentals7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListsPractice {

    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>();

        ArrayList<Integer> numbers = new ArrayList<>();

        //array list - class
        //Integer - wrapper class

        countries.add("Spain");


        //adding at a specific index
        countries.add(1, "Denmark");

        System.out.println(countries);

        System.out.println(countries.contains("Norway"));

        System.out.println(countries.size());


        Collections.sort(countries);
        System.out.println(countries);

//        ArrayList<String> names = Arrays.asList("bill","bob");
    }
}
