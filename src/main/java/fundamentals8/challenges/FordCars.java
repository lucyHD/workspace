package fundamentals8.challenges;

public class FordCars {

    private int emissionsInGrams;
    private double storageCostPerDay;
    private String colour;
    private boolean isGreen;


    public FordCars(int emissionsInGrams, double storageCostPerDay, String colour){
        this.emissionsInGrams = emissionsInGrams;
        this.storageCostPerDay = storageCostPerDay;
        this.colour = colour;

    }

    public int getEmissionsInGrams(){
        return emissionsInGrams;
    }

    public void setEmissionsInGrams(int emissions){ //setter is void as it's not returning anything, only setting something
        this.emissionsInGrams = emissions;
    }

    public double getStorageCostPerDay() {
        return storageCostPerDay;
    }

    public void setStorageCostPerDay(double storageCostPerDay) {
        this.storageCostPerDay = storageCostPerDay;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "FordCars{" +
                "emissionsInGrams=" + emissionsInGrams +
                ", storageCostPerDay=" + storageCostPerDay +
                ", colour='" + colour + '\'' +
                ", isGreen=" + isGreen +
                '}';
    }
}
