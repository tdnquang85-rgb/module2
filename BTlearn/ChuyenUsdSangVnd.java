import java.util.Scanner;

public class ChuyenUsdSangVnd {
    public static void main(String[] args) {
        double tienUsd, tienVnd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so tien usd: ");
        tienUsd = scanner.nextDouble();
        tienVnd = tienUsd * 23000;
        System.out.print("so tien USD " + tienUsd + "$ sau khi doi la: " + tienVnd);

    }

}
