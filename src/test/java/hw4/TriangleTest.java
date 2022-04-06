package hw4;

import org.example.home4.Perimeter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {
    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);
    @Test
    void successCalculationTest() throws Exception {
        Assertions.assertEquals(2.9047375096555625,Perimeter.calculateArea(2,4,3));
        logger.debug("Проверка логирования");
    }
    @Test
    void successCalculationTest2() throws Exception {
        assertThat(Perimeter.calculateArea(2,4,3)).isEqualTo(2.9047375096555625);
    }


    @Test
    void generatedTrial() {
        Assertions.assertThrows(Exception.class, ()-> Perimeter.calculateArea(2,0,2));
    }

    @Test
    void generatedTrial2() {
        Assertions.assertThrows(Exception.class, ()-> Perimeter.calculateArea(7,1,2));
        logger.error("Проверка логирования Exception");
    }

}
