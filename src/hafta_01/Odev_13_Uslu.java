package hafta_01;

import java.util.Scanner;

public class Odev_13_Uslu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tabanı giriniz: ");
        int taban = scanner.nextInt();

        System.out.print("Üssü giriniz: ");
        int us = scanner.nextInt();

        int sonuc = 1;

        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }

        System.out.println("Sonuç: " + sonuc);

        scanner.close();
    }
}
