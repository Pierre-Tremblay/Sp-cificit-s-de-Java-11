package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class Test {
    public static void main(String[] args) {
        ResourceBundle singletonTest = ResourceBundle.getBundle("configTest");
        String UrlInformations = singletonTest.getString("db.url");
        String UserInformations = singletonTest.getString("db.user");
        String PasswordInformations = singletonTest.getString("db.password");
        System.out.println(UrlInformations + "\n" +UserInformations + "\n" + PasswordInformations);

    }
}
