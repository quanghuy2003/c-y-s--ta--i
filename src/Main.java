import model.Account;
import model.Album;

import model.Song;
import service.AccountManage;
import service.ImportExport;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String Xanhlacay = "\u001B[32m";
    public static final String Do = "\u001B[31m";
    public static final String Vang = "\u001B[33m";
    public static final String den = "\u001B[30m";
    public static final String tim = "\u001B[35m";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Account> accountInManage = new ArrayList<>();
        ArrayList<Album> albumInAccount = new ArrayList<>();
        ArrayList<Song> songInAlbum = new ArrayList<>();
        ImportExport importExport = new ImportExport();
        AccountManage accountManage = new AccountManage(accountInManage);

        Account account=new Account();
        int choice;
        int choice1;
        int choice2;
        int choice3;
        do {
            System.out.println(ANSI_BLUE+"+_+_+_+_+_+_+_+_+_+_+_+_+_+MENU+_+_+_+_+_+_+_+_+_+_+_+_+_+");
            System.out.println("||              1: Đăng ký tài khoản:                   ||");
            System.out.println("||                  2: Đăng nhập:                       ||");
            System.out.println("||                 3: Đổi mật khẩu                      ||");
            System.out.println("||                     0: Exit                          ||");
            System.out.println("+_+_+_+_+_+_+_+_++_+_+_+_+_+_+_+_++_+_+_+_+_+_+_+_++_+_+_+" + ANSI_RESET);
            System.out.println(Vang+"                nhập lựa chọn của bạn"+ANSI_RESET);
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    account = new Account(importExport.NewUserName(), importExport.NewPass(), albumInAccount);
                    if (accountManage.getListAccount().size() == 0) {
                        if (!account.getUserName().equals(" ") && !account.getPassword().equals(" ")) {
                            accountManage.add(account);
                            System.out.println(Do+"Đăng ký tài khoản thành công!");
                        } else {
                            System.out.println("sai tên hoặc mật khẩu!!!!!!");
                        }
                    } else {
                        for (int i = 0; i < accountManage.getListAccount().size(); i++) {
                            if (accountManage.getListAccount().get(i).getUserName().equals(account.getUserName())) {
                                System.out.println("tên đã tồn tại!!!!"+ANSI_RESET);
                            }
                        }
                    }
                }
                case 2 -> {
                    String accountName = importExport.UserNameLogin(), pass = importExport.PassLogin();
                    for (int i = 0; i < accountManage.getListAccount().size(); i++) {
                        if (accountManage.getListAccount().get(i).getUserName().equals(accountName) && accountManage.getListAccount().get(i).getPassword().equals(pass)) {
                            System.out.println(Do+"Đăng nhập thành công"+ANSI_RESET);
                        }
                        do {
                            System.out.println(tim+"+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+Menu Album+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");
                            System.out.println("||                           1: tạo album mới                             ||");
                            System.out.println("||                            2. sửa album                                ||");
                            System.out.println("||                            3. xóa album                                ||");
                            System.out.println("||                            4. tìm album                                ||");
                            System.out.println("||                            5. Show album                               ||");
                            System.out.println("||                          6. hiển thị album                             ||");
                            System.out.println("||       7. hiển thị danh sách album và bài hát trong album               ||");
                            System.out.println("||                            0. đăng xuất                                ||");
                            System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_++_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+"+ANSI_RESET);
                            System.out.println(Vang+"                         nhập lựa chọn của bạn: "+ANSI_RESET);
                            choice1 = scanner.nextInt();

                                switch (choice1) {
                                    case 1 -> {
                                        Album album=new Album("rên",songInAlbum,account);
                                        account.add(album);
                                        System.out.println("thêm thành công");
                                    }
                                }

                        } while (choice != 0);
                    }
                }
            }
        } while (choice != 0);
    }

}
