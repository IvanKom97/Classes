public class Main {
    public static void main(String[] args) {
        Author author = new Author("Саша", "Пушкин");
        Book book = new Book("Красная шапочка", 1912, author);
        System.out.println("Имя писателя: " + author.getFirstName());
        book.setYear(1956);
        System.out.println("year of creating is: " + book.getYear());


        Author author1 = new Author(new String[]{"Есенин", "Михалков", "Балто"});

        author1.namesOfAuthors();
    }
}