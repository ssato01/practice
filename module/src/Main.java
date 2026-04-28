class Main {
    private static final int year = 2000;
    public static boolean isLeapYear() {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }
    static void main() {
        System.out.println(year + "年はうるう年か：" + isLeapYear());
    }
}