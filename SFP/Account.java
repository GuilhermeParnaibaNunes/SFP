package SFP;

import java.util.List;
import java.util.ArrayList;

public class Account {
    private String type;
    private String nickname;
    private double accBalance;
    private List<Transaction> transaction;

    public Account(String type, String nickname) {
        setType(type);
        setNickname(nickname);
        setAccBalance(0.0);
        setTransaction(new ArrayList<>());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }

    public void updateAccBalance() {
        // Implementation for updating account balance
    }

    public void addTransaction(Transaction transaction) {
        this.transaction.add(transaction);
    }

    public void editTransaction(String transactionID) {
        // Implementation for editing a transaction
    }

    public void deleteTransaction(String transactionID) {
        // Implementation for deleting a transaction
    }

    public String getTransactionIDByLable(String lable) {
        // Implementation for getting transaction ID by label
        return null;
    }

    public String getTransactionIDByDate(LocalDate date) {
        // Implementation for getting transaction ID by date
        return null;
    }

    public String getTransactionIDByType(String type) {
        // Implementation for getting transaction ID by type
        return null;
    }

    public String getCustomTimeGapTransactionHistory(LocalDate start, LocalDate end) {
        // Implementation for getting custom time gap transaction history
        return null;
    }

    public String getFullTransactionHistory() {
        // Implementation for getting full transaction history
        return null;
    }
}

/**
 * -type: String
 * -nickname: String;
 * -accBalance: double;
 * -transaction: List<Transaction>;
 * + Account(type: String, nickname: String);
 * + updateAccBalance();
 * + addTransaction(transaction: Transaction);
 * + editTransaction(transactionID: String);
 * + deleteTransaction(transactionID: String);
 * + getTransactionIDByLable(lable: String): String;
 * + getTransactionIDByDate(date: LocalDate): String;
 * + getTransactionIDByType(type: String): String;
 * + getCustomTimeGapTransactionHistory(start: LocalDate, end: LocalDate): String
 * + getFullTransactionHistory(): String.
 */