package fundamentals8;

import java.util.ArrayList;

public class Jungle {



    public static void main(String[] args) {

        Requirements requirements = new Requirements("meat", 5, "diet coke");

        BigCat tiger = new BigCat("Stripy", requirements);
        //creating a new object.ins

        ArrayList names = new ArrayList();

        Kitten bear = new Kitten("Sam", requirements);
        // creating a new object of type kitten

        bear.hasLunch();

        //bear can have lunch, but tiger can't
        //why?
        //interface only implemented by Kitten class not BigCat class


        BigCat peanut = new Kitten("spot", requirements);

        //peanut can't have lunch either, because he's of type Big Class, although he takes kittens parameters

        Lunchable sam = new WildCat("Ray", requirements);
        //creating a new kitten/ or wildcat of type lunchable
        //how can you use the interface as the data type?
        //called coding to an interface
        //can easily swap on the right between Kitten and WildCat


    }
}
