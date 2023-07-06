package hafta_01;

import java.util.Scanner;

//Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
public class Odev_05_SayiSiralama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen birinci sayıyı giriniz");
        int a = scan.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz");
        int b = scan.nextInt();
        System.out.println("Lütfen üçüncü sayıyı giriniz");
        int c = scan.nextInt();

        if ((a>b) && (a>c)){
            if(b>c){
                System.out.println("a>b>c");
            }else{
                System.out.println("a>c>b");
            }
        } else if ((b>a) && (b>c)){
            if(a>c){
                System.out.println("b>a>c");
            }else{
                System.out.println("b>c>a");
            }
        }else {
            if(a>b){
                System.out.println("c>a>b");
            }else{
                System.out.println("c>b>a");
            }
        }

        scan.close();
    }
}
