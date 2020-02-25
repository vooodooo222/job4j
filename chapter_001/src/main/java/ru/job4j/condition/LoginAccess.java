package ru.job4j.condition;

public class LoginAccess {
    public static boolean check(String login) {
        String root = new String("root");
        boolean access = login.equals(root);
        return access;
    }

    public static void main(String[] args) {
        System.out.println("Entered login: your_name");
        String your = "your_name";
        boolean userHasAccess = LoginAccess.check(your);
        System.out.println("userHasAccess: " + userHasAccess);

        System.out.println("Entered login: root");
        your = "root";
        userHasAccess = LoginAccess.check(your);
        System.out.println("userHasAccess: " + userHasAccess);
    }
}
