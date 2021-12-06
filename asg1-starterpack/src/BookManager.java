import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookManager {
    // TODO: your code here
    // attribute books
    private ArrayList<Book> books;

    public BookManager() {
        books = new ArrayList<Book>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    /**
     * update this.books by reading books from file books.txt
     */
    public void loadFromFile() {
        try {
            File file = new File("books.txt");
            FileInputStream fist = new FileInputStream(file);
            ObjectInputStream oist = new ObjectInputStream(fist);

            books = (ArrayList<Book>) oist.readObject();
            oist.close();
            System.out.println("Loading books...");
        } catch (IOException | ClassNotFoundException io) {
            System.out.println(io.getMessage());
        }

        // TODO: your code here
    }

    /**
     * print books (one/line) in required format
     */
    public void printBooks(ArrayList<Book> books) {
        // TODO: your code here
        if (books.isEmpty()) {
            System.out.println("(empty)");
        }
        for (int i = 0; i < books.size(); i++) {
            System.out.printf("%-5s %-45s %-10s", "ID","Name","Price");
            System.out.printf("%5d %-45s %10.2f", books.get(i).getId(), books.get(i).getPrice(), books.get(i).getName());
        }
    }

    /**
     * if book.id is not duplicated, add book to this.books
     * return whether added or not
     */
    public boolean add(Book book) {
        // TODO: your code here
        return false;
    }

    /**
     * return book specified by id, null if not found
     */
    public ArrayList<Book> getBookById(int id) {
        // Initial the Book type into ArrayList<Book>
        // TODO: your code here
        ArrayList<Book> list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() != id) {
                list.add(books.get(i));
                System.out.println("Update Successfully.");
            } else {
                System.out.println("Invalid ID!");
            }
        }
        return list;
    }

    /**
     * delete book from this.books
     */
    public void delete(Book book) {
        // TODO: your code here
    }

    /**
     * update this.books to be sorted by price from high -> low
     */
    public void sortDescByPrice() {
        // TODO: your code here
        ArrayList<Book> list = new ArrayList<>();
        Collections.sort(list, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPrice() < o2.getPrice() ? 1 : -1;
            }
        });
        for (int i = 0; i < list.size(); i++) {
            System.out.format("%-5s %-45s %-10s","ID","Name","Price");
            System.out.printf("%5d %-45s %10.2f",list.get(i).getId(),list.get(i).getName(),list.get(i).getPrice());
        }
    }

    /**
     * return all books having name contains keyword (case in-sensitive)
     */
    public ArrayList<Book> searchByName(String keyword) {
        ArrayList<Book> matches = new ArrayList<>();
        for (int i = 0; i < matches.size(); i++) {
            if (matches.get(i).getName().contains(keyword)) {
                System.out.printf("%-5s %-45s %-10s", "id", "name", "price");
                System.out.printf("%5d %-45s %10.2f", books.get(i).getId(), books.get(i).getPrice(), books.get(i).getName());
            } else {
                System.out.println("(empty)");
            }
        }
        return matches;
    }

    /**
     * write this.books to file books.txt in required format
     */
    public void saveToFile() {
        // TODO: your code here
    }

}
