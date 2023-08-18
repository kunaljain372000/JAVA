package org.tas.hibernateApp;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteAccount {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter you id");
    int id=sc.nextInt();
    EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
    EntityManager manager=factory.createEntityManager();
    EntityTransaction transaction=manager.getTransaction();
    Bank b=manager.find(Bank.class, id);
    if(b!=null) {
        if(b.getBalance()<=100) {
        manager.remove(b);
        transaction.begin();
        transaction.commit();
        System.out.println("account has been deleted!!!");
        }else {
            System.out.println("This account Balanace is more than 100rs...!!!");
            System.out.println("ID: "+b.getId());
            System.out.println("Name: "+b.getName());
            System.out.println("Account Number: "+b.getAccNumber());
            System.out.println("Balance: "+b.getBalance());
        }
    }else {
        System.err.println("Invalid ID.!!");
    }

}
}
