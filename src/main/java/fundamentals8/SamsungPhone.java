package fundamentals8;

public class SamsungPhone {

    //attributes/states
    PhoneMeasurements measurements; //storing the class object as a variable
    PhoneFeatures features; // 'has a' association - a phone has features
    private double price;
    private String brand;


    //constructor
    public SamsungPhone (double price,
                                 String brand,
                                 PhoneMeasurements measurements,
                                 PhoneFeatures features ){


        this.price = price;
        this.brand = brand;
        this.measurements = measurements;
        this.features = features;
        //binding object values to internal class values

    }

    //methods

    public void call(String name) {
        System.out.println("I'm calling " + name);

    }

}
