package hafta_01;

import java.util.Scanner;

/*
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
İpucu
Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
Toplam Tutar = (135-27)* 2 = 216 TL
 */
public class Odev_07_UcakBileti {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mesafe giriniz KM");
        int destination = scan.nextInt();
        System.out.println("Yaş giriniz");
        int age = scan.nextInt();
        System.out.println("Tek gidiş için 1, gidiş-dönüş için 2 giriniz");
        int way =scan.nextInt();
        double total=destination*(0.1);

        if((destination>0)&&(age>0)&&((way==1)||(way==2))){
            if(age<12){
                total=total*0.5;
            } else if (age<24) {
                total-=total*0.1;
            } else if (age<65) {
                total=total;
            }else {
                total-=total*0.3;
            }

            if(way==2){
                total*=2;
                total-=total*0.2;
            }

            System.out.println("Toplam tutar = "+total);


        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }

        scan.close();


    }
}
