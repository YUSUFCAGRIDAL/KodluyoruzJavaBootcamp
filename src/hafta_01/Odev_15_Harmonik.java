package hafta_01;

import java.util.Scanner;

public class Odev_15_Harmonik {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Bir sayı giriniz: ");
            int sayi = scanner.nextInt();

            double harmonikSerisi = 0;

            for (int i = 1; i <= sayi; i++) {
                harmonikSerisi += (1.0 / i);
            }

            System.out.println("Girilen sayının harmonik serisi: " + harmonikSerisi);

            scanner.close();
        }
    }



