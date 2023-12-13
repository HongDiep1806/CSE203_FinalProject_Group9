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
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author Asus
 */
public class UserDAO {

    private static String pathSRC = "C:\\User_Information";
    private static String filePath = "UserList.txt";

    public UserDAO() {
        File folder = new File(pathSRC);
        File fileSave = new File(pathSRC + "\\" + filePath);
        if (!(folder.exists())) {
            folder.mkdirs();
        }
        if (!(fileSave.exists())) {
            try {
                fileSave.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void saveUserListBy_Char(ArrayList<User> UserList) {
        File fileChar = new File(pathSRC + "\\" + filePath);
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(fileChar);
            for (int i = 0; i < UserList.size(); i++) {
                pw.println(UserList.get(i).getID());
                pw.println(UserList.get(i).getPassword());
                pw.println(UserList.get(i).getFullname());
                pw.println(UserList.get(i).getAge());
                pw.flush();
            }
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }
    }
    public static ArrayList<User> reStoreUSERFromFile() {
        ArrayList<User> userList = new ArrayList<User>();
        BufferedReader br = null;
        try {
            String filename = pathSRC + "\\" + filePath;
            String line = "";

            br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) != null) {
                String ID = line;
                String password = br.readLine();
                String fullname = br.readLine();
                String age = br.readLine();
               
                User user = new User(ID, password, fullname, age);
                userList.add(user);

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
        return userList;
    }

}
