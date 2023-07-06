package hafta_01;

import java.util.Scanner;

/*
Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
 */
public class Odev_04_HavaSicakligi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sıcaklık giriniz");
        int heat = scan.nextInt();

        if(heat<5){
            System.out.println("Kayak yapınız");
        }else if (heat<=15){
            System.out.println("Sinemaya gidiniz");
        }else if (heat<=25){
            System.out.println("Piknik yapınız");
        }else {
            System.out.println("Yüzmeye gidiniz");
        }



        scan.close();


    }
}
