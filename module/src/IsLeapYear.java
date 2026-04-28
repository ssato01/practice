public class IsLeapYear {

    private final int year;

    public IsLeapYear(int year) {
        this.year = year;
    }

    public static boolean isLeapYear(int year) {
        boolean isLeap = false;

        if(year % 4 == 0) {
            if(!(year % 100 == 0 && year % 400 != 0)) {
                isLeap = true;
            }
        }

        return isLeap;
    }

    static void main() {
        IsLeapYear ily = new IsLeapYear(2100);
        System.out.println(ily.year + "年はうるう年か：" + isLeapYear(ily.year));
    }

}
