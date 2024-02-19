// Encapsulation: Book class with private fields and public methods
class Book {
    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    // Getters for encapsulation
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

// Inheritance: LibraryItem class as base class for Book and DVD
class LibraryItem {
    private int itemId;
    private String itemName;
    private int availableCopies;

    public LibraryItem(int itemId, String itemName, int availableCopies) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.availableCopies = availableCopies;
    }

    // Getters for encapsulation
    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void checkOutItem() {
        if (availableCopies > 0) {
            availableCopies--;
            System.out.println("Item checked out successfully: " + itemName);
        } else {
            System.out.println("Item not available for checkout: " + itemName);
        }
    }

    public void returnItem() {
        availableCopies++;
        System.out.println("Item returned successfully: " + itemName);
    }
}

// Polymorphism: Book class extending LibraryItem
class BookItem extends LibraryItem {
    private Book book;

    public BookItem(int itemId, Book book, int availableCopies) {
        super(itemId, book.getTitle(), availableCopies);
        this.book = book;
    }

    // Overriding display methods
    @Override
    public String getItemName() {
        return book.getTitle() + " by " + book.getAuthor();
    }
}

// Abstraction: Interface for LibraryUser
interface LibraryUser {
    void checkOutItem(LibraryItem item);
    void returnItem(LibraryItem item);
}

// Abstraction: User class implementing LibraryUser
class User implements LibraryUser {
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    @Override
    public void checkOutItem(LibraryItem item) {
        System.out.println(userName + " is checking out: " + item.getItemName());
        item.checkOutItem();
    }

    @Override
    public void returnItem(LibraryItem item) {
        System.out.println(userName + " is returning: " + item.getItemName());
        item.returnItem();
    }
}

public class LibrarySystemExample {
    public static void main(String[] args) {
        Book book1 = new Book(1, "To Kill a Mockingbird", "Harper Lee");
        Book book2 = new Book(2, "1984", "George Orwell");

        BookItem bookItem1 = new BookItem(101, book1, 3);
        BookItem bookItem2 = new BookItem(102, book2, 5);

        User user1 = new User("Uday");
        User user2 = new User("Kiran");

        user1.checkOutItem(bookItem1);
        user2.checkOutItem(bookItem2);

        user1.returnItem(bookItem1);
        user2.returnItem(bookItem2);
    }
}
