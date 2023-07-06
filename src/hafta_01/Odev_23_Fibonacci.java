package hafta_01;

import java.util.Scanner;

public class Odev_23_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int elemanSayisi = scanner.nextInt();

        int ilkSayi = 0;
        int ikinciSayi = 1;

        System.out.println("Fibonacci Serisi:");

        if (elemanSayisi >= 1) {
            System.out.print(ilkSayi + " ");
        }

        if (elemanSayisi >= 2) {
            System.out.print(ikinciSayi + " ");
        }

        for (int i = 3; i <= elemanSayisi; i++) {
            int yeniSayi = ilkSayi + ikinciSayi;
            System.out.print(yeniSayi + " ");

            ilkSayi = ikinciSayi;
            ikinciSayi = yeniSayi;
        }

        scanner.close();
    }

}
