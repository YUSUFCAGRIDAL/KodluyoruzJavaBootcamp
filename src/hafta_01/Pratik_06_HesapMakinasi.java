package hafta_01;

import java.util.Scanner;

public class Pratik_06_HesapMakinasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İlk Sayıyı Girinir : ");
        int n1 = input.nextInt();

        System.out.println("İkinci Sayıyı Girinir : ");
        int n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiniz :");
        int select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplama "+(n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma "+(n1-n2));
                break;
            case 3:
                System.out.println("Çarpma "+(n1*n2));
                break;
            case 4:
                System.out.println("Bölme "+(n1/n2));
                break;
            default:
                break;
        }



    }
}
