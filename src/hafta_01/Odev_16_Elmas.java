package hafta_01;

import java.util.Scanner;

public class Odev_16_Elmas {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Elmasın yüksekliğini giriniz: ");
            int yukseklik = scanner.nextInt();

            int bosluk = yukseklik - 1;
            int yildiz = 1;

            // Elmasın üst yarısı
            for (int i = 0; i < yukseklik; i++) {
                // Boşlukları bas
                for (int j = 0; j < bosluk; j++) {
                    System.out.print(" ");
                }

                // Yıldızları bas
                for (int k = 0; k < yildiz; k++) {
                    System.out.print("*");
                }

                System.out.println();

                bosluk--;
                yildiz += 2;
            }

            bosluk = 1;
            yildiz = yukseklik * 2 - 3;

            // Elmasın alt yarısı
            for (int i = 0; i < yukseklik - 1; i++) {
                // Boşlukları bas
                for (int j = 0; j < bosluk; j++) {
                    System.out.print(" ");
                }

                // Yıldızları bas
                for (int k = 0; k < yildiz; k++) {
                    System.out.print("*");
                }

                System.out.println();

                bosluk++;
                yildiz -= 2;
            }

            scanner.close();
        }
    }



