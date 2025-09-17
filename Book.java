class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "no title";
        author = "no author";
        price = 0;
    }

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void show() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java", "James", 450);
        b1.show();
        b2.show();
    }
}
