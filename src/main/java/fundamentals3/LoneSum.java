package fundamentals3;

public class LoneSum {


    public static void main(String[] args) {

        int result = loneSum(1, 2, 3);

        System.out.println(result);

    }

        public static int loneSum (int firstNumber, int secondNumber, int thirdNumber) {

//            if (!(firstNumber == secondNumber) && !(firstNumber == thirdNumber) && !(secondNumber == thirdNumber)) {
//                return firstNumber + secondNumber + thirdNumber;
//            }

            if((firstNumber == secondNumber) && (secondNumber == thirdNumber)){
                return 0;
            }
            if (firstNumber == secondNumber) {
                return thirdNumber;
            }
            if (secondNumber == thirdNumber) {
                return firstNumber;
            }
            if(thirdNumber == firstNumber) {
                return secondNumber;
            }
            else {
                return firstNumber + secondNumber + thirdNumber;
            }

        }
    }


// if one value is equal to another value it does not count towards the sum
// if firstNum is the same as the second or third
// if second is the same as first or third
// if third is the same as first second


