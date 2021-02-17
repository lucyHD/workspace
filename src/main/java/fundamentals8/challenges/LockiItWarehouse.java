package fundamentals8.challenges;

import org.assertj.core.internal.bytebuddy.dynamic.Transformer;

public class LockiItWarehouse {

    public static void main(String[] args) {

        FordCars car = new FordCars(80, 5, "blue");

        FordCars vanDiesel = new DieselCar(100, 10, "red");

        GreenReduction petrolio = new PetrolCar(85, 5, "black");

        GreenReduction lecky = new ElectricCar(55, 0, "green");

        System.out.println(lecky);

        lecky.carIsGreen(5);

        System.out.println(lecky);





    }
}
