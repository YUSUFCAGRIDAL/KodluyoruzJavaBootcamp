package hafta_04.game;

import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);


    public void start(){
        System.out.println("Macera oyununa hoşgeldiniz");
        System.out.println("Lütfen isim giriniz : ");
   //     String playerName = input.nextLine(); normalde kullanıcıdan alıyoruz ama şimdilik test için hız adına kendi adımızı yazdık
        Player player = new Player("Yusuf");
        System.out.println("Sayın "+player.getName()+" bu karanlık ve sisli adaya hoşgeldiniz !");
        System.out.println("Burada yaşananların hepsi gerçek !");
        System.out.println("Lütfen karakter seçiniz !");
        player.selectChar();


        player.selectLoc();
    }


}
