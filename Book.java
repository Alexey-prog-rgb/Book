package org.example;

public class Book {
    final public static int BIG_BOOK_PAGES = 500;
    public String title;
    public int releaseYear;
    public String author;
    public int pages;

    public String toString() {
        return "[title: " + title + ", releaseYear: " + releaseYear + ", author: " + author + ", pages:" + pages + "]";
    }

    public Book(String title, int releaseYear, String author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
        System.out.println("Book created!" + this);
    }

    public boolean isBig(){
        return pages >= BIG_BOOK_PAGES;
    }

    public boolean matches(String word) {
        return (title.contains(word) || author.contains(word));
    }

    public int estimatedPrice(){
        int price = 3 * pages;
          if(price < 250) {
              price = 250;
          }
        return price;
    }

}
