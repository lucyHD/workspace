package fundamentals7;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class QuickPractice {

    public static void main(String[] args) {

        //standard array

        int[] numbers = new int[4];

        //array with predefined values - anonymous array as you don't define it's values on
        //the right, only on the left
        int[] numbersTwo = {2, 4, 5, 8};

        numbers[0] =435;
        numbers[1] = 3434;
        numbers[2] = 4555;

        System.out.println(numbersTwo.length);

        System.out.println(numbers[0]);

        //for each loop
        //for each number in numbers, do this

        for(int number : numbers){
            System.out.println("I'm a numbers!");
        }

        // for loop
        //while i is less than 3(the length of numbersTwo), print the item of the array
        for(int i = 0; i<numbersTwo.length;i++){
            System.out.println(i + " " + numbersTwo[i]);
        }

        int[] multiply2 = new int[4];
        int[] multiply = {2, 4, 5, 6, 7};


        for(int i = 0; i < multiply.length; i++) {

            //multiply each element by 2
            int sum = multiply[i] * 2;
            //print the result
            System.out.println(sum);
        }

            String[]cards = new String[5];
            cards[0] = "Joker";
            cards[1] = "King of Spades";
            cards[2] = "Queen of Hearts";
            cards[3] = "3 of Diamonds";
            cards[4] = "8 of Spades";

            double[] money = new double[5];
            double[] moneyTwo = {9.99d, 5.00d, 3.78d, 6.34d, 8.34d};

            int[] orderOfNum = new int [5];
            int[] orderOfNums = {12, 45, 23, 19, 8};

            for(int num = 0; num < orderOfNums.length; num++){
                System.out.println("unordered numbers are: " + num + " " + orderOfNums[num]);
            }

            Arrays.sort(orderOfNums);

            for(int i = 0; i<orderOfNums.length; i++){
                System.out.println("ordered numbers are:  " + i + " " + orderOfNums[i]);
            }
        System.out.println(Arrays.toString(orderOfNums));
        }




}
