package fundamentals3;

public class IfElseChallenge {
    public static void main(String [] args){

        double firstVar = 20;
        double secondVar = 80;

        double result = (firstVar + secondVar) * 25;
        System.out.println(result);

        double result2 = (firstVar%secondVar) /40;
        System.out.println(result2);

        if(result2 <= 20){
            System.out.println("total over the limit");
        }

    }
}


//if you divide 10 by 2 - modulus will give you the remainder (in this case 0)