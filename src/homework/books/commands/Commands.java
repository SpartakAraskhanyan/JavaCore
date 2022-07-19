package homework.books.commands;

public interface Commands {
    int LOGOUT = 0;
    int ADD_BOOK = 1;
    int PRINT_ALL_BOOKS = 2;
    int PRINT_BOOKS_BY_AUTHOR_NAME = 3;
    int PRINT_BOOKS_BY_GENRE = 4;
    int PRINT_BOOK_BY_PRICE_RANGE = 5;
    int PRINT_ADD_AUTHOR = 6;

    int EXIT = 0;
    int LOGIN = 1;
    int REGISTER = 2;


    static void printAdminCommands() {
        System.out.println("Please input " + LOGOUT + " LOGOUT");
        System.out.println("Please input " + ADD_BOOK + " for add Book");
        System.out.println("Please input " + PRINT_ALL_BOOKS + " for print all Books");
        System.out.println("Please input " + PRINT_BOOKS_BY_AUTHOR_NAME + " for print Books by Author");
        System.out.println("Please input " + PRINT_BOOKS_BY_GENRE + " for print Books by Genre");
        System.out.println("Please input " + PRINT_BOOK_BY_PRICE_RANGE + " for print Books by price range");
        System.out.println("Please input " + PRINT_ADD_AUTHOR + " for add author");

    }

    static void printLoginCommands() {
        System.out.println("Please input EXIT for exit");
        System.out.println("Please input LOGIN for add login");
        System.out.println("Please input REGISTER for print all register");

    }

    static void printUserCommands() {
        System.out.println("Please input " + LOGOUT + " LOGOUT");
        System.out.println("Please input " + ADD_BOOK + " for add Book");
        System.out.println("Please input " + PRINT_ALL_BOOKS + " for print all Books");
        System.out.println("Please input " + PRINT_BOOKS_BY_AUTHOR_NAME + " for print Books by Author");
        System.out.println("Please input " + PRINT_BOOKS_BY_GENRE + " for print Books by Genre");
        System.out.println("Please input " + PRINT_BOOK_BY_PRICE_RANGE + " for print Books by price range");
        System.out.println("Please input " + PRINT_ADD_AUTHOR + " for add author");

    }

    static void printCommands() { System.out.println("Please input" + LOGOUT + "LOGOUT");
        System.out.println("Please input " + ADD_BOOK + " for add Book");
        System.out.println("Please input " + PRINT_ALL_BOOKS + " for print all Books");
        System.out.println("Please input " + PRINT_BOOKS_BY_AUTHOR_NAME + " for print Books by Author");
        System.out.println("Please input " + PRINT_BOOKS_BY_GENRE + " for print Books by Genre");
        System.out.println("Please input " + PRINT_BOOK_BY_PRICE_RANGE + " for print Books by price range");
        System.out.println("Please input " + PRINT_ADD_AUTHOR + " for add author");

    }
}
