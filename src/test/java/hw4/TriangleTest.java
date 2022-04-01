package hw4;

import org.example.home4.Perimeter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    void successCalculationTest() throws Exception {
        Assertions.assertEquals(Perimeter.calculateArea(2,4,3),2.9047375096555625);
    }

    @Test
    void generatedTrial() {
        Assertions.assertThrows(Exception.class, ()-> Perimeter.calculateArea(2,0,2));
    }

    @Test
    void generatedTrial2() {
        Assertions.assertThrows(Exception.class, ()-> Perimeter.calculateArea(7,1,2));
    }

}
