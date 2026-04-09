public class AudioBook implements LibraryResource {
    private String title;
    private String narrator;

    public AudioBook(String title, String narrator) {
        this.title = title;
        this.narrator = narrator;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrow() {
        System.out.println("Borrowed AudioBook: " + title + 
                           " | Narrated by: " + narrator);
    }
}