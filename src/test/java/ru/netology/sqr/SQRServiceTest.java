package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            "435,800,8",
            "30,121,2",
            "350,500,4"
    })
    void testDefaultLowerAndUpperBound(int lower, int upper, int expected) {
        SQRService service = new SQRService();
        //int lower = 100;
        //int upper = 1000;
        //int expected =22;
        int count = service.sqrOfNumbersRange(lower, upper);
        assertEquals(count, expected);

    }
}

