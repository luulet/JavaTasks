public class LibraryMain {
    public static void main(String[] args) {

        Book book1 = new Book(
                "Introduction to Java Programming",
                "John Smith",
                2020
        );

        Book book2 = new Book(
                "Data Structures and Algorithms",
                "Jane Doe",
                2018
        );

        Book book3 = new Book(
                "The Art of Fiction",
                "Alice Johnson",
                2019
        );

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks(); // task 1
        library.findBooksByAuthor("Jane Doe"); // task 1

        library.borrowBook("Data Structures and Algorithms"); //task 2
        library.returnBook(book2); // task 2

        library.isBookAvailable("The Art of Fiction"); // task 3
        library.isBookAvailable("The Art of Fiction 2"); // task 3

        book1.setRating(4.5); // task 4
        book1.addReview("Very clear and beginner friendly."); // task 4

        library.getAverageBookRating(); // task 5
        Book mostReviewed = library.getMostReviewedBook(); // task 5

        if (mostReviewed != null) { // task 5
            System.out.println("Most reviewed book: " + mostReviewed.getTitle()); // task 5
        } // task 5

        User lukija = new User("Lukija", 55); // task 6
        library.addUser(lukija); // task 6
        library.borrowBook("The Art of Fiction", lukija); // task 6


    }
}