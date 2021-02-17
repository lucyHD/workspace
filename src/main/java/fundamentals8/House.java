package fundamentals8;

public class House {
//house is the superclass - it is the class the subclasses will inherit from

    // states
    int windows;
    //if you don't want these to be modified, declare them as final
     String name;
    private String material = "bricks"; //private = restricted access

    //constructor - must be public, can't have a return type (like void or anything else), and have the same name as the class

    // constructors take parameters
    public  House(int y){
        windows = y;

    }

    //behaviours;

   static void makeAlive(){
        System.out.println("i'M ALIIIIVE!");
    }

    //if a method is static, it belongs to the class rather than any object created from it

    public void addGarden(int squareFeet){
        System.out.println(squareFeet + " square feet of garden added to house ");
    }
    //creating a new method which takes its parameter when called.

    public String getMaterial(){
        return material;  //returns the value of the variable
    }

    public void setMaterial(String newMaterial){
        this.material = newMaterial;
    } // set method takes a parameter, and assigns that parameter to the material variable in this current object

}
