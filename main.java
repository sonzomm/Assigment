package Assignment;

import Assignment.contronlers.BookManager;
import Assignment.models.Book;
import Assignment.services.BookDataServices;
import B14_Miniproject.contronlers.StudentManager;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String choose = null;
        boolean exit = false;
        BookManager bookManager = new BookManager("src/main/resources/book-input.txt");
        BookDataServices service = new BookDataServices();
        List<Book> books = service.read("src/main/resources/book-input.txt");
        showMenu();
        while (true) {

            choose = scanner.nextLine();

            switch (choose) {
                case "1":
                    System.out.println("Add book");
                    bookManager.addBook(scanner);
                    System.out.println("Add book successfully");
                    break;
                case "2":
                    System.out.println("Edit book");
                    System.out.println("Enter id: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();
                    bookManager.editName(bookId);
                    bookManager.editAuthor(bookId);
                    bookManager.editLanguage(bookId);
                    bookManager.editPrice(bookId);
                    System.out.println("Edit book successfully");
                    break;
                case "3":
                    System.out.println("Delete book");
                    System.out.println("Enter id: ");
                    bookId = scanner.nextInt();
                    scanner.nextLine();
                    bookManager.delete(bookId);
                    System.out.println("Delete book successfully");
                    break;
                case "4":
                    System.out.println("Sort By Id");
                    bookManager.sortById();
                    bookManager.showAll();
                    break;
                case "5":
                    System.out.println("Sort By Name");
                    bookManager.sortByName();
                    bookManager.showAll();
                    break;
                case "6":
                    System.out.println("Sort By Author");
                    bookManager.sortByAuthor();
                    bookManager.showAll();
                    break;
                case "7":
                    System.out.println("Sort By language");
                    bookManager.sortByLanguage();
                    bookManager.showAll();
                    break;
                case "8":
                    System.out.println("Sort By price");
                    bookManager.sortByPrice();
                    bookManager.showAll();
                    break;
                case"9":
                    System.out.println("Find by Name");
                    System.out.println("Enter Name:");
                    String nameToFind = scanner.nextLine();
                    System.out.println("The book you need is:");
                    System.out.println(bookManager.findByName(nameToFind));                                           break;
                case"10":
                    System.out.println("Find by Author");
                    System.out.println("Enter Author:");
                    String authorToFind = scanner.nextLine();
                    System.out.println("The book you need is:");
                    System.out.println(bookManager.findByAuthor(authorToFind));
                    break;
                case"11":
                    System.out.println("Find by publishDate");
                    System.out.println("Enter Category:");
                    String categoryToFind = scanner.nextLine();
                    System.out.println("The book you need is:");
                    System.out.println(bookManager.findByPublishDate(categoryToFind));
                    break;
                case "12":
                    System.out.println("show all book");
                    bookManager.showAll();
                    break;
                case "0":
                    System.out.println("Exit");
                    exit = true;
                    break;
                default:
                    System.out.println("Please choose action");
                    break;
            }

            if (exit) {
                break;
            }

            showMenu();
        }


    }
    public static void showMenu(){
        System.out.println("-------------Menu-------------");
        System.out.println("1.Add book");
        System.out.println("2.Edit book");
        System.out.println("3.Delete book");
        System.out.println("4.sort book by id");
        System.out.println("5.sort book by name");
        System.out.println("6.sort book by author");
        System.out.println("7.sort book by language");
        System.out.println("8.sort book by price");
        System.out.println("9.Find by Name");
        System.out.println("10.Find by Author");
        System.out.println("11.Find by Find by publishDate");
        System.out.println("12.show all book");
        System.out.println("0.Exit");
        System.out.println("------------------------------");







    }
}
