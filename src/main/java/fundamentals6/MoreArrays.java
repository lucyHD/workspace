package fundamentals6;

import jdk.swing.interop.SwingInterOpUtils;

public class MoreArrays {

    public static void main(String[] args) {

        int[] numbers = new int[4];
        //creating a new array with a maximum of four values
        System.out.println("the number of numbers is " + numbers.length);

        String[] cards = new String[5];

        System.out.println("number of cards is " + cards.length);

        cards[0] = "ONE OF DIAMONDS";
        cards[1] = "TWO OF HEARTS";
        cards[2] = "TEN OF SPADES";
        cards[3] = "SIX OF CLUBS";
        cards[4] = "QUEEN OF CLUBS";

        System.out.println(cards[2]);

        cards[2] = "four of spades";

        System.out.println(cards[2]);

        String[] countries = new String[4];
        // new array of strings with a maximum of 4 values



    }
}
