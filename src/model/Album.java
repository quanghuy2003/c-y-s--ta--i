package model;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private ArrayList<Song> songs;
    private List<Album> listSong;
    private Account account;

    public Album() {
    }

    public Album(String name, ArrayList<Song> songs, List<Album> listSong, Account account) {
        this.name = name;
        this.songs = songs;
        this.listSong = listSong;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public List<Album> getListSong() {
        return listSong;
    }

    public void setListSong(List<Album> listSong) {
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
                ", songs=" + songs +
                ", listSong=" + listSong +
                ", account=" + account +
                '}';
    }

    private void addSong(Song song){
        songs.add(song);
    }

    private void deleteSong(String name){
        if (findSongs(name) != -1) {
            songs.remove(findSongs(name));
        } else {
            System.out.println("mục này không có sẵn");
        }
    }
    private void printSong(String name){
        for (Song song : songs
        ) {
            System.out.println(song);
        }
    }
    public int findSongs(String name){
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

}
