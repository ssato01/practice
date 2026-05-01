package leap;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @org.junit.jupiter.api.Test
    void isLeapYear_target2000() {
        assertTrue(Util.isLeapYear(2000));
    }
}
