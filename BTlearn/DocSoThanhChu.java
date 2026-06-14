import java.util.Scanner;

public class DocSoThanhChu {

    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so can doc: ");
        num = scanner.nextInt();
        if ((num >= 0) & (num < 10)) {
            switch (num) {
                case 0:
                    System.out.println(num + " zero");
                    break;
                case 1:
                    System.out.println(num + " one");
                    break;
                case 2:
                    System.out.println(num + " two");
                    break;
                case 3:
                    System.out.println(num + " three");
                    break;
                case 4:
                    System.out.println(num + " four");
                    break;
                case 5:
                    System.out.println(num + " five");
                    break;
                case 6:
                    System.out.println(num + " six");
                    break;
                case 7:
                    System.out.println(num + " seven");
                    break;
                case 8:
                    System.out.println(num + " eight");
                    break;
                case 9:
                    System.out.println(num + " nine");
                    break;

                default:

                    System.out.println(num + " out of ability");

                    break;
            }
        } else if ((num >= 10) & (num < 20)) {
            // doc 2so
            int donVi;
            donVi = num % 10;
            switch (donVi) {
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
                default:
                    System.out.println("out of ability");
                    break;
            }

        } else if ((num >= 20) & (num < 100)) {
            int numChuc = num / 10;
            int numDonVi = num % 10;
            String chuoiChuc = "";
            String chuoiDonVi = "";
            switch (numChuc) {
                // case 0: chuoiChuc=""; break;
                // case 1: chuoiChuc=""; break;
                case 2:
                    chuoiChuc = "twenty";
                    break;
                case 3:
                    chuoiChuc = "thirty";
                    break;
                case 4:
                    chuoiChuc = "fourty";
                    break;
                case 5:
                    chuoiChuc = "fifty";
                    break;
                case 6:
                    chuoiChuc = "sixty";
                    break;
                case 7:
                    chuoiChuc = "seventy";
                    break;
                case 8:
                    chuoiChuc = "eighty";
                    break;
                case 9:
                    chuoiChuc = "ninety";
                    break;
                default:
                    chuoiChuc = "";
                    break;

            }
            System.out.print(chuoiChuc);
            switch (numDonVi) {
                case 0:
                    chuoiDonVi = "";
                    break;
                case 1:
                    chuoiDonVi = "one";
                    break;
                case 2:
                    chuoiDonVi = "two";
                    break;
                case 3:
                    chuoiDonVi = "thee";
                    break;
                case 4:
                    chuoiDonVi = "four";
                    break;
                case 5:
                    chuoiDonVi = "five";
                    break;
                case 6:
                    chuoiDonVi = "six";
                    break;
                case 7:
                    chuoiDonVi = "seven";
                    break;
                case 8:
                    chuoiDonVi = "eight";
                    break;
                case 9:
                    chuoiDonVi = "nine";
                    break;
                default:
                    break;
            }
            System.out.print(" " + chuoiDonVi);
        }

    }
}