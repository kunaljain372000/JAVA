package org.tas.hibernateApp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBank {
public static void main(String[] args) {
    Bank b=new Bank();
    b.setName("somu");
    b.setAccNumber(9893);
    b.setBalance(10001);
    EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
    EntityManager manager=factory.createEntityManager();
    EntityTransaction transaction=manager.getTransaction();

    manager.persist(b);
    transaction.begin();
    transaction.commit();
    System.out.println("Bank details save with id: "+b.getId());
}
}
