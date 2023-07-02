package hafta_01;

import java.util.Scanner;

/*
KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
 */
public class Pratik_02_KDVHesabi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Fiyat giriniz");
        float fiyat = scan.nextFloat();
        float kdv=0;

        if(fiyat>0 && fiyat <=1000){
            kdv= (float) 0.18;
        } else if (fiyat>1000) {
            kdv= (float) 0.08;
        }

        System.out.println("KDV'siz Fiyat ="+fiyat);
        System.out.println("KDV'li Fiyat ="+fiyat*(1+kdv));
        System.out.println("KDV Tutarı ="+(fiyat*kdv));


        scan.close();
    }
}
