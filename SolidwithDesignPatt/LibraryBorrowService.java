public class LibraryBorrowService implements BorrowService{

    @Override
    public void borrowResource(LibraryResource resource){
        resource.borrow(); 
    }
}