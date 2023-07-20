package hafta_03.zoo;
/*
Bir hayvanat bahçesindeki hayvanlar hakkındaki bilgileri takip etmek için bir sistem tasarlıyorsunuz.

Hayvanlar:
Atlar (atlar, zebralar, eşekler vb.),
Kedigiller (kaplanlar, aslanlar vb.),
Kemirgenler (sıçanlar, kunduzlar vb.) gibi gruplardaki türlerle karakterize edilir.

Hayvanlar hakkında depolanan bilgilerin çoğu tüm gruplamalar için aynıdır.
tür adı, ağırlığı, yaşı vb.

Sistem ayrıca her hayvan için belirli ilaçların dozajını alabilmeli => getDosage ()
Sistem Yem verme zamanlarını hesaplayabilmelidir => getFeedSchedule ()
Sistemin bu işlevleri yerine getirme mantığı, her gruplama için farklı olacaktır. Örneğin, atlar için yem verme algoritması farklı olup, kaplanlar için farklı olacaktır.

Polimorfizm modelini kullanarak, yukarıda açıklanan durumu ele almak için bir sınıf diyagramı tasarlayın.
 */

    // Hayvan sınıfı (Ana sınıf)
    class Hayvan {
        String turAdi;
        double agirlik;
        int yas;

        // Yem verme zamanlarını hesaplamak için sanal metot
        public void getFeedSchedule() {
            System.out.println("Genel yem verme zamanları.");
        }

        // İlaç dozajlarını almak için sanal metot
        public void getDosage() {
            System.out.println("Genel ilaç dozajı.");
        }
    }

    // Atlar sınıfı (Hayvan sınıfından türetilmiş)
    class Atlar extends Hayvan {
        // Atlara özel özellikler eklenebilir

        @Override
        public void getFeedSchedule() {
            System.out.println("Atlar için yem verme zamanları.");
        }

        @Override
        public void getDosage() {
            System.out.println("Atlar için ilaç dozajı.");
        }
    }

    // Kedigiller sınıfı (Hayvan sınıfından türetilmiş)
    class Kedigiller extends Hayvan {
        // Kedigillere özel özellikler eklenebilir

        @Override
        public void getFeedSchedule() {
            System.out.println("Kedigiller için yem verme zamanları.");
        }

        @Override
        public void getDosage() {
            System.out.println("Kedigiller için ilaç dozajı.");
        }
    }

    // Kemirgenler sınıfı (Hayvan sınıfından türetilmiş)
    class Kemirgenler extends Hayvan {
        // Kemirgenlere özel özellikler eklenebilir

        @Override
        public void getFeedSchedule() {
            System.out.println("Kemirgenler için yem verme zamanları.");
        }

        @Override
        public void getDosage() {
            System.out.println("Kemirgenler için ilaç dozajı.");
        }
    }

    public class Main {
        public static void main(String[] args) {
            // Polimorfizm kullanarak farklı hayvanları işleyebiliriz.
            Hayvan at = new Atlar();
            Hayvan kaplan = new Kedigiller();
            Hayvan kunduz = new Kemirgenler();

            // Her hayvanın özel metotları çağrılacak
            at.getFeedSchedule();
            at.getDosage();

            kaplan.getFeedSchedule();
            kaplan.getDosage();

            kunduz.getFeedSchedule();
            kunduz.getDosage();
        }
    }


