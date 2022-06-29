package homework.books;

import java.util.Scanner;

public class BookDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add Book");
            System.out.println("Please input 2 for print all Books");
            System.out.println("Please input 3 for print Books by AuthorName");
            System.out.println("Please input 4 for print Books by Genre");
            System.out.println("Please input 5 for print Books by price range");


            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    addBook();
                    break;
                case 2:
                    bookStorage.printArray();
                    break;
                case 3:
                    System.out.println("please input author name");
                    String authorName = scanner.nextLine();
                    bookStorage.printBooksByAuthorName(authorName);
                    break;
                case 4:
                    System.out.println("please input genre");
                    String genre = scanner.nextLine();
                    bookStorage.printBooksByGenre(genre);
                    break;
                case 5:
                    System.out.println("please input min price range");
                    double minPrice = Double.parseDouble(scanner.nextLine());
                    System.out.println("please input max price range");
                    double maxPrice = Double.parseDouble(scanner.nextLine());
                    bookStorage.printPriceRange(minPrice,maxPrice);
                    break;
                default:
                    System.out.println("Invalid command");

            }
        }

    }

    private static void addBook() {
        System.out.println("Please input Book title");
        String title = scanner.nextLine();
        System.out.println("Please input Book authorName");
        String authorName = scanner.nextLine();
        System.out.println("Please input Book price");
        String price = scanner.nextLine();
        System.out.println("Please input Books count");
        String count = scanner.nextLine();
        System.out.println("Please input Book genre");
        String genre = scanner.nextLine();


        double p = Double.parseDouble(price);
        int c = Integer.parseInt(count);


        Book book = new Book(title, authorName, p,c,genre);
        bookStorage.add(book);
        System.out.println("book created");

    }

}