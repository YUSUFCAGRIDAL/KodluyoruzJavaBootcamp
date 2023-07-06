package hafta_01;

import java.util.Scanner;

public class Odev_21_TersUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int basamak = 1;

        // Basamak sayısını bulma
        int temp = sayi;
        while (temp >= 10) {
            temp /= 10;
            basamak++;
        }

        // Ters üçgeni çizme
        for (int i = basamak; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();


    }
}
