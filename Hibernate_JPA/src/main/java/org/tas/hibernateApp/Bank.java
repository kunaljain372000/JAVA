package org.tas.hibernateApp;

import javax.persistence.*;

@NamedQueries(value= {@NamedQuery(name="findAll",query = "select b from Bank b"),
        @NamedQuery(name="findByAccountNumber",query = "select b from Bank b where b.AccNumber=?2")})
@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long AccNumber;
    private double balance;
    @Override
    public String toString() {
        return "Bank [id=" + id + ", name=" + name + ", AccNumber=" + AccNumber + ", balance=" + balance + "]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getAccNumber() {
        return AccNumber;
    }
    public void setAccNumber(long accNumber) {
        AccNumber = accNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

}