package hafta_05.Book;
/*
Kitap Sıralayıcı


Book isminde bir sınıf tasarlayınız. Bu sınıf Comparable interface'den kalıtım alıp "compareTo" metodunu override ediniz. Bu metodun içinde kitabı A'dan Z'ye isme göre sıralayan kodu yazınız. Bu sınıftan 5 tane nesne oluşturun ve nesneleri Set tipinde bir yapısında saklayınız. Sonra ikinci kez Set tipinden bir veri yapısı kullanın ve kitapları sayfa sayısına göre sıralamasını sağlayınız.



Book sınıfı kitap ismi, sayfa sayısı, yazarın ismi, yayın tarihi değişkenlerinden oluşmaktadır.
 */
public class Book implements Comparable<Book> {
    public String name;
    public String author;
    public int pages;
    public int date;

    public Book(String name, String author, int pages, int date) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.date = date;
    }

    public Book(){

    }


    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name);
    }

    public int getPageNum(){
        return this.pages;
    }
}
