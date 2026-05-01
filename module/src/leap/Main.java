import leap.Util;

import java.util.InputMismatchException;
import java.util.Scanner;

void main() {
    int year;
    Scanner sc = new Scanner(System.in);
    System.out.println("うるう年判定を行います。年を入力してください");

    while(true) {
        try {
            year = sc.nextInt();
            if (year >= 1) {
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

    System.out.println(year + "年はうるう年か：" + Util.isLeapYear(year));
    sc.close();

}
