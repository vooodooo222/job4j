package ru.job4j.streamapi.bank;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BankServiceTest {

    @Test
    public void addUser() {
        User user = new User("3434", "Petr Arsentev");
        User user2 = new User("3434", "Petr");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addUser(user2);
        assertThat(bank.findByPassport("3434").get(), is(user));
        assertNotEquals(bank.findByPassport("3434").get().getUsername(), user2.getUsername());
    }

    @Test
    public void addAccountWhenNotExistUsers() {
        BankService bank = new BankService();
        bank.addAccount(new User("3434", "Petr Arsentev").getPassport(), new Account("5546", 150D));
        assertThat(bank.findByPassport("3434").isEmpty(), is(true));
    }

    @Test
    public void findByRequisiteWhenEnterInvalidPassport() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertThat(bank.findByRequisite("34", "5546").isEmpty(), is(true));
    }

    @Test
    public void findByPassportWhenEnterInvalidPassport() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertThat(bank.findByPassport("34").isEmpty(), is(true));
    }

    @Test
    public void findByRequisiteWhenEnterInvalidRequisite() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertThat(bank.findByRequisite("3434", "55").isEmpty(), is(true));
    }

    @Test
    public void addAccount() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertThat(bank.findByRequisite("3434", "5546").get().getBalance(), is(150D));
    }

    @Test
    public void transferMoney() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("113", 50D));
        bank.transferMoney(
                user.getPassport(), "5546",
                user.getPassport(), "113", 150D);
        assertThat(bank.findByRequisite(user.getPassport(), "113").get().getBalance(), is(200D));
        assertThat(bank.findByRequisite(user.getPassport(), "5546").get().getBalance(), is(0D));
        boolean result = bank.transferMoney(
                user.getPassport(), "5546",
                user.getPassport(), "113", 1D);
        assertThat(result, is(false));
        bank.transferMoney(
                user.getPassport(), "113",
                user.getPassport(), "5546", 150D);
        bank.transferMoney(
                user.getPassport(), "113",
                user.getPassport(), "5546", 20D);
        assertThat(bank.findByRequisite(user.getPassport(), "113").get().getBalance(), is(30D));
        assertThat(bank.findByRequisite(user.getPassport(), "5546").get().getBalance(), is(170D));
    }
}