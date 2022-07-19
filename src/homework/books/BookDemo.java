package homework.books;

import homework.books.commands.Commands;
import homework.books.exception.AuthorNotFoundException;
import homework.books.model.Author;
import homework.books.model.Book;
import homework.books.model.User;
import homework.books.model.UserType;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;
import homework.books.storage.UserStorage;

import java.util.Scanner;

public class BookDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();
    private static UserStorage userStorage = new UserStorage();

    public static void main(String[] args) {
//        do {
//            System.out.println("PLEASE INPUT LOGIN AND PASSWORD");
//        } while (!scanner.nextLine().equals("admin") || !scanner.nextLine().equals("123456"));

        boolean run = true;
        while (run) {
            Commands.printLoginCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
                default:
                    System.out.println("Invalid command");

            }


        }


    }

    private static void login() {
        System.out.println("please input email, password");
        String emailPasswordStr = scanner.nextLine();
        String[] emailPassword = emailPasswordStr.split(",");
        User user = userStorage.getUserByEmail(emailPassword[0]);
        if (user == null) {
            System.out.println("User with" + emailPassword[0] + "does not exists!");
        } else {
            if (user.getPassword().equals(emailPassword[1])) {
                if (user.getUserType() == UserType.ADMIN) {
                    loginAdmin();
                } else if (user.getUserType() == UserType.USER) {
                    loginUser();
                }
            } else {
                System.out.println("password is wrong!");

            }
        }
    }

    private static void loginUser() {

        boolean run = true;
        while (run) {
            Commands.printUserCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }

            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.printArray();
                    break;
                case PRINT_BOOKS_BY_AUTHOR_NAME:
                    printBooksByAuthor();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    printBooksByGenre();
                    break;
                case PRINT_BOOK_BY_PRICE_RANGE:
                    printByPrice();
                    break;
                case PRINT_ADD_AUTHOR:
                    addAuthor();
                    break;
                default:
                    System.out.println("Invalid command");

            }
        }
    }


    private static void register() {
        System.out.println("please input name, surname, email, password");
        String userDataStr = scanner.nextLine();
        String[] userData = userDataStr.split(",");
        if (userData.length < 4){
            System.out.println("please input correct data!");
        }else {if (userStorage.getUserByEmail(userData[0]) == null) {
            User user = new User();
            user.setName(userData[0]);
            user.setSurname(userData[1]);
            user.setEmail(userData[2]);
            user.setPassword(userData[3]);
            user.setUserType(UserType.USER);
            userStorage.add(user);
            System.out.println("user created1");
        }else {
            System.out.println("user with" + userData[0] + "already exists");
        }

        }

    }

    private static void loginAdmin() {
        boolean run = true;
        while (run) {
            Commands.printAdminCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }

            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.printArray();
                    break;
                case PRINT_BOOKS_BY_AUTHOR_NAME:
                    printBooksByAuthor();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    printBooksByGenre();
                    break;
                case PRINT_BOOK_BY_PRICE_RANGE:
                    printByPrice();
                    break;
                case PRINT_ADD_AUTHOR:
                    addAuthor();
                    break;
                default:
                    System.out.println("Invalid command");

            }
        }
    }


    private static void printBooksByGenre() {
        System.out.println("please input genre");
        String genre = scanner.nextLine();
        bookStorage.printBooksByGenre(genre);
    }

    private static void printBooksByAuthor() {
        authorStorage.printArray();

        System.out.println("please input author");
        try {
            int authorIndex = Integer.parseInt(scanner.nextLine());
            Author author = authorStorage.getAuthorIndex(authorIndex);
            bookStorage.printBooksByAuthor(author);
        } catch (AuthorNotFoundException | NumberFormatException e) {
            System.out.println("please input correct index");
        }
    }

    private static void addAuthor() {
        System.out.println("please input Author name");
        String name = scanner.nextLine();
        System.out.println("please input Author surname");
        String surname = scanner.nextLine();
        System.out.println("please input Author email");
        String email = scanner.nextLine();
        System.out.println("please input Author gender");
        try {
            Gender gender = Gender.valueOf(scanner.nextLine());
            Author author = new Author(name, surname, email, gender);
            authorStorage.add(author);
        } catch (IllegalArgumentException e) {
            System.out.println("please input correct gender");
        }

    }

    private static void printByPrice() {
        System.out.println("please input min price range");
        double minPrice;
        try {
            minPrice = Double.parseDouble(scanner.nextLine());
            bookStorage.printPriceRange(minPrice, minPrice);
        } catch (NumberFormatException e) {
            System.out.println("please input correct min price");
        }

        System.out.println("please input max price range");
        double maxPrice;
        try {
            maxPrice = Double.parseDouble(scanner.nextLine());
            bookStorage.printPriceRange(maxPrice, maxPrice);

        } catch (NumberFormatException e) {
            System.out.println("please input correct max price");
        }
    }

    private static void addBook() {
        authorStorage.printArray();
        System.out.println("Please input Author index");
        Author author = null;

        try {
            int index;
            index = Integer.parseInt(scanner.nextLine());
            author = authorStorage.getAuthorIndex(index);
        } catch (AuthorNotFoundException | NumberFormatException e) {
            System.out.println("please input correct index");
        }

        System.out.println("Please input Book title");
        String title = scanner.nextLine();
        System.out.println("Please input Book price");
        String price = scanner.nextLine();
        System.out.println("Please input Books count");
        String count = scanner.nextLine();
        System.out.println("Please input Book genre");
        String genre = scanner.nextLine();


        double p;
        int c;
        try {
            p = Double.parseDouble(price);
            bookStorage.printPriceRange(p, p);
            c = Integer.parseInt(count);
            Book book = new Book(title, author, p, c, genre);
            bookStorage.add(book);
            System.out.println("book created");

        } catch (NumberFormatException e) {
            System.out.println("please input correct number");
        }


    }

}