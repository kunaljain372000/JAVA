package org.tas.hibernateApp;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateAccount {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the Account Id to update: ");
int id = scanner.nextInt();

EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
EntityManager manager = factory.createEntityManager();
EntityTransaction transaction = manager.getTransaction();

Bank bank = manager.find(Bank.class, id);

if (bank != null) {
System.out.println("Current Balance: " + bank.getBalance());

System.out.println("Enter the withdrawal amount: ");
double withdrawalAmount = scanner.nextDouble();
bank.setBalance(bank.getBalance() - withdrawalAmount);

System.out.println("Enter the deposit amount: ");
double depositAmount = scanner.nextDouble();
bank.setBalance(bank.getBalance() + depositAmount);

transaction.begin();
manager.merge(bank);
transaction.commit();

System.out.println("Account balance updated successfully.");
System.out.println("Updated Balance: " + bank.getBalance());
} else {
System.out.println("Account not found.");
}

manager.close();
factory.close();
}
}