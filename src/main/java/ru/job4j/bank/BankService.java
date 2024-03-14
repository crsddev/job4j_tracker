package ru.job4j.bank;

import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));

    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> acc = users.get(user);
            if (!acc.contains(account)) {
                acc.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        Account account = null;
        if (user != null) {
            List<Account> list = users.get(user);
            for (Account acc : list) {
                if (requisite.equals(acc.getRequisite())) {
                    account = acc;
                    break;
                }
            }

        }
        return account;
    }

    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        boolean result = false;
        Account sourceAcc = findByRequisite(sourcePassport, sourceRequisite);
        Account destinationAcc = findByRequisite(destinationPassport, destinationRequisite);
        if (sourceAcc != null && destinationAcc != null) {
            double balanceFrom = sourceAcc.getBalance();
            double balanceTo = destinationAcc.getBalance();
            if (balanceFrom >= amount) {
                balanceFrom -= amount;
                balanceTo += amount;
                sourceAcc.setBalance(balanceFrom);
                destinationAcc.setBalance(balanceTo);
                result = true;
            }

        }
        return result;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}