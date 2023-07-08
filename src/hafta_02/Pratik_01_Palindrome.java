package hafta_02;

import java.util.Scanner;

public class Pratik_01_Palindrome {
    public static boolean isPalindrom(int sayi) {
        int tersi = 0;
        int originalSayi = sayi;

        while (sayi != 0) {
            int kalan = sayi % 10;
            tersi = tersi * 10 + kalan;
            sayi = sayi / 10;
        }

        return (originalSayi == tersi);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (isPalindrom(sayi)) {
            System.out.println(sayi + " bir palindrom sayıdır.");
        } else {
            System.out.println(sayi + " bir palindrom sayı değildir.");
        }

        scanner.close();
    }
    }

