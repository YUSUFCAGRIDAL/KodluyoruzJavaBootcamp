package hafta_01;

import java.util.Scanner;

public class Odev_12_Faktoriyel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N sayısını giriniz: ");
        int n = scanner.nextInt();

        System.out.print("R sayısını giriniz: ");
        int r = scanner.nextInt();

        int kombinasyon = hesaplaKombinasyon(n, r);

        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);

        scanner.close();


    }

    public static int hesaplaKombinasyon(int n, int r) {
        int faktoriyelN = faktoriyelHesapla(n);
        int faktoriyelR = faktoriyelHesapla(r);
        int faktoriyelNR = faktoriyelHesapla(n - r);

        int kombinasyon = faktoriyelN / (faktoriyelR * faktoriyelNR);
        return kombinasyon;
    }

    public static int faktoriyelHesapla(int sayi) {
        int faktoriyel = 1;

        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }

        return faktoriyel;
    }

}
