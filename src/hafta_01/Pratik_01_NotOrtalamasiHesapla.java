package hafta_01;

/*
Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pratik_01_NotOrtalamasiHesapla {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Matematik notunuzu giriniz");
        int matematik = scan.nextInt();
        System.out.println("Lütfen Fizik notunuzu giriniz");
        int fizik = scan.nextInt();
        System.out.println("Lütfen Kimya notunuzu giriniz");
        int kimya = scan.nextInt();
        System.out.println("Lütfen Türkçe notunuzu giriniz");
        int turkce = scan.nextInt();
        System.out.println("Lütfen Tarih notunuzu giriniz");
        int tarih = scan.nextInt();
        System.out.println("Lütfen Müzik notunuzu giriniz");
        int muzik = scan.nextInt();

        int ort = (matematik+fizik+kimya+turkce+tarih+muzik)/6;

        System.out.println("Ortalama ="+ ort);

        boolean gecti = ort>60;

        while (gecti){
            System.out.println("Sınıfı geçti");


        }
        scan.close();
    }

}


