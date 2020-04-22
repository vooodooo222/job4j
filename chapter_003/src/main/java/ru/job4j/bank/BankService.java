package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        List<Account> accountList = getAccountList(passport);
        if (!accountList.contains(account)) {
            accountList.add(account);
        }
    }

    public User findByPassport(String passport) {
        User foundUser = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                foundUser = user;
            }
        }
        return foundUser;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account foundAccount = null;
        List<Account> accountList = getAccountList(passport);
        for (Account account : accountList) {
            if (account.getRequisite().equals(requisite)) {
                foundAccount = account;
            }
        }
        return foundAccount;
    }

    private List<Account> getAccountList(String passport) {
        List<Account> accountList = new ArrayList<>();
        User user = findByPassport(passport);
        if (user != null) {
            accountList = users.get(user);
        }
        return accountList;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        if (srcAccount != null && srcAccount.getBalance() >= amount) {
            Account dstAccount = findByRequisite(destPassport, destRequisite);
            if (dstAccount != null) {
                dstAccount.setBalance(dstAccount.getBalance() + amount);
                srcAccount.setBalance(srcAccount.getBalance() - amount);
                rsl = true;
            }
        }
        return rsl;
    }
}
