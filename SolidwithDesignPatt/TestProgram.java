public class TestProgram {
    public static void main(String[] args) {

        BorrowService borrowService = new LibraryBorrowService();
        Student student = new Student("Zy", borrowService);

        // Existing resources
        LibraryResource book = new Book("How to Code for Dummy");
        LibraryResource journal = new Journal("AI Research 2025");

        // New resources (NO changes to Student or Service)
        LibraryResource audioBook = new AudioBook("Design Patterns", "John Smith");
        LibraryResource eJournal = new EJournal("Cloud Computing", "www.cloudjournal.com");

        // Borrowing all types
        student.borrow(book);
        student.borrow(journal);
        student.borrow(audioBook);
        student.borrow(eJournal);
    }
}