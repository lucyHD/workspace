package fundamentals7;

public class AccruedInterestCal {

    public static void main(String[] args) {
        double savings = 100;
        /*Let's say we were asked to generate a report that worked out the amount of interest accrued over a
        period of 10 years if the interest rate changed each year by 1%. Assume we have £100.00 to begin with.*/

        for(int i = 1; i <= 10; i++){
            double interest = calculateInterestAccrued(savings, i);

        }


    }

    public static double calculateInterestAccrued(double savings, int rateOfInterest) {
        double increasedAmount = savings * (rateOfInterest/100);
        System.out.println(increasedAmount);
        return increasedAmount;


    }
}
