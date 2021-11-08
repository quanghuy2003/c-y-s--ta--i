package service;

import model.Album;
import model.Song;

import java.util.List;

public class AlbumManage implements General<Album>{
    List<Album> listAlbum;
    List<Song> listSong;

    public AlbumManage() {
    }

    public AlbumManage(List<Album> listAlbum) {
        this.listAlbum = listAlbum;
    }

    public List<Album> getListAlbum() {
        return listAlbum;
    }

    public void setListAlbum(List<Album> listAlbum) {
        this.listAlbum = listAlbum;
    }


    @Override
    public void add(Album album) {
     listAlbum.add(album);
    }

    @Override
    public void delete(String name) {
        if ( findByName(name)!=-1){
            listAlbum.remove(findByName(name));
        }else{
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
        for (Album album:listAlbum) {
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

//    @Override
//    public void find(String name) {
//
//    }
}
