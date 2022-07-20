package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/ForTests.csv")
    public void testSQRTRange(int expected, int min, int max) {
        SQRService service = new SQRService();
        int actual = service.calcSqrtRange(min, max);
        Assertions.assertEquals(expected, actual);
    }

    /*
    @ParameterizedTest
    public void testSQRTInTheRange(int expected, int min, int max) {
        int expected = 8;
        SQRService service = new SQRService();
        int actual = service.calcSqrtRange(200, 500);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSQRTOutTheRange(int expected, int min, int max) {
        int expected = 0;
        SQRService service = new SQRService();
        int actual = service.calcSqrtRange(20, 50);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSQRTRangeAll(int expected, int min, int max) {
        int expected = 90;
        SQRService service = new SQRService();
        int actual = service.calcSqrtRange(100, 9805);
        Assertions.assertEquals(expected, actual);

    */
}
