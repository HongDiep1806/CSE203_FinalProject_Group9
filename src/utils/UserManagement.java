/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.*;
import model.User;

/**
 *
 * @author Asus
 */
public class UserManagement {

    static ArrayList<User> listUser = UserDAO.reStoreUSERFromFile();

    public static ArrayList<User> getListUser() {
        return listUser;
    }

    public static User findUser_byID(String ID) {
        User userFound;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getID().equalsIgnoreCase(ID)) {
                userFound = listUser.get(i);
                return userFound;
            }
        }
        return null;
    }

    public static boolean addUser(User user) {
        User user_temp = findUser_byID(user.getID());
        if (user_temp == null) {
            listUser.add(user);
            return true;
        } else {
            return false;
        }
    }
       

    public static void deleteUser(User user) {
        listUser.remove(user);

    }
      public static void editUser_info(String existingID, User updateUser) {
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getID().equalsIgnoreCase(updateUser.getID())) {
                listUser.get(i).updateInformation(updateUser);
                break;
            }

        }

    }

}
