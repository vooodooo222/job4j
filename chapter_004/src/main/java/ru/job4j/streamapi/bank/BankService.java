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
    public Optional<User> findByPassport(String passport) {
       return users.keySet().stream()
               .filter(u -> u.getPassport().equals(passport))
               .findFirst();
    }

    /**
     * Найти аккаунт по его реквизитам для пользователя с указанным паспортом
     *
     * @param passport  - паспорт пользователя
     * @param requisite - реквизиты нужного аккаунта пользователя
     * @return аккаунт пользователя
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        return getAccountList(passport).stream()
                .filter(a -> a.getRequisite().equals(requisite))
                .findFirst();
    }

    /**
     * Вернуть список аккаунтов пользователя по паспорту
     *
     * @param passport - паспорт пользователя
     * @return список аккаунтов пользователя
     */
    private List<Account> getAccountList(String passport) {
        List<Account> accountList = new ArrayList<>();
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            accountList = users.get(user.get());
        }
        return accountList;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        if (srcAccount.isPresent() && srcAccount.get().getBalance() >= amount) {
            Optional<Account> dstAccount = findByRequisite(destPassport, destRequisite);
            if (dstAccount.isPresent()) {
                dstAccount.get().setBalance(dstAccount.get().getBalance() + amount);
                srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
                rsl = true;
            }
        }
        return rsl;
    }
}
