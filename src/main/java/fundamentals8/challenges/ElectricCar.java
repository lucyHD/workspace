package fundamentals8.challenges;

public class ElectricCar extends FordCars implements GreenReduction{
    public ElectricCar(int emissionsInGrams, double storageCostPerDay, String colour) {
        super(emissionsInGrams, storageCostPerDay, colour);
    }

    @Override
    public void carIsGreen(int storageCost) {
        setStorageCostPerDay(5);

    }
}
