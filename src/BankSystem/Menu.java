/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankSystem;

import java.util.Scanner;

public class Menu {

    public static Bank bank = new Bank();
    private static Scanner sc = new Scanner(System.in);
    private static String MENU = " Menu \n"
            + "1.Show All Customer \n"
            + "2.Search By Customer Id \n"
            + "3.Register \n"
            + "4.Withdrawal \n"
            + "5.Deposit \n"
            + "6.Transfer Money\n"
            + "7.Exit \n";

    public static void main(String[] args) {
        menu();

    }
    public static void menu(){
         int choice;
        do {
            System.out.println(MENU);
            System.out.println("Please select : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    bank.showAllUser();
                    break;
                case 2:
                    System.out.println("Enter Id that you want to search:");
                    bank.findById(sc.nextLong());
                    break;
                case 3:
                    bank.createAccount();
                    break;
                case 4:
                    bank.withdrawal();
                    break;
                case 5:
                    bank.deposit();
                    break;
                case 6:
                    bank.transfer();
                    break;
                case 7:
                    System.out.println("Thank you for using BankIsmayil");
                    break;
            }
        } while (choice != 7);
    }

}
