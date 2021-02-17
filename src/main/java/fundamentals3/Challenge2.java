package fundamentals3;

public class Challenge2 {

    int add1(int a) {
        return a+1;
    }

    //a method returns a value - any type of data
    //after you call return, nothing else will be executed
    //inside that block - it would be unexecutable code
    public static void main(String[] args){
        int firstNum = 23;
        int secondNum = 47;

        if (firstNum % 10 == secondNum % 10){
            System.out.println("same last digit!");
        }
    }
}


