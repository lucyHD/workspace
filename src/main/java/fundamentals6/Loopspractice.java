package fundamentals6;

class LoopsPractice {

    public static void main(String[] args) {

            int[] numbers = {4, 8, 6, 8};
            //another way of creating an array

            numbers[0] = 4;
            numbers[1] = 5;
            numbers[2] = 6;
            numbers[3] = 7;

            //new array of integers with a length of 4(will hold 4 values)
            for (int i = 0; i <numbers.length; i++) {
                System.out.println(numbers[i]);
                // what you are saying here is print the value at this index
                //of the numbers array
                // so the 'i' number goes into the square brackets (index)
                //and lets you access the element at that index
            }


}}










// String [] words = new String[4]



