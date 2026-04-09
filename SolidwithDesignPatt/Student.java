public class Student {
    private String name;
    private BorrowService borrowService;

    public Student(String name, BorrowService borrowService) {
        this.name = name;
        this.borrowService = borrowService;
    }

    public void borrow(LibraryResource resource) {
        System.out.println(name + " is borrowing:");
        borrowService.borrowResource(resource);
    }
}