import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();
    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(Book book) {
        books.remove(book);
    }
    public void displayBooks() {
        System.out.println("Library Catalog:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(i+1 + ". Title: \"" + books.get(i).getTitle() +"\", Author: \"" + books.get(i).getAuthor() + "\", Year: " + books.get(i).getYear());
        }

    }

    public void findBooksByAuthor(String author) {
        System.out.println("Books by \"" + author + "\":");
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Title: \"" + book.getTitle() +"\", Author: \"" + book.getAuthor() + "\", Year: " + book.getYear());
            }
        }
    }

    public void borrowBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                System.out.println("You borrowed " + books.get(i).getTitle() + ".");
                books.remove(i);
                return;
            }
        }
        System.out.println("Book " + title +  " is not available.");
    }
    public void returnBook(Book book) {
        books.add(book);
        System.out.println("You returned \"" + book.getTitle() + "\".");
    }

    public boolean isBookAvailable(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book \"" + title + "\" is available.");
                return true;
            }
        }
        System.out.println("Book \"" + title + "\" is not available.");
        return false;
    }

    public double getAverageBookRating() {
        double avg = 0;
        double avg_real = 0;
        for (int i = 0; i < books.size(); i++) {
            double step = books.get(i).getRating();
            avg = avg + step;

        }
        avg_real = avg / books.size();
        System.out.println("Average book rating: " + avg_real);
        return avg_real;

    }

    public Book getMostReviewedBook() {
        if (books.isEmpty()) {
            return null;
        }
        Book mostReviewed = books.get(0);
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getReviews().size() > mostReviewed.getReviews().size()) {
                mostReviewed = books.get(i);
            }
        }
        return mostReviewed;
    }
    public void addUser(User user) {
        users.add(user);
    }
    public void borrowBook(String title, User user) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);

            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(i);
                user.borrowBook(book);
                System.out.println(user.getName() + " borrowed \"" + book.getTitle() + "\".");
                return;
            }
        }
        System.out.println("Book \" " + title + "\" is not available.");
    }

    public void returnBook(Book book, User user) {
        user.returnBook(book);
        books.add(book);
        System.out.println(user.getName() + "returned \"" + book.getTitle() + "\".");
    }
    // Add methods here
}