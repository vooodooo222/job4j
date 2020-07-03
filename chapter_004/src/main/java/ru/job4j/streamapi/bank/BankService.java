package ru.job4j.streamapi.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        Optional<List<Account>> accountList = getAccountList(passport);
        if (accountList.isPresent() && !accountList.get().contains(account)) {
            accountList.get().add(account);
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
        Optional<Account> account = Optional.empty();
        if (getAccountList(passport).isPresent()) {
            account = getAccountList(passport).get().stream()
                    .filter(a -> a.getRequisite().equals(requisite))
                    .findFirst();
        }
        return account;
    }

    /**
     * Вернуть список аккаунтов пользователя по паспорту
     *
     * @param passport - паспорт пользователя
     * @return список аккаунтов пользователя
     */
    private Optional<List<Account>> getAccountList(String passport) {
        Optional<List<Account>> optionalAccountList = Optional.empty();
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            optionalAccountList = Optional.of(users.get(user.get()));
        }
        return optionalAccountList;
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
