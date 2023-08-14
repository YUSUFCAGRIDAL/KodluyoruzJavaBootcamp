package hafta_05.Book;

import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        TreeSet<Book> books = new TreeSet<>();

        books.add(new Book("A Dummy", "Author C", 300, 2022));
        books.add(new Book("B Dummy", "Author A", 200, 2023));
        books.add(new Book("C Dummy", "Author E", 400, 2021));
        books.add(new Book("D Dummy", "Author D", 350, 2020));
        books.add(new Book("E Dummy", "Author B", 250, 2019));

        System.out.println("Kitaplar isme göre sıralandı");

        for (Book book : books) {
            System.out.println(book.name + " " + book.pages);
        }


        System.out.println("---------------------");
        TreeSet<Book> books2 = new TreeSet<>(new OrderByPagesComparator());

        books2.addAll(books);
        System.out.println("\nKitaplar sayfalarina gore siralandi:\n");

        for (Book b : books2) {
            System.out.println(b.name + " " + b.pages);
        }


    }



}
