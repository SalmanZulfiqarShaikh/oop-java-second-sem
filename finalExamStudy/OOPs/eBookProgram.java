package finalExamStudy.OOPs;
class Book {
    private String title;
    private String author;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter
    public String getTitle() { return title; }

    // Setter
    public void setTitle(String t) { title = t; }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class EBook extends Book {
    int sizeMB;

    EBook(String title, String author, int sizeMB) {
        super(title, author);
        this.sizeMB = sizeMB;
    }

    void display() {
        super.display();
        System.out.print("Size: " + sizeMB + "MB");
    }
}

public class eBookProgram {
    public static void main(String[] args) {
        Book b = new Book("OOP Basics", "Salman");
        b.display();

        EBook e = new EBook("Java OOP", "Salman", 15);
        e.display();
    }
}
