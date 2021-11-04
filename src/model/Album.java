package model;

public class Album {
    private String name;
    private int id;
    private String song;

    public Album() {
    }

    public Album(String name, int id, String song) {
        this.name = name;
        this.id = id;
        this.song = song;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", song='" + song + '\'' +
                '}';
    }
}
