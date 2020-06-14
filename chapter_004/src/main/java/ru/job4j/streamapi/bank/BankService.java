package ru.job4j.streamapi.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        List<Account> accountList = getAccountList(passport);
        if (!accountList.contains(account)) {
            accountList.add(account);
        }
    }

    /**
     * Найти пользователя по паспорту
     *
     * @param passport - паспорт пользователя
     * @return пользователь с заданным паспортом
     */
    public User findByPassport(String passport) {
        Optional<User> user = users.keySet().stream()
                .filter(u -> u.getPassport().equals(passport))
                .findFirst();
        if (user.isEmpty()) {
            return null;
        }
        return user.get();
    }

    /**
     * Найти аккаунт по его реквизитам для пользователя с указанным паспортом
     *
     * @param passport  - паспорт пользователя
     * @param requisite - реквизиты нужного аккаунта пользователя
     * @return аккаунт пользователя
     */
    public Account findByRequisite(String passport, String requisite) {
        Optional<Account> account = getAccountList(passport).stream()
                .filter(a -> a.getRequisite().equals(requisite))
                .findFirst();
        if (account.isEmpty()) {
            return null;
        }
        return account.get();
    }

    /**
     * Вернуть список аккаунтов пользователя по паспорту
     *
     * @param passport - паспорт пользователя
     * @return список аккаунтов пользователя
     */
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
