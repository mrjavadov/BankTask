package Lesson13;

import java.util.List;

public class BankAccount {
    private Long id;
    private boolean accountType;
    private double balance;
    private Customer customer;
    private Card card;
    private List<Transaction> transactions;
    private List<Loans> loans;


    public BankAccount(Long id, boolean accountType, double balance) {
        this.id = id;
        this.accountType = accountType;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAccountType() {
        return accountType;
    }

    public void setAccountType(boolean accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", accountType=" + accountType +
                ", balance=" + balance +
                '}';
    }
}
