package Assignment.models;

import java.lang.Double;
import java.util.Scanner;

public class Book {
    private int id;
    private String name;
    private String author;
    private String language;
    private Double price;
    private String publishDate;
    private int ISBN;

    public Book(){
    }
    public Book(int id,String name,String author,String language,Double price,String publishDate,int ISBN){
        this.id = id;
        this.name = name;
        this.author = author;
        this.language = language;
        this.price = price;
        this.publishDate = publishDate;
        this.ISBN = ISBN;
    }
    public Book input(Scanner sc){
        System.out.println("Enter Book id");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter name");
        String name = sc.nextLine();

        System.out.println("Enter author");
        String author = sc.nextLine();

        System.out.println("Enter language");
        String language = sc.nextLine();

        System.out.println("Enter price");
        Double price = sc.nextDouble();

        System.out.println("Enter publishData");
        String publishDate = (sc.nextLine());

        System.out.println("Enter ISBN");
        int ISBN = sc.nextInt();

        return new Book(id,name,author,language,price,publishDate,ISBN);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPublisDdate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", language='" + language + '\'' +
                ", price=" + price +
                ", publishDate='" + publishDate + '\'' +
                ", ISBN=" + ISBN +
                '}';
    }
}
