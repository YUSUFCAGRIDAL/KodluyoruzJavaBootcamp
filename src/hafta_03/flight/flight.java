package hafta_03.flight;
/*
Uçuşların ve pilotların yönetimi için bir sistem tasarlayın.

Hava yolu şirketleri uçuşları gerçekleştirir. Her hava yolunun bir kimliği vardır.
Hava yolu şirketi, farklı tipteki uçaklara sahiptir.

Uçaklar çalışır veya onarım durumunda olabilir.
Her uçuşun benzersiz kimliği, kalkacağı ve ineceği havaalanı, kalkış ve iniş saatleri vardır.
Her uçuşun bir pilotu ve yardımcı pilotu vardır ve uçağı kullanırlar.
Havaalanlarının benzersiz kimlikleri ve isimleri vardır.
Hava yolu şirketlerinin pilotları vardır ve her pilotun bir deneyim seviyesi mevcuttur.
Bir uçak tipi, belirli sayıda pilota ihtiyaç duyabilir.
 */

import java.util.ArrayList;
import java.util.List;

public class flight {




}



// Hava Yolu Şirketi sınıfı
class HavaYoluSirketi {
    private int kimlik;
    private List<Ucak> ucaklar;
    private List<Pilot> pilotlar;

    public HavaYoluSirketi(int kimlik) {
        this.kimlik = kimlik;
        this.ucaklar = new ArrayList<>();
        this.pilotlar = new ArrayList<>();
    }

    // Uçak ekleme ve kaldırma metotları
    public void ucakEkle(Ucak ucak) {
        ucaklar.add(ucak);
    }

    public void ucakKaldir(Ucak ucak) {
        ucaklar.remove(ucak);
    }

    // Pilot ekleme ve kaldırma metotları
    public void pilotEkle(Pilot pilot) {
        pilotlar.add(pilot);
    }

    public void pilotKaldir(Pilot pilot) {
        pilotlar.remove(pilot);
    }
}

// Uçak sınıfı
class Ucak {
    private int kimlik;
    private String tip;
    private boolean calisiyor;

    public Ucak(int kimlik, String tip) {
        this.kimlik = kimlik;
        this.tip = tip;
        this.calisiyor = true;
    }

    // Uçağın durumunu güncelleme metotları
    public void uctu() {
        this.calisiyor = true;
    }

    public void onarimaAlindi() {
        this.calisiyor = false;
    }
}

// Uçuş sınıfı
class Ucus {
    private int kimlik;
    private Havaalanı kalkisHavaalani;
    private Havaalanı varisHavaalani;
    private String kalkisSaati;
    private String varisSaati;
    private Pilot pilot;
    private Pilot yardimciPilot;

    public Ucus(int kimlik, Havaalanı kalkisHavaalani, Havaalanı varisHavaalani,
                String kalkisSaati, String varisSaati, Pilot pilot, Pilot yardimciPilot) {
        this.kimlik = kimlik;
        this.kalkisHavaalani = kalkisHavaalani;
        this.varisHavaalani = varisHavaalani;
        this.kalkisSaati = kalkisSaati;
        this.varisSaati = varisSaati;
        this.pilot = pilot;
        this.yardimciPilot = yardimciPilot;
    }
}

// Havaalanı sınıfı
class Havaalanı {
    private int kimlik;
    private String isim;

    public Havaalanı(int kimlik, String isim) {
        this.kimlik = kimlik;
        this.isim = isim;
    }
}

// Pilot sınıfı
class Pilot {
    private int kimlik;
    private String isim;
    private String deneyimSeviyesi;

    public Pilot(int kimlik, String isim, String deneyimSeviyesi) {
        this.kimlik = kimlik;
        this.isim = isim;
        this.deneyimSeviyesi = deneyimSeviyesi;
    }
}
