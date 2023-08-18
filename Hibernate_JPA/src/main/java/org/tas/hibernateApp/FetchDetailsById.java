package org.tas.hibernateApp;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchDetailsById {
public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter id: ");
     int id=sc.nextInt();
    EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
    EntityManager manager=factory.createEntityManager();
    Bank b=manager.find(Bank.class, id);
    if(b!=null) {
        System.out.println("ID: "+b.getId());
        System.out.println("Name: "+b.getName());
        System.out.println("Account Number: "+b.getAccNumber());
        System.out.println("Balance: "+b.getBalance());
    }else {
        System.err.println("Ïnvalid id");
    }
}
}
