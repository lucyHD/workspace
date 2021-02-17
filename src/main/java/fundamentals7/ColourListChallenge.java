package fundamentals7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColourListChallenge {
    public static void main(String[] args) {

       List<String> colourList = Arrays.asList("blue", "green", "yellow", "pink", "purple");

        System.out.println(colourList);

        String zeroIn = colourList.get(0);

        System.out.println(zeroIn);


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(34234);
        numbers.add(234234);
        numbers.add(4);
        numbers.add(7890);
        numbers.add(124);


        System.out.println(numbers);
        System.out.println("The number at index 2 is " + numbers.get(2));

        numbers.set(2, 8);
        System.out.println("The number at index 2 is now " + numbers.get(2) );

        System.out.println(numbers.contains(124));

        numbers.remove(2);

        System.out.println(numbers);




    }
}
