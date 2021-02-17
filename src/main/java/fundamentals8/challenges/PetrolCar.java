package fundamentals8.challenges;

public class PetrolCar extends FordCars implements GreenReduction {
    public PetrolCar(int emissionsInGrams, double storageCostPerDay, String colour) {
        super(emissionsInGrams, storageCostPerDay, colour);
    }

    @Override
    public void carIsGreen(int storageCost) {
        setEmissionsInGrams(storageCost);
    }
}
