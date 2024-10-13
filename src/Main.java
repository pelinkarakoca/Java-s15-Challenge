import library.collection.Author;
import library.collection.Book;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Author author1 = new Author("F. Scott Fitzgerald", 1L);
        Author author2 = new Author("Harper Lee", 2L);
        Author author3 = new Author("George Orwell", 3L);
        Author author4 = new Author("Herman Melville", 4L);
        Author author5 = new Author("Leo Tolstoy", 5L);
        Author author6 = new Author("Jane Austen", 6L);
        Author author7 = new Author("Homer", 7L);
        Author author8 = new Author("Fyodor Dostoevsky", 8L);
        Author author9 = new Author("Aldous Huxley", 9L);
        Author author10 = new Author("J.D. Salinger", 10L);
        Author author11 = new Author("James Joyce", 11L);
        Author author12 = new Author("Dante Alighieri", 12L);
        Author author13 = new Author("Miguel de Cervantes", 13L);
        Author author14 = new Author("J.R.R. Tolkien", 14L);
        Author author15 = new Author("Ray Bradbury", 15L);
        Author author16 = new Author("Charlotte Brontë", 16L);
        Author author17 = new Author("Mary Shelley", 17L);
        Author author18 = new Author("Gabriel García Márquez", 18L);

        // Creating a list to store 20 Book instances
        List<Book> books = new ArrayList<>();

        // Adding 20 Book instances to the list with corresponding authors
        books.add(new Book(1, "The Great Gatsby", true, 10.99, 180, 1, "English", author1, 1925));
        books.add(new Book(2, "To Kill a Mockingbird", true, 12.50, 281, 1, "English", author2, 1960));
        books.add(new Book(3, "1984", false, 15.00, 328, 1, "English", author3, 1949));
        books.add(new Book(4, "Moby Dick", true, 11.75, 635, 3, "English", author4, 1851));
        books.add(new Book(5, "War and Peace", false, 20.00, 1225, 2, "Russian", author5, 1869));
        books.add(new Book(6, "Pride and Prejudice", true, 9.50, 279, 1, "English", author6, 1813));
        books.add(new Book(7, "The Odyssey", true, 8.99, 500, 4, "Greek", author7, -700));
        books.add(new Book(8, "Crime and Punishment", false, 14.99, 671, 1, "Russian", author8, 1866));
        books.add(new Book(9, "Brave New World", true, 13.25, 311, 1, "English", author9, 1932));
        books.add(new Book(10, "The Catcher in the Rye", false, 10.50, 277, 1, "English", author10, 1951));
        books.add(new Book(11, "Ulysses", true, 18.75, 730, 1, "English", author11, 1922));
        books.add(new Book(12, "The Divine Comedy", true, 22.00, 798, 1, "Italian", author12, 1320));
        books.add(new Book(13, "Don Quixote", false, 17.50, 1072, 2, "Spanish", author13, 1605));
        books.add(new Book(14, "The Hobbit", true, 14.50, 310, 2, "English", author14, 1937));
        books.add(new Book(15, "Fahrenheit 451", false, 12.99, 194, 1, "English", author15, 1953));
        books.add(new Book(16, "Jane Eyre", true, 10.75, 500, 3, "English", author16, 1847));
        books.add(new Book(17, "Frankenstein", true, 11.99, 280, 1, "English", author17, 1818));
        books.add(new Book(18, "One Hundred Years of Solitude", false, 15.75, 417, 1, "Spanish", author18, 1967));


    }