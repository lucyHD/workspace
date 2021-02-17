package fundamentals2;

public class Employee {

    private static double salary;
    //declared a static variable
    //box of size double

    public static final String DEPARTMENT = "Marketing";
    //declared a static

    public static void main(String[] args){
        salary = 1000;
        //initialised private static inside main method
        System.out.println(DEPARTMENT + "average salary" + salary);

    }

}
