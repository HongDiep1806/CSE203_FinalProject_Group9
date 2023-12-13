/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import model.Book;

/**
 *
 * @author Asus
 */
public class BookDAO {
      private static String pathSRC = "C:\\Book_Information";
    private static String filePath = "BookList.txt";

    public BookDAO() {
        File folder = new File(pathSRC);
        File fileSave = new File(pathSRC + "\\" + filePath);
        if (!(folder.exists())) {
            folder.mkdirs();
        }
        if (!(fileSave.exists())) {
            try {
                fileSave.createNewFile();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(BookDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }         
        }
    }

    public static void saveBookListBy_Char(ArrayList<Book> BookList) {
        File fileChar = new File(pathSRC + "\\" + filePath);
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(fileChar);
            for (int i = 0; i < BookList.size(); i++) {
                pw.println(BookList.get(i).getTitle());
                pw.println(BookList.get(i).getType());
                pw.println(BookList.get(i).getyOR());
                pw.println(BookList.get(i).getPrice());
                pw.flush();
            }
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }
    }
    public static ArrayList<Book> reStoreBookFromFile() {
        ArrayList<Book> bookList = new ArrayList<Book>();
        BufferedReader br = null;
        try {
            String filename = pathSRC + "\\" + filePath;
            String line = "";

            br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) != null) {
                String title = line;
                String type = br.readLine();
                int yOR = Integer.parseInt(br.readLine());
                int price = Integer.parseInt(br.readLine());
               
                Book newBook = new Book(title, type, yOR, price);
                bookList.add(newBook);

            }
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(UserDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
            java.util.logging.Logger.getLogger(UserDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
        return bookList;
    }

}
