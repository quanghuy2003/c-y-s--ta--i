package service;

import java.util.Scanner;

public class ImportExport {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String Xanhlacay = "\u001B[32m";
    public static final String Do = "\u001B[31m";
    public static final String Vang = "\u001B[33m";
    public static final String den = "\u001B[30m";
    public static final String tim = "\u001B[35m";
    Scanner huy = new Scanner(System.in);
    private static CreateAccount createAccount = new CreateAccount();


    public String NewAlbumName() {
//        tạo album mới
        System.out.println(tim + "Nhập tên của album bạn muốn tạo: ");
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

    public String ShowSongsInAlbum() {
//        hiển thị bài hát trong album
        String showSongsInAlbum = huy.nextLine();
        return showSongsInAlbum;
    }


    public String FindAlbum() {
//        tìm album
        System.out.println("nhập album bạn muốn tìm: " + ANSI_RESET);
        String findAlbum = huy.nextLine();
        return findAlbum;
    }


    public String DeleteSong() {
//        xóa bài hát
        System.out.println(ANSI_BLUE + "nhập bài hát mà bạn muốn xóa: ");
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
        System.out.println("nhập tên bài hát muốn sửa: " + ANSI_RESET);
        String editNameSong = huy.nextLine();
        return editNameSong;
    }


    public String NewUserName() {
//        tên đăng nhập mới
        System.out.println(Do + "nhập tên tài khoản người dùng mới:");
        System.out.println("lưu ý : tên là chữ cái hoặc số, không có kí tự đặc biệt");
        System.out.println("ít nhất 8 ký tự");
        String newSongInAlbum = huy.nextLine();
        if (CreateAccount.nameLogin(newSongInAlbum)) {
            return newSongInAlbum;
        }
        return " ";
    }

    public String NewPass() {
//        mật khẩu mới
        System.out.println("nhập mật khẩu mới: ");
        System.out.println("lưu ý: mật mật khẩu không có kí tự đặc biệt ");
        System.out.println("ít nhất 8 ký tự");
        String newAlbumName = huy.nextLine();
        if (createAccount.newPassword(newAlbumName)) {
            return newAlbumName;
        }
        return " ";
    }

    public String UserNameLogin() {
//        đăng nhập
        System.out.println("nhập tên đăng nhập:");
        String newSongInAlbum = huy.nextLine();
        if (createAccount.nameLogin(newSongInAlbum)) {
            return newSongInAlbum;
        }
        return " ";
    }

    public String PassLogin() {
        System.out.println("nhập mật khẩu:");
        String newAlbumName = huy.nextLine();
        if (createAccount.newPassword(newAlbumName)) {
            return newAlbumName;
        }
        return " ";
    }

    public String EditPass() {
//        sửa mật khẩu
        System.out.println("nhập mật khẩu cũ: " + ANSI_RESET);
        String editNameAlbum = huy.nextLine();
        return editNameAlbum;

    }

}
