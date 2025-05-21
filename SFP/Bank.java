package SFP;

import java.util.List;
import java.util.ArrayList;

public class Bank {
    private String bankName;
    private List<Account> account;

    public Bank(String name) {
        setBankName(name);
        setAccount(new ArrayList<>());
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public List<Account> getAccount() {
        return account;
    }

    public void setAccount(List<Account> account) {
        this.account = account;
    }

    public String getBankBalance() {
        double totalBalance = 0;
        for (Account acc : account) {
            totalBalance += acc.getBalance();
        }
        return String.format("Total balance in %s: %.2f", bankName, totalBalance);
    }

    public double getBankBalanceNumber() {
        double totalBalance = 0;
        for (Account acc : account) {
            totalBalance += acc.getBalance();
        }
        return totalBalance;
    }
}

/**
 * - bankName: String;
 * - account: List<Account>;
 * +  getBankBalance(): String;
 * + getBankBalanceNumber(): double;
 * + Bank(name: String).
 */