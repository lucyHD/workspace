package ChallengesAllTopics;

import org.assertj.core.api.Assertions;

import org.junit.jupiter.api.Test;

public class VehicleTest {

//    @Test
//
//    void whenVehicleCreatedClassExists(){
//
//        Vehicle vehicle = new Vehicle();
//
//        //can create new instance of Vehicle
//    }

    @Test

    void whenNewVehicleCreatedThenCheckEmissionRateNotEmpty(){

        //arrange

            Vehicle car = new Vehicle(2.0);
            double expectedResult = 2.0;
            double eRate = car.emissionRate;

        // act

        double result = Vehicle.checkEmissionRateExists(eRate);


        //assert

        Assertions.assertThat(result).isEqualTo(expectedResult);
    }
}
