package service;

import model.Song;

import java.util.List;

public class SongManage implements General<Song> {

//    public static final String ANSI_RESET = "\u001B[0m";
//    public static final String ANSI_BLUE = "\u001B[34m";
//    public static final String Xanhlacay = "\u001B[32m";
//    public static final String Do = "\u001B[31m";
//    public static final String Vang = "\u001B[33m";
//    public static final String den = "\u001B[30m";

         List<Song> listSong;


    public SongManage() {

    }


    public SongManage(List<Song> listSong) {
        this.listSong = listSong;
    }

    public List<Song> getListSong() {
        return listSong;
    }

    public void setListSong(List<Song> listSong) {
        this.listSong = listSong;
    }

    @Override
    public void add(Song song) {
        listSong.add(song);
    }

    @Override
    public void delete(String name) {
        int index = findByName(name);
        if(index == -1){
            System.out.println("không có bài này");
        }else {
            listSong.remove(index);
        }

    }

    @Override
    public void update(String name, String newName) {
        int index = findByName(name);
        if(index == -1){
            System.out.println("không có bài này");
        }else {
            listSong.get(index).setName(newName);

        }
    }

    @Override
    public void display() {
        for (Song song : this.listSong) {
            System.out.println(song);
        }
    }

    @Override
    public int findByName(String name) {
        for (int i = 0; i < listSong.size(); i++) {
            if (listSong.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

//    @Override
//    public void find(String name) {
//        for (int i = 0; i < listSong.size(); i++) {
//            if (listSong.get(i).getName().equals(name)) {
//                System.out.println(listSong.get(i));
//            }
//        }
//    }
}
