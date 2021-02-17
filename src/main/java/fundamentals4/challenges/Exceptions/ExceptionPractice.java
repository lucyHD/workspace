package fundamentals4.challenges.Exceptions;

public class ExceptionPractice {

    public static double safeDivide(double x, double y) {
        if(y == 0){
            throw new IllegalArgumentException("cannot divide by zero!!");
        }
        return x/y;
    }

    public static void main(String[] args) throws IllegalArgumentException {



            double divideResult = safeDivide(2, 0);
            System.out.println(divideResult);

//        catch (Exception e) {
//            e.printStackTrace();
//            System.err.println("Cannot divide by zero!!");
//        }
    }

}
