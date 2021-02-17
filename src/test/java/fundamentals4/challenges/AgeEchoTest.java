package fundamentals4.challenges;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AgeEchoTest {
    // testing methods should always be void - they
    // should never return anything

    @Test
    @DisplayName("When age is over sixty return yes")
    public void shouldReturnDoubleStringWhenGivenAgeOverSixty() {
        //ARRANGE
        String name = "Andy";
        int age = 78;

        String expectedResult = "YES";

        //ACT
        String result = AgeEcho.ageStrng(name, age);

       //ASSERT

        Assertions.assertThat(result).isEqualTo(expectedResult);


    }


}
