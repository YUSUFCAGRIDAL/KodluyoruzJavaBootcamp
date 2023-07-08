package hafta_02;
/*

 */
import java.util.Scanner;

public class Odev_02_Asal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (isAsal(sayi, sayi - 1)) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }

        scanner.close();
    }

    public static boolean isAsal(int sayi, int bolen) {
        if (bolen == 1) {
            return true;
        } else if (sayi % bolen == 0) {
            return false;
        } else {
            return isAsal(sayi, bolen - 1);
        }
    }

}
