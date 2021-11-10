package model;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private List<Song> listSong;
    //    private List<Album> listSong;
    private Account account;


    public Album(String name, List<Song> listSong) {
        this.name = name;
        this.listSong = listSong;
    }
    public Album(String name) {
        this.name = name;
        this.listSong = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getListSong() {
        return listSong;
    }

    public void setListSong(List<Song> listSong) {
        this.listSong = listSong;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", listSong=" + listSong +
                '}';
    }

    public void addSong(Song song) {
        listSong.add(song);
    }

    private void deleteSong(String name) {
        if (findSongs(name) != -1) {
            listSong.remove(findSongs(name));
        } else {
            System.out.println("mục này không có sẵn");
        }
    }

    private void update(String name, String newName) {
        if (findSongs(name) != 1) {
            listSong.get(findSongs(name)).setName(newName);
        } else {
            System.out.println("bài hát không có sẵn");
        }
    }

    private void printSong(String name) {
        for (Song song : listSong
        ) {
            System.out.println(song);
        }
    }

    public int findSongs(String name) {
        for (int i = 0; i < listSong.size(); i++) {
            if (listSong.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

}
