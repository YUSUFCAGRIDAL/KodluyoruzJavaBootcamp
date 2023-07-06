package hafta_01;

import java.util.Scanner;

public class Odev_18_EBOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        int ebob = hesaplaEbob(sayi1, sayi2);
        int ekok = hesaplaEkok(sayi1, sayi2);

        System.out.println("Girilen sayıların EBOB'u: " + ebob);
        System.out.println("Girilen sayıların EKOK'u: " + ekok);

        scanner.close();
    }

    public static int hesaplaEbob(int sayi1, int sayi2) {
        while (sayi2 != 0) {
            int temp = sayi2;
            sayi2 = sayi1 % sayi2;
            sayi1 = temp;
        }
        return sayi1;
    }

    public static int hesaplaEkok(int sayi1, int sayi2) {
        int ebob = hesaplaEbob(sayi1, sayi2);
        int ekok = (sayi1 * sayi2) / ebob;
        return ekok;
    }
}
