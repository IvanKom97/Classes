public class Book extends  GetInfo {
    private Author author;
    public Book(String nameOfBook, int year, Author author) {
        super(nameOfBook, year);
        this.author = author;

    }


    @Override
    public void setYear(int year) {
        int years = super.getYear();
        if (year > 2000) {
            System.out.println("Книга свежая, 21 века");
        } else System.out.println("Издание старенькое" );
        super.setYear(year);
    }
}
