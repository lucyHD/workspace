package fundamentals7;

public class StringTimesChallenge {

    public static void main(String[] args) {


        String result = stringTimes("Hi", 4);

        System.out.println(result);

    }


    public static String stringTimes(String word, int number){

        String wordPlus = "";

        for(int i = 0; i < number; i++){
            wordPlus = wordPlus + word;
        }

        //wordPlus is an empty string
        // Add the original word to an empty string everytime time it loops

        return wordPlus;
    }





}