package fundamentals7;

public class CountEvens {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4};

        int result = countEvens(numbers);

        System.out.println(result);
    }


    public static int countEvens(int[] numbers){

        int sum = 0;

        for(int i =0; i<numbers.length; i ++){
            if(numbers[i]%2 == 0){
                sum = sum + numbers[i]
;            }
        }

        //return the sum of all even numbers
        return sum;
    }
}


