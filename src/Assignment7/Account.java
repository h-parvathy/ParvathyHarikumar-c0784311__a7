package Assignment7;

import javax.swing.*;

// Has user Account details like Name, id, balance etc
public class Account {
    protected int id;
    protected String firstName;
    protected String lastName;
    protected String credential;
    protected double balance;

    public Account(int id, String firstName, String lastName, String credential, double balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.credential = credential;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCredential() {
        return credential;
    }

    public void setCredential(String credential) {
        this.credential = credential;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {  this.balance = balance; }

}
