/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.ArrayList;
import model.Book;

/**
 *
 * @author Asus
 */
public class BookManagement {
    static ArrayList<Book> listBook = BookDAO.reStoreBookFromFile();

    public static ArrayList<Book> getListBook() {
        return listBook;
    }

    public static Book findBook_byTitle(String title) {
        Book bookFound;
        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i).getTitle().equalsIgnoreCase(title)) {
                bookFound = listBook.get(i);
                return bookFound;
            }
        }
        return null;
    }

    public static boolean addBook(Book book) {
        Book book_temp = findBook_byTitle(book.getTitle());
        if (book_temp == null) {
            listBook.add(book);
            return true;
        } else {
            return false;
        }
    }
     public static void deleteBook(Book book) {
        listBook.remove(book);

    }
      public static void editBook_info(String existingBook, Book updateBook) {
        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i).getTitle().equalsIgnoreCase(updateBook.getTitle())) {
                listBook.get(i).updateInformation(updateBook);
                break;
            }

        }

    }

}
