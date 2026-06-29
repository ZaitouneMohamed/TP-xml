package ws;

import java.util.Date;

public class Account {
    private int code;
    private double balance;
    private Date createAt;

    public Account(int code, double balance, Date createAt) {
        this.code = code;
        this.balance = balance;
        this.createAt = createAt;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}



