/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Asus
 */
public class User implements Serializable {

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String ID;
    public String password;
    public String fullname;
    public String age;

    public User(String ID, String password, String fullname, String age) {
        this.ID = ID;
        this.password = password;
        this.fullname = fullname;
        this.age = age;
    }
     public void updateInformation(User updateUser) {
        this.setID(updateUser.getID());
        this.setPassword(updateUser.getPassword());
        this.setFullname(updateUser.getFullname());
        this.setAge(updateUser.getAge());
       
    }

    @Override
    public boolean equals(Object obj) {
        User thisUser = this;
        User otherUser = (User) obj;
        return thisUser.getID().equalsIgnoreCase(otherUser.getID());
    }

}
