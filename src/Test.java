import model.Account;
import model.Album;
import model.Song;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Album> listAlb=new ArrayList<>();
        ArrayList<Song> listSong=new ArrayList<>();
        Account account=new Account("ookokok","1234567",listAlb);
        Album album=new Album("ABC",listSong,account);
        account.add(album);
    }
}
