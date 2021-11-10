package service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateAccount {
    public CreateAccount() {
    }

    public static boolean nameLogin(String regex) {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]{6,}$");
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public static boolean newPassword(String regex) {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]{8,}$");
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
