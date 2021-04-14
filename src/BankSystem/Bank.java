/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paris
 */
public class Bank {

    List<Customer> users = new ArrayList();
    Scanner sc = new Scanner(System.in);

    public void createAccount() {
        System.out.println("Enter Customer Name:");
        String name = sc.next();
        System.out.println("Enter amount :");
        Customer user = new Customer(IdGenerate.generateId(), name, sc.nextLong());
        users.add(user);
    }

    public void showAllUser() {
        System.out.println(users);
        clearConsole();
    }

    public Optional<Customer> findById(long id) {
        Optional<Customer> opt = users.stream().filter(customer -> customer.getBankId() == id).findFirst();
        Verifyer.checkID(opt);
        return opt;
    }

    public void withdrawal() {
        System.out.println("Please enter your Customer ID :");
        Optional<Customer> opt = findById(sc.nextLong());
        long amount = Verifyer.checkAmountsFor();
        boolean is = Verifyer.isAble(amount, opt.get());
        Verifyer.transaction(is, opt, amount);
    }

    public void deposit() {
        System.out.println("Please enter your Customer ID :");
        Optional<Customer> opt = findById(sc.nextLong());
        long amount = Verifyer.checkAmountsFor();
        opt.get().setBalance(opt.get().getBalance() + amount);
        System.out.println("After operation your balance is:" + opt.get().getBalance());

    }

    public void transfer() {
        System.out.println("Please enter your Customer ID :");
        Optional<Customer> opt = findById(sc.nextLong());
        System.out.println("Please enter reciever account ID:");
        Optional<Customer> optReciever = findById(sc.nextLong());
        long amount = Verifyer.checkAmountsFor();
        try {
            System.out.println("It can take some time");
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        Verifyer.transaction(Verifyer.isAble(amount, opt.get()), opt, amount);
        optReciever.get().setBalance(optReciever.get().getBalance() + amount);
        System.out.println("Operation Succesfully Finished!");

    }

    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            //  Handle any exceptions.
        }
    }
}
