public class lesson3 {

    public static void main(String[] args) {

        int a = 12;

        a += 15;
        // 12 + 15 = 27
        a++;
        // 27 + 1 = 28
        a--;
        // 28 - 1 = 27
        a--;
        // 27 - 1 = 26
        a /= 17;
        // 26 / 17 = 1.
        //Why do we get 1 and not the decimal?
        //because a is an integer - will round it so it's a whole number
        double b = a/17D;
        //if we want it to return a double (a decimal number)
        //have to do it like above.
        //D - makes 17 a double, so it will return a double
        a= 9%a;
        System.out.println(a);



    }
}
