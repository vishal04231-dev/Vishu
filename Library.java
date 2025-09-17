import java.util.*;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String i, String t, String a) {
        ISBN = i;
        title = t;
        author = a;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    String format;

    EBook(String i, String t, String a, String f) {
        super(i, t, a);
        format = f;
    }

    void showDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);  // protected accessible
        System.out.println("Author: " + getAuthor()); // private via getter
        System.out.println("Format: " + format);
    }
}

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ISBN:");
        String i = sc.nextLine();
        System.out.println("Enter Title:");
        String t = sc.nextLine();
        System.out.println("Enter Author:");
        String a = sc.nextLine();
        System.out.println("Enter Format:");
        String f = sc.nextLine();

        EBook eb = new EBook(i, t, a, f);
        eb.showDetails();
    }
}
