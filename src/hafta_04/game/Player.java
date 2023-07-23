package hafta_04.game;

import java.util.Scanner;

public class Player {
    private int health;
    private int damage;
    private int money;
    private String name;
    private String charName;
    private Scanner input = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public void selectChar() {
        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("Karakterler");
        System.out.println("-----------------------------------------------------------------------------");
        for (GameChar gameChar : charList) {
            System.out.println("ID : " + gameChar.getId() +
                    "\tKarakter: " + gameChar.getName() +
                    " \t\t Hasar: " + gameChar.getDamage() + "  " +
                    " \t\t Sağlık: " + gameChar.getHealth() +
                    " \t\t Para: " + gameChar.getMoney());
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Lütfen bir karakter seçiniz !");
        int selectChar = input.nextInt();
        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }

        System.out.println("Karakter : " + this.getCharName() +
                " , Hasar: " + this.getDamage() +
                " , Sağlık: " + this.getHealth() +
                " , Para: " + this.getMoney());

    }

    public void selectLoc(){
        Location location = null;
        System.out.println("Bölgeler ");
        System.out.println("1- Güvenli Ev ");
        System.out.println("2- Mağaza ");
        System.out.println("Lütfen gitmek istediğiniz bölgeyi seçiniz :  ");
        int selectLoc = input.nextInt();
        switch (selectLoc){
            case 1:
                location = new SafeHouse(this);
                break;
            case 2:
                location = new ToolStore(this);
                break;
            default:
                location = new SafeHouse(this);
        }
        location.onLocation();
    }

    public void initPlayer(GameChar gameChar) {
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }
}
