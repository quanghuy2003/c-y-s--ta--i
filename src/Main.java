import model.Account;
import model.Album;
import model.Song;
import service.AccountManage;
import service.AlbumManage;
import service.CreateAccount;
import service.ImportExport;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Account> accountInManage = new ArrayList<>();
        ArrayList<Album> albumInAccount = new ArrayList<>();
        ArrayList<Song> songInAlbum = new ArrayList<>();
        ImportExport importExport = new ImportExport();
        AlbumManage albumManage = new AlbumManage();
        AccountManage accountManage = new AccountManage(accountInManage);

        Account account = null;
        int choice;
        do {
            System.out.println("+_+_+_+_+_+_+_+_+MENU+_+_+_+_+_+_+_+_+");
            System.out.println("1: Đăng ký tài khoản:");
            System.out.println("2: Đăng nhập:");
            System.out.println("3: Đổi mật khẩu");
            System.out.println("0: Exit");
            System.out.println("nhập lựa chọn của bạn");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    account = new Account(importExport.NewUserName(), importExport.NewPass(), albumInAccount);
                    if (accountManage.getListAccount().size() == 0) {
                        if (!account.getUserName().equals(" ") && !account.getPassword().equals(" ")) {

                            accountManage.add(account);
                            System.out.println("Đăng ký tài khoản thành công!");
                        } else {
                            System.out.println("sai tên hoặc mật khẩu!!!!!!");
                        }
                    } else {
                        for (int i = 0; i < accountManage.getListAccount().size(); i++) {
                            if (!accountManage.getListAccount().get(i).getUserName().equals(account.getUserName())) {
                                if (!account.getUserName().equals(" ") && !account.getPassword().equals(" ")) {
                                    accountManage.add(account);
                                    System.out.println("Đăng ký thành công");
                                    break;
                                } else {
                                    System.out.println("sai tên học mật khẩu!!!!!!");
                                }
                            } else {
                                System.out.println("tên đã tồn tại!!!!");
                            }
                        }
                    }
                }
                case 2 -> {
                    String accountName = importExport.UserNameLogin(), pass = importExport.PassLogin();
                    for (int i = 0; i < accountManage.getListAccount().size(); i++) {
                        if (accountManage.getListAccount().get(i).getUserName().equals(accountName) && accountManage.getListAccount().get(i).getPassword().equals(pass)) {
                            System.out.println("Đăng nhập thành công");
                        }
                        do {
                            System.out.println("+_+_+_+_+_+_+_+_+Menu Album+_+_+_+_+_+_+_+_+");
                            System.out.println("1: tạo album mới");
                            System.out.println("2. sửa album ");
                            System.out.println("3. xóa album");
                            System.out.println("4. tìm album");
                            System.out.println("5. Show album");
                            System.out.println("6. hiển thị album");
                            System.out.println("7. hiển thị danh sách album và bài hát trong album");
                            System.out.println("0. đăng xuất");
                            System.out.println("nhập lựa chọn của bạn: ");
                            choice = scanner.nextInt();
                            if (choice != 0) {
                                switch (choice) {
                                    case 1 -> {
                                        Album album = new Album();
                                        if (albumManage.getListAlbum().size() == 0) {
                                            if (!album.getName().equals(" ")) {
                                                albumManage.add(album);
                                                System.out.println("tạo alum thành công");
                                            } else {
                                                System.out.println("tên không hợp lệ");
                                            }
                                        } else {
                                            for (i = 0; i < account.getListAlbum().size(); i++) {
                                                if (!albumManage.getListAlbum().get(i).getName().equals(album.getName())) {

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
