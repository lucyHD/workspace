package fundamentals4.challenges;

public class HighestEarner {

    public static void main(String[] args) {

    displayHighestEarner("John", 35000);
    displayHighestEarner("Andy", 22000);
    displayHighestEarner("John", 45000);
    displayHighestEarner("Lilly", 60000);
    displayHighestEarner("Anna", 38000);


    }

    private static void displayHighestEarner(String name, int salary) {
        int salaryEarned = salary;

        int rank = calculateHighestEarnerPosition(salaryEarned);
        System.out.println(name + " has ranking number " + rank);
        //display rank
    }

    public static int calculateHighestEarnerPosition(int salaryEarned){
        int rank = 0;
        if(salaryEarned >= 50_000){
            rank = 1;
        }else if(salaryEarned >= 40_000){
            rank = 2;
        }else if(salaryEarned >= 30_000){
            rank = 3;
        }else if(salaryEarned >=20_000){
            rank = 4;
        }else if (salaryEarned >= 10_000){
            rank = 5;
        }
        return rank;
    }
}
