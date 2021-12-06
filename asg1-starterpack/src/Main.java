import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Scanner s = new Scanner(System.in);
        System.out.println("______________________________");
        System.out.println("1. list all books\n2. add a new book");
        System.out.println("3. edit book\n4. delete a book");
        System.out.println("5. search books by name\n6. sort books descending by price\n");
        System.out.println();
        System.out.println("0. save & exit\nYour option: ");
        int choice = s.nextInt();
        s.nextLine();

        switch (choice){
            case 1:
               bookManager.loadFromFile();
               break;
            case 2:
                
                break;
        }
    }
}
