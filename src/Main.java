import model.Account;
import model.Album;
import model.Song;
import service.AccountManage;
import service.ImportExport;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String xyzName;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
//    public static final String Xanhlacay = "\u001B[32m";
    public static final String Do = "\u001B[31m";
    public static final String Vang = "\u001B[33m";
//    public static final String den = "\u001B[30m";
    public static final String tim = "\u001B[35m";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Album> albumInAccount = new ArrayList<>();
        ImportExport importExport = new ImportExport();

        int choice;
        int choice1;
        do {
            System.out.println(ANSI_BLUE + "+_+_+_+_+_+_+_+_+_+_+_+_+_+MENU+_+_+_+_+_+_+_+_+_+_+_+_+_+");
            System.out.println("||              1: Đăng ký tài khoản:                   ||");
            System.out.println("||                  2: Đăng nhập:                       ||");
            System.out.println("||                     0: Exit                          ||");
            System.out.println("+_+_+_+_+_+_+_+_++_+_+_+_+_+_+_+_++_+_+_+_+_+_+_+_++_+_+_+" + ANSI_RESET);
            System.out.println(Vang + "                nhập lựa chọn của bạn" + ANSI_RESET);
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {

                    Account account = new Account(importExport.NewUserName(), importExport.NewPass(), albumInAccount);
                    if (AccountManage.getInstance().getListAccount().size() == 0) {
                        if (!account.getUserName().equals(" ") && !account.getPassword().equals(" ")) {
                            AccountManage.getInstance().add(account);
                            System.out.println(Do + "Đăng ký tài khoản thành công!");

                        } else {
                            System.out.println("sai tên hoặc mật khẩu!!!!!!");
                        }
                    } else {
                        for (int i = 0; i < AccountManage.getInstance().getListAccount().size(); i++) {
                            if (AccountManage.getInstance().getListAccount().get(i).getUserName().equals(account.getUserName())) {
                                System.out.println("tên đã tồn tại!!!!" + ANSI_RESET);
                            }
                        }
                    }
                }
                case 2 -> {
                    String accountName = importExport.UserNameLogin(), pass = importExport.PassLogin();
                    for (int i = 0; i < AccountManage.getInstance().getListAccount().size(); i++) {
                        boolean isAccTrue = AccountManage.getInstance().getListAccount().get(i).getUserName().equals(accountName) && AccountManage.getInstance().getListAccount().get(i).getPassword().equals(pass);
                        if (isAccTrue) {
                            xyzName = AccountManage.getInstance().getListAccount().get(i).getUserName();
                            System.out.println(Do + "Đăng nhập thành công" + ANSI_RESET);
                            do {
                                System.out.println(tim + "+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+Menu Album+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");
                                System.out.println("||                           1: tạo album mới                             ||");
                                System.out.println("||                            2. sửa album                                ||");
                                System.out.println("||                            3. xóa album                                ||");
                                System.out.println("||                            4. tìm album                                ||");
                                System.out.println("||                            5. Show album                               ||");
                                System.out.println("||                      6. thêm bài hát vào album                         ||");
                                System.out.println("||                      7. xóa bài hát khỏi album                         ||");
                                System.out.println("||                    8. sửa tên bài hát trong album                      ||");
                                System.out.println("||                          9: ghi từ file csv                           ||");
                                System.out.println("||                          10: đọc từ file csv                           ||");
                                System.out.println("||                            0. đăng xuất                                ||");
                                System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_++_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+" + ANSI_RESET);
                                System.out.println(Vang + "                         nhập lựa chọn của bạn: " + ANSI_RESET);
                                choice1 = scanner.nextInt();
                                switch (choice1) {
                                    case 1 -> {
                                        int index = -1;
                                        for (int j = 0; j < AccountManage.getInstance().getListAccount().size(); j++) {
                                            if (AccountManage.getInstance().getListAccount().get(j).getUserName().equals(xyzName)) {
                                                index = j;
                                            }
                                        }
                                        Scanner scanner1 = new Scanner(System.in);
                                        System.out.println("nhập tên album");
                                        String albumName = scanner1.nextLine();
                                        Album album = new Album(albumName);
                                        AccountManage.getInstance().getListAccount().get(index).add(album);
                                        System.out.println("thêm thành công");
                                    }
                                    case 2 -> {
                                        int index1 = -1;
                                        for (int j = 0; j < AccountManage.getInstance().getListAccount().size(); j++) {
                                            if (AccountManage.getInstance().getListAccount().get(j).getUserName().equals(xyzName)) {
                                                index1 = j;
                                            }
                                        }
                                        System.out.println("nhập tên album muốn sửa");
                                        scanner.nextLine();
                                        String nameAlbum = scanner.nextLine();
                                        System.out.println("bạn muốn tên của album sau khi sửa là");
                                        String newNameAlbum = scanner.nextLine();
                                        AccountManage.getInstance().getListAccount().get(index1).update(nameAlbum, newNameAlbum);
                                    }
                                    case 3 -> {
                                        int index2 = -1;
                                        for (int j = 0; j < AccountManage.getInstance().getListAccount().size(); j++) {
                                            if (AccountManage.getInstance().getListAccount().get(j).getUserName().equals(xyzName)) {
                                                index2 = j;
                                            }
                                        }
                                        System.out.println("nhập tên album muốn xóa");
                                        scanner.nextLine();
                                        String deleteAlbum = scanner.nextLine();
                                        AccountManage.getInstance().getListAccount().get(index2).delete(deleteAlbum);
                                    }
                                    case 4 -> {
                                        int index3 = -1;
                                        for (int j = 0; j < AccountManage.getInstance().getListAccount().size(); j++) {
                                            if (AccountManage.getInstance().getListAccount().get(j).getUserName().equals(xyzName)) {
                                                index3 = j;
                                            }
                                        }
                                        System.out.println("nhập album bạn muốn tìm");
                                        scanner.nextLine();
                                        String findAlbum = scanner.nextLine();
                                        System.out.println(AccountManage.getInstance().getListAccount().get(index3).findByName(findAlbum));

                                    }
                                    case 5 -> {
                                        int indexDisplayAllAlbum = -1;
                                        for (int j = 0; j < AccountManage.getInstance().getListAccount().size(); j++) {
                                            if (AccountManage.getInstance().getListAccount().get(j).getUserName().equals(xyzName)) {
                                                indexDisplayAllAlbum = j;
                                            }
                                        }
                                        AccountManage.getInstance().getListAccount().get(indexDisplayAllAlbum).display();
                                    }
                                    case 6 -> {
                                        int indexOfAccout = -1;
                                        for (int j = 0; j < AccountManage.getInstance().getListAccount().size(); j++) {
                                            if (AccountManage.getInstance().getListAccount().get(j).getUserName().equals(xyzName)) {
                                                indexOfAccout = j;
                                            }
                                        }
                                        System.out.println("thêm bài hát vào album nào");
                                        scanner.nextLine();
                                        String albumName = scanner.nextLine();
                                        int indexOfAlbum = AccountManage.getInstance().getListAccount().get(indexOfAccout).findByName(albumName);
                                        if (indexOfAlbum != -1) {
                                            int a = -1;
                                            while (a != 0) {
                                                System.out.println("1: THÊM BÀI HÁT");
                                                System.out.println("0: KO THÊM NỮA");
                                                a = scanner.nextInt();
                                                if (a != 0) {
                                                    System.out.println("Thêm bài hát");
                                                    scanner.nextLine();
                                                    String nameSong = scanner.nextLine();
                                                    Song song = new Song(nameSong);
                                                    Account currentAccount = AccountManage.getInstance().getListAccount().get(indexOfAccout);
                                                    Album currentAlbum = currentAccount.getListAlbum().get(indexOfAlbum);
                                                    currentAlbum.addSong(song);
                                                } else System.out.println("thoát");
                                            }
                                        } else System.out.println("ko tim thấy album");
                                    }
                                    case 7 -> {
                                        int indexDeleteAccount = -1;
                                        System.out.println("album muốn xóa");
                                        scanner.nextLine();
                                        String nameAlbum = scanner.nextLine();

                                        for (int j = 0; j < AccountManage.getInstance().getListAccount().size(); j++) {
                                            if (AccountManage.getInstance().getListAccount().get(j).getUserName().equals(xyzName)) {
                                                indexDeleteAccount = j;
                                            }
                                        }


                                        Account currentAccount = AccountManage.getInstance().getListAccount().get(indexDeleteAccount);
                                        int indexOfAlbumCurrentAccount = currentAccount.findByName(nameAlbum);
                                        Album currentAlbum = currentAccount.getListAlbum().get(indexOfAlbumCurrentAccount);
                                        System.out.println("nhập tên bài hát muốn xóa");
                                        String deleteInSong = scanner.nextLine();
                                        currentAlbum.deleteSong(deleteInSong);
                                    }
                                    case 8 -> {
                                        int indexUpdateNameSong = -1;
                                        System.out.println("nhập vào album muốn sửa");
                                        scanner.nextLine();
                                        String updateNameSong = scanner.nextLine();

                                        for (int j = 0; j < AccountManage.getInstance().getListAccount().size(); j++) {
                                            if (AccountManage.getInstance().getListAccount().get(j).getUserName().equals(xyzName)) {
                                                indexUpdateNameSong = j;
                                            }
                                        }
                                        Account currentAccount = AccountManage.getInstance().getListAccount().get(indexUpdateNameSong);
                                        int indexOfAlbumCurrentAccount = currentAccount.findByName(updateNameSong);
                                        Album currentAlbum = currentAccount.getListAlbum().get(indexOfAlbumCurrentAccount);
                                        System.out.println("tên album muốn sửa");
                                        String nameSong = scanner.nextLine();
                                        System.out.println("bạn muốn sửa tên bài hát đó thành gì");
                                        String updateInSong = scanner.nextLine();
                                        currentAlbum.update(nameSong,updateInSong);
                                    }
                                }

                            } while (choice1 != 0);
                        } else System.out.println("đang nhập k thành công");
                    }
                }
            }
        } while (choice != 0);
    }
}
