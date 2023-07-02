package hafta_01;
/*
Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
 */


import java.util.Map;
import java.util.Scanner;

public class Pratik_03_Hipotenus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kenar giriniz: ");
        int a = scan.nextInt();
        System.out.println("Kenar giriniz: ");
        int b = scan.nextInt();
        double c= Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs ="+c);




        scan.close();
    }
}
