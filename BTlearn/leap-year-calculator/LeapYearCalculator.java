// package leap-year-calculator;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.print("enter a year: ");
        year = scanner.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || ((year % 100 == 0) && (year % 400 == 0))) {
            System.out.print("nam " + year + " la nam nhuan");
        } else {
            // if ((year % 100 == 0) && (year % 400 != 0)) {
            // System.out.print("nam " + year + " khong phai la nam nhuan");
            // }
            System.out.print("nam " + year + " khong phai la nam nhuan");
        }
    }

}
