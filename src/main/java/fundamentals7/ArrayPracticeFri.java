package fundamentals7;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayPracticeFri {

    public static void main(String[] args) {


        //standard array
        int[] numbers = new int[4];

        numbers[0] = 543534;
        numbers[1] = 544;
        numbers[2] = 577;
        numbers[3] = 657456;

        System.out.println(numbers[3]);

        numbers[3] = 56;

        System.out.println(numbers[3]);

        for(int i = 0; i <numbers.length; i++){
            System.out.println("The number stored at index "  + i + " is " + numbers[i]);
        }


        //predefined array

        String[] countries = {"France", "Germany", "Denmark", "Norway"};

        System.out.println(countries[0]);

        countries[0] = "Russia";

        System.out.println(countries[0]);

        //for loop, looping over pre-defined array
        for(int i = 0; i < countries.length ; i++){
            System.out.println("Name of country is: " + countries[i]);
        }

        //for each loop, loping over pre-defined array
        for(String country: countries) {
            System.out.println("I'm " + country + " i'm a country!!");
        } // for each country in the countries array, do this

        Arrays.sort(numbers); //will sort in numerical order

        for(int i=0; i <numbers.length; i++){
            System.out.println(numbers[i]);
        }

    }

}
