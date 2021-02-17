package fundamentals8;

public class ContactManager {

    //a contact manager has a contact

    private String firstName;
    private String lastName;
    private String email;
    private long phoneNumber;

    public ContactManager (String firstName, String lastName, String email, long phoneNumber) {
        System.out.println("you've added " + firstName + " to your contacts");
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        //binding values

    }

    public String getFirstName(){
        return firstName;
    }



}
