

public class PracticeStuff {

    public static void main(String[] args){

        //<datatype><variable name> = value;
        int myNum;
        //declaring a variable - setting up an empty int-sized box

        int num1 = 10;
        //declaring and initialising the variable

        myNum = 4;
        //assigning a value to the variable you declared

        byte myByte = 1;

        short myShort = 1234;
        System.out.println(Short.MAX_VALUE);

        int myInt = 23423423;

        long myLong = 3423423423L;
        long myBigLong = 3_0434_3435_534534L;


        float myFloat = 34.89f;

        double myDouble = 45.453534d;

        char myChar = 't';
        //single quotation marks

        boolean myBool = true;


        String myName = "Lucy";

        String message = "her name is " + myName + " she has " + 9879 + " siblings";

        System.out.println(message);

        String sampleStr = "This is a string";

        System.out.println(sampleStr.equals("This is a string"));
        //checks the content of the string, and not if it is exactly the same object

        System.out.println(sampleStr.replaceAll("is", "is not"));






    }
}
