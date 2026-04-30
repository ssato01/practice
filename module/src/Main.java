import java.util.InputMismatchException;
import java.util.Scanner;

class CheckYear {
    protected final int year;

    public CheckYear(int year) {
        this.year = year;
    }
    public boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }
}

class Main {
    static void main() {
        CheckYear checkyear;
        Scanner sc = new Scanner(System.in);
        System.out.println("うるう年判定を行います。年を入力してください");

        while(true) {
            try {
                int stdin = sc.nextInt();
                if (stdin >= 1) {
                    checkyear = new CheckYear(stdin);
                    break;
                }
                else {
                    System.out.println("年は正の整数で入力してください");
                }
            } catch (InputMismatchException e) {
                System.out.println("年は数値(正の整数)で入力してください");
                sc.next();
            }
        }

        System.out.println(checkyear.year + "年はうるう年か："
                + checkyear.isLeapYear(checkyear.year));
        sc.close();

    }
}