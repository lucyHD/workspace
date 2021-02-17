package fundamentals4.challenges;

public class PersonsDetails {

    public static void main(String[] args){

        Details("aga", 15);
    }

    public static void Details(String name, int age){

        if(age < 16) {
            System.out.println("awww!");
        }
        if ((age < 18) && (age >= 16)){
            System.out.println("not an adult yet!");
        } else
            System.out.println("happy days!");
    }
}
