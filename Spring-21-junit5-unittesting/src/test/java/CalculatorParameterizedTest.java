import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class CalculatorParameterizedTest {

    @ParameterizedTest
    @ValueSource(strings = {"JS", "TS", "JAVA"})
    void testCase1(String str) {
        Assertions.assertNotNull(str);
    }

    @ParameterizedTest
    @ValueSource(strings = {"JS", "TS", "JAVA"})
    @EmptySource
    @NullSource
    @NullAndEmptySource
    void testCase2(String str) {
        System.out.println(str + 123);
        Assertions.assertNotNull(str);
    }

    @ParameterizedTest
    @MethodSource("getData")
    void testCase3(int i) {
        Assertions.assertTrue(i > 1);
    }

    static int[] getData() {
        return new int[]{1, 2, 3, 4, 5};
    }

    @ParameterizedTest
    @CsvSource({"10,20,30", "20,20,40", "10,50,60"})
    void testCase4(int num1, int num2, int result) {
        Assertions.assertEquals(result, Calculator.add(num1, num2));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/test-data.csv",numLinesToSkip = 1)
    void testCase5(int num1, int num2, int result) {
        Assertions.assertEquals(result, Calculator.add(num1, num2));
    }



}
