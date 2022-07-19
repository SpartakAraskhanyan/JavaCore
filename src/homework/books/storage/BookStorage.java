package homework.books.storage;


import homework.books.exception.AuthorNotFoundException;
import homework.books.model.Author;
import homework.books.model.Book;

public class BookStorage {

    private Book[] array = new Book[10];
    private int size = 0;

    public void add(Book book) {
        if (array.length == size) {
            extend();
        }
        array[size++] = book;
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }

    private void extend() {
        Book[] temp = new Book[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
        } else {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];

            }
            size--;
        }
    }


    public int getSize() {
        return size;
    }

    public Book getBookIndex(int index) throws AuthorNotFoundException {

                if (index < 0 || index >= size) {
                    throw new AuthorNotFoundException("Book " + index + " does noy exists");
                }
                return array[index];
            }

            public void printBooksByAuthor (Author author) {
                for (int i = 0; i < size; i++) {
                    if (array[i].getAuthor().equals(author))
                        System.out.println(i + ". " + array[i]);

                }
            }


            public void printBooksByGenre (String genre){
                for (int i = 0; i < size; i++) {
                    if (array[i].getGenre().equals(genre))
                        System.out.println(i + ". " + array[i]);
                }
            }


            public void printPriceRange ( double minPrice, double maxPrice){
                for (int i = 0; i < size; i++) {
                    if (array[i].getPrice() >= minPrice && array[i].getPrice() <= maxPrice) {
                        System.out.println(i + ". " + array[i]);
                    }
                }
            }
        }






