package service;

import model.Account;
import model.Album;
import model.Song;

import java.util.List;

public class AccountManage implements General<Account> {
     List<Account> listAccount;
     List<Album> listAlbum;

    public AccountManage() {

    }

    public AccountManage(List<Account> listAccount) {
        this.listAccount = listAccount;
    }
    public List<Account> getListAccount() {
        return listAccount;
    }

    public void setListSong(List<Account> listAccount) {
        this.listAccount = listAccount;
    }
    @Override
    public void add(Account account) {
        listAccount.add(account);
    }

    @Override
    public void delete(String name) {
        int index = findByName(name);
        if(index == -1){
            System.out.println("không có tài khoản này");
        }else {
            listAccount.remove(index);
        }

    }

    @Override
    public void update(String name, String newName) {

    }

    @Override
    public void display() {
        for (Account account : this.listAccount) {
            System.out.println(account);
        }
    }

    @Override
    public int findByName(String name) {
        for (int i = 0; i < listAccount.size(); i++) {
            if (listAccount.get(i).getUserName().equals(name)) {
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
