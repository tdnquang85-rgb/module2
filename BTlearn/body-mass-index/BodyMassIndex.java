
// package body-mass-index;
import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Nhap can nang: ");
        weight = scanner.nextDouble();
        System.out.print("nhap chieu cao: ");
        height = scanner.nextDouble();
        // bmi = weight / (height * height);
        bmi = weight / Math.pow(height, 2);
        System.out.print("bmi= " + bmi);
        if (bmi < 18.5) {
            System.out.print("underweight");

        } else if (bmi < 25) {
            System.out.print("normal");

        } else if (bmi < 30) {
            System.out.print("overweight");

        } else
            System.out.print("obese");
    }

}
