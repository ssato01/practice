package leap;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    // Case1……True:4で割り切れ、100で割り切れないケース
    @org.junit.jupiter.api.Test
    void isLeapYear_target2028() {
        assertTrue(Util.isLeapYear(2028));
    }

    // Case2……False:4で割り切れないケース
    @org.junit.jupiter.api.Test
    void isLeapYear_target2026() {
        assertFalse(Util.isLeapYear(2026));
    }

    // Case3……False:100で割り切れるが、400で割り切れないケース
    @org.junit.jupiter.api.Test
    void isLeapYear_target2100() {
        assertFalse(Util.isLeapYear(2100));
    }

    // Case4……True:400で割り切れるケース
    @org.junit.jupiter.api.Test
    void isLeapYear_target2000() {
        assertTrue(Util.isLeapYear(2000));
    }

}
