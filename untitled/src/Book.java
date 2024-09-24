public class Book {
    private String Id;
    private String title;
    private Person author;

    Book(String id, String title, Person author) {
        this.Id = id;
        this.title = title;
        this.author = author;

    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public String toString() {

        return "Id: " + Id + ", Title: " + title + ",";
}


    @Override
    public boolean equals(Object o) {
        Book temp = (Book)o;

        return Id.equals(temp.getId());
    }


    @Override
    public Book clone() {
        return new Book(Id, title,  author.clone());
    }


}
