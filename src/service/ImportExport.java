package service;

import java.util.Scanner;

public class ImportExport {
    Scanner huy = new Scanner(System.in);
    private static CreateAccount createAccount = new CreateAccount();



    public String NewAlbumName() {
//        tạo album mới
        System.out.println("Nhập tên của album bạn muốn tạo: ");
        String newAlbumName = huy.nextLine();
        return newAlbumName;
    }

    public String DeleteAlbum() {
//        xóa album
        System.out.println("nhập album bạn muốn xóa: ");
        String deleteAlbum = huy.nextLine();
        return deleteAlbum;
    }


    public String EditNameAlbum() {
//      Chỉnh sửa tên Album
        System.out.println("Nhập tên album bạn muốn chỉnh sửa: ");
        String editNameAlbum = huy.nextLine();
        return editNameAlbum;
    }

    public String NewSongInAlbum() {
//   thêm Bài hát mới trong album
        System.out.println("nhập tên bài hát bạn muốn thêm vào album : ");
        String newSongInAlbum = huy.nextLine();
        return newSongInAlbum;
    }


    public String NewEditNameAlbum() {
//      Chỉnh sửa tên Album mới
        System.out.println("Nhập tên album mới: ");
        String newEditNameAlbum = huy.nextLine();
        return newEditNameAlbum;
    }

    public String ShowSongsInAlbum(){
//        hiển thị bài hát trong album
        String showSongsInAlbum = huy.nextLine();
        return showSongsInAlbum;
    }


    public String FindAlbum() {
//        tìm album
        System.out.println("nhập album bạn muốn tìm: ");
        String findAlbum = huy.nextLine();
        return findAlbum;
    }




    public String DeleteSong() {
//        xóa bài hát
        System.out.println("nhập bài hát mà bạn muốn xóa: ");
        String deleteSong = huy.nextLine();
        return deleteSong;
    }


    public String FindSong() {
//        tìm bài hát
        System.out.println("nhập tên bài hát muốn tìm: ");
        String findSong = huy.nextLine();
        return findSong;
    }

    public String EditNameSong() {
//        sửa tên bài hát
        System.out.println("nhập tên bài hát muốn sửa: ");
        String editNameSong = huy.nextLine();
        return editNameSong;
    }


    public String NewUserName() {
//        tên đăng nhập mới
        System.out.println("nhập tên tài khoản người dùng mới:");
        System.out.println("lưu ý : tên là chữ cái hoặc số, không có kí tự đặc biệt");
        System.out.println("không được để khoảng trắng");
        String newSongInAlbum = huy.nextLine();
        if (createAccount.nameLogin(newSongInAlbum) == true) {
            return newSongInAlbum;
        }
        return "a";
    }

    public String NewPass() {
//        mật khẩu mới
        System.out.println("nhập mật khẩu mới: ");
        System.out.println("lưu ý: mật ");
        String newAlbumName = huy.nextLine();
        if (createAccount.newPassword(newAlbumName) == true) {
            return newAlbumName;
        }return "a";
    }
    public String UserNameLogin() {
//        đăng nhập
        System.out.println("nhập tên đăng nhập:");
        String newSongInAlbum = huy.nextLine();
        if (createAccount.nameLogin(newSongInAlbum) == true) {
            return newSongInAlbum;
        }
        return " ";
    }

    public String PassLogin() {
        System.out.println("nhập mật khẩu:");
        String newAlbumName = huy.nextLine();
        if (createAccount.newPassword(newAlbumName) == true) {
            return newAlbumName;
        }return " ";
    }
    public String EditPass() {
//        sửa mật khẩu
        System.out.println("nhập mật khẩu cũ: ");
        String editNameAlbum = huy.nextLine();
        return editNameAlbum;

    }

}
