package hafta_01;

import java.util.Scanner;

public class Odev_10_OrtalamaHesaplama {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Bir sayı giriniz: ");
            int sayi = scanner.nextInt();

            int toplam = 0;
            int adet = 0;

            for (int i = 0; i <= sayi; i++) {
                if (i % 3 == 0 && i % 4 == 0) {
                    toplam += i;
                    adet++;
                }
            }

            double ortalama = (double) toplam / adet;

            System.out.println("0'dan " + sayi + " kadar olan 3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);

            scanner.close();
        }
    }


