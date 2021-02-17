package fundamentals8;

public class PhoneStore {

    public static void main(String[] args) {


        PhoneMeasurements newMeasures = new PhoneMeasurements(20, 40, 5);
        PhoneFeatures  newFeatures = new PhoneFeatures("blue", "android");
        //create new instance object of phone class
        SamsungPhone newPhone = new SamsungPhone(100, "Samsung", newMeasures, newFeatures);


        newPhone.call("Simon");

    }
}
