package hafta_01;
/*
Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)

Çıktısı
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173
 */

import java.util.Scanner;

public class Odev_01_VucutKitle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz");
        double boy = scan.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz");
        int kilo = scan.nextInt();

        double endeks = (kilo / (boy*boy)) ;

        System.out.println("Vücut kitle indeksiniz : "+endeks);


        scan.close();

    }
}
