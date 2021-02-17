package fundamentals2;

public class Student {
    public String studentName;
    // instance variable
    // declared but not initialised

    public void printDetails() {
        System.out.println("Student name is " + studentName);
    }
    // function to print name

    public Student(String name) {
        this.studentName = name;
    }
    //


    public static void main(String[] args) {
        Student student = new Student ("John Doe");
        student.printDetails();

    }

}
