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

        Location location = null;
        while (true){
            System.out.println();
            System.out.println("###################   Bölgeler   ################### ");
            System.out.println();
            System.out.println("1- Güvenli Ev --> Burası sizin için güvenli bir ev, düşman yoktur !");
            System.out.println("2- Mağaza --> Silah veya Zırh satın alabilirsiniz !");
            System.out.println("Lütfen gitmek istediğiniz bölgeyi seçiniz :  ");
            int selectLoc = input.nextInt();
            switch (selectLoc){
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }

            if(!location.onLocation())
            {
                System.out.println("GAME OVER!");
                break;
        }


        }

    }


}
