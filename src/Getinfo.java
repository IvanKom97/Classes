abstract class GetInfo {
    private String nameOfBook;
    private String firstName;
    private String secondName;
    private int year;
    private String[] twoAuthors;

    public GetInfo(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public GetInfo(String nameOfBook, int year) {
        this.year = year;
        this.nameOfBook = nameOfBook;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public GetInfo(String[] twoAuthors) {
        this.twoAuthors = twoAuthors;
    }

    public String namesOfAuthors() {


        String names = "Фамилии писателй: " + "\n";
        for (int i = 0; i < twoAuthors.length; i++) {
            names += twoAuthors[i] + "\n";
        }
        System.out.println(names);
        return names;
    }

}
