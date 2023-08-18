package org.tas.hibernateApp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAll {
public static void main(String[] args) {
    EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
    Query q=manager.createNamedQuery("findAll");
    List<Bank> bank=q.getResultList();
    for(Bank b:bank) {
        System.out.println(b);
    }
}
}