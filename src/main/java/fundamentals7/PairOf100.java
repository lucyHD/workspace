package fundamentals7;

import java.util.Arrays;

public class PairOf100 {

    public static void main(String[] args) {

    int[] scores = {1, 100, 100};

        int result = scores100(scores);
        System.out.println(result);

    }

    public static int scores100(int[] scores){
       boolean pairOf100s = false;

       int is100 = 0;
       
       for(int i = 0; i < scores.length; i++){

           if (scores[i] == 100){
               is100 = 100;
               pairOf100s = true;
           }
      }


        //array of scores
        //return true if there are scores of 100 next to each other in the array


        return is100;
    };
}
