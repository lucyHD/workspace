package fundamentals7;

public class Product1ToN {

    public static void main(String[] args) {


        int product = 1;
        int lower = 1;
        int upper = 10;

        for (int i = lower; i <= upper; i++ ) {
            // i is 1, if it is true that i is less than 10(yes, its true)
            product = product * i;
            // product =  1 x 2 = 2 (so then product becomes 2!), next time i will come
            //around it will be 3, (so it will be 2 x 3 - product x i)
             System.out.println(product);
        }
        }

}
