package fundamentals8;

public class Telephone extends ElectricalItem implements Turnable{


    public Telephone(String name, String brand) {
        super(name, brand);
    }

    public void turnOn(){
        System.out.println("I'm a telephone and now i'm ON!");
    }
}
