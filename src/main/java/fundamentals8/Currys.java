package fundamentals8;

public class Currys {

    public static void main(String[] args) {

        ElectricalItem phone = new ElectricalItem("iphone", "Apple");

        Telephone iphone = new Telephone("iphoneX", "Samsung");

        iphone.turnOn();

        Alexa speaker = new Alexa("alexa", "Amazon");

        speaker.turnOn();

        Turnable galaxy = new Telephone("huaweitch", "Google");
        //data type - interface
        //variable name - galaxy
        //new instance of Telephone class
        //can pass this around and interchan

    }
}
