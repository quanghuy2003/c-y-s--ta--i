package model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String userName;
    private String password;
    private List<Album> listAlbum;


    public Account(String huy, String s) {
    }

    public Account(String userName, String password, List<Album> listAlbum) {
        this.userName = userName;
        this.password = password;
        this.listAlbum = listAlbum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Album> getListAlbum() {
        return listAlbum;
    }

    public void setListAlbum(List<Album> listAlbum) {
        this.listAlbum = listAlbum;
    }

    @Override
    public String toString() {
        return "AccountManage{" +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", listAlbum=" + listAlbum +
                '}';
    }


    public void addAlbum(String name){

    }

    public void deleteAlbum(String name){

    }

    public void editAlbum(String name , String newName){

    }
    public void printAlbum(){

    }


//    public Album findByName(String name) {
//
//    }
}
