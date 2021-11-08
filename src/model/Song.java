package model;

import java.util.List;

public class Song {
    private String name;
    private List<Song> listSong;


    public List<Song> getSongs() {
        return listSong;
    }

    public void setSongs(Song songs) {
        this.listSong.add(songs);
    }

    public Song() {
    }

    public Song(List<Song> listSong) {
        this.listSong = listSong;
    }

    public Song(String name, List<Song> listSong) {
        this.name = name;
        this.listSong = listSong;
    }

    public Song(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Songname: " + name +
                '}';
    }
}
