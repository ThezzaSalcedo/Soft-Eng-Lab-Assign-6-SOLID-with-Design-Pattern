public class EJournal implements LibraryResource {
    private String title;
    private String website;

    public EJournal(String title, String website) {
        this.title = title;
        this.website = website;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrow() {
        System.out.println("Accessing E-Journal: " + title + 
                           " | URL: " + website);
    }
}