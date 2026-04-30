import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void isLeapYear() {
        CheckYear checkyear = new CheckYear(0);
        assertTrue(checkyear.isLeapYear(2028));
        assertFalse(checkyear.isLeapYear(2026));
        assertTrue(checkyear.isLeapYear(2000));
        assertFalse(checkyear.isLeapYear(2100));
    }
}