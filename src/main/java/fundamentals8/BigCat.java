package fundamentals8;

public class BigCat {
//fields are ATTRIBUTES
    final int age = 17;
    String name;
    Requirements requirements; //another object


    public BigCat(String name,
                  Requirements requirements) {
        System.out.println( name + "says: I'm alive!");

//        this.age = age; //here we are binding the instance to the class
        this.name = name;
        this.requirements = requirements;
    }

    //methods are BEHAVIOURS
}
