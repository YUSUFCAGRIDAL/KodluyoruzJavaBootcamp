package hafta_01;

import java.util.Scanner;

public class Odev_11_ToplamProgrami {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int toplam = 0;
            int girilenSayi;

            do {
                System.out.print("Bir sayı giriniz (Programı sonlandırmak için 0 girin): ");
                girilenSayi = scanner.nextInt();

                if (girilenSayi % 2 == 0 && girilenSayi % 4 == 0) {
                    toplam += girilenSayi;
                }
            } while (girilenSayi != 0);

            System.out.println("Girilen değerlerden çift ve 4'ün katları olan sayıların toplamı: " + toplam);

            scanner.close();
        }
    }




