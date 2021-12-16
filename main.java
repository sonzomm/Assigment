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

        showMenu();
        while (true) {

            choose = scanner.nextLine();

            switch (choose) {
                case "1":
                    System.out.println("Add book");
                    bookManager.addBook(scanner);
                    break;
                case "2":
                    System.out.println("Edit book");
                    System.out.println("Enter id: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();
                    bookManager.editName(bookId);
                    break;
                case "3":
                    System.out.println("Delete book");
                    System.out.println("Enter id: ");
                    bookId = scanner.nextInt();
                    scanner.nextLine();
                    bookManager.delete(bookId);
                    break;
                case "4":
                    System.out.println("Sort By Id");
                    bookManager.sortById();
                    break;
                case "5":
                    System.out.println("Sort By Name");
                    bookManager.sortByName();
                    break;
                case "6":
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
        System.out.println("6.show all book");
        System.out.println("7.Exit");
        System.out.println("------------------------------");







    }
}
