package model;

public class Account {
    private int id;
    private String userName;
    private int password;
    private String album;

    public Account() {
    }

    public Account(int id, String userName, int password, String album) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.album = album;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password=" + password +
                ", album='" + album + '\'' +
                '}';
    }
}
