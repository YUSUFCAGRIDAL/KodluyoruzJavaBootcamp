package hafta_03.film;




// Film sınıfı
class Film {
    private int id;
    private String ad;
    private double fiyat;
    private boolean kiralanan;
    private boolean satilan;

    public Film(int id, String ad, double fiyat) {
        this.id = id;
        this.ad = ad;
        this.fiyat = fiyat;
        this.kiralanan = false;
        this.satilan = false;
    }

    public boolean isKiralanan() {
        return kiralanan;
    }

    public boolean isSatilan() {
        return satilan;
    }

    public void setKiralanan(boolean kiralanan) {
        this.kiralanan = kiralanan;
    }

    public void setSatilan(boolean satilan) {
        this.satilan = satilan;
    }

    public double getFiyat() {
        return 0;
    }

    public String getAd() {
        return null;
    }
}

// Kullanıcı sınıfı
class Kullanici {
    private int id;
    private String ad;
    private boolean abone;
    private double kredi;

    public Kullanici(int id, String ad) {
        this.id = id;
        this.ad = ad;
        this.abone = false;
        this.kredi = 0.0;
    }

    public boolean isAbone() {
        return abone;
    }

    public double getKredi() {
        return kredi;
    }

    public void aboneOl(double krediMiktari) {
        this.abone = true;
        this.kredi += krediMiktari;
    }

    public void krediYukle(double krediMiktari) {
        this.kredi += krediMiktari;
    }

    public void filmKiralama(Film film) {
        if (abone) {
            if (!film.isKiralanan() && kredi >= film.getFiyat()) {
                film.setKiralanan(true);
                kredi -= film.getFiyat();
                System.out.println(ad + " adlı kullanıcı " + film.getAd() + " filmini kiraladı.");
            } else {
                System.out.println("Kiralama işlemi başarısız. Yetersiz kredi veya film zaten kiralanmış.");
            }
        } else {
            System.out.println("Kiralama işlemi için abone olmanız gerekmektedir.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Film film1 = new Film(1, "Film 1", 10.0);
        Film film2 = new Film(2, "Film 2", 15.0);

        Kullanici kullanici1 = new Kullanici(1, "Kullanıcı 1");
        Kullanici kullanici2 = new Kullanici(2, "Kullanıcı 2");

        kullanici1.aboneOl(50.0);
        kullanici2.krediYukle(20.0);

        kullanici1.filmKiralama(film1); // Kullanıcı 1 adlı kullanıcı Film 1 filmini kiraladı.
        kullanici1.filmKiralama(film2); // Kiralama işlemi başarısız. Yetersiz kredi veya film zaten kiralanmış.
        kullanici2.filmKiralama(film2); // Kiralama işlemi için abone olmanız gerekmektedir.
    }
}
