package fundamentals7;

public class SumAverageChallenge {

    public static void main(String[] args) {

        //produce sum of 1 - 100
        //store 1 and 100 in variables
        //display average of  1 -100

        int sum = 0;  //storing sum
        double average;
        int lowerbound = 1;
        int upperbound = 100;

        for (int i = lowerbound; i <= upperbound; i++) {
            sum += i;

        }

        average = (sum / upperbound);
        System.out.println("the average of " + lowerbound +  " to " + upperbound + " is: " + sum );
        System.out.println("the average is: " + average);

        }

    }

//    public static double averageCalculator(int num) {
//        //work out the average
//        //add all numbers in the range
//
//    }

