package fundamentals8;

public class Alexa extends ElectricalItem implements Turnable{

    public Alexa(String name, String brand) {
        super(name, brand);
    }

    public void turnOn(){
        System.out.println("Hello, this is alexa - you've switched me on!");
    }
}
