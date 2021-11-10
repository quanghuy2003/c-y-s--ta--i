package model;

import service.General;

import java.util.ArrayList;
import java.util.List;

public class Account implements General<Album> {
    private String userName;
    private String password;
    private List<Album> listAlbum;


    public Account() {
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


    @Override
    public void add(Album album) {
        listAlbum.add(album);
    }

    @Override
    public void delete(String name) {
        if (findByName(name) != -1) {
            listAlbum.remove(findByName(name));
        } else {
            System.out.println("This item is not available");
        }
    }

    @Override
    public void update(String name, String newName) {
        if (findByName(name) != -1) {
            listAlbum.get(findByName(name)).setName(newName);
        } else {
            System.out.println("Album này không có sẵn");
        }
    }

    @Override
    public void display() {
        for (Album album : listAlbum) {
            System.out.println(album);
        }
    }

    @Override
    public int findByName(String name) {
        for (int i = 0; i < listAlbum.size(); i++) {
            if (listAlbum.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
