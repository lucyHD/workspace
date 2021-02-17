package fundamentals7;

public class WhileAverage {

    public static void main(String[] args) {

        int lowNumber = 1;
        int highNumber = 100;
        int sum = 0;
        double average;

        while(lowNumber <= highNumber){
            sum = sum + lowNumber;
            lowNumber++;


        }
        average = sum/highNumber;
        System.out.println(sum);
        System.out.println(average);
    }
}
