package com.royalcyber;

import java.util.Scanner;

public class BankAccount {




        float balance;
        float previoustransaction;
        String newcustomer = "";
        String newaccount = "";
        String cnic = "";



        BankAccount(String Cname, String Cid, String Cnic) {

            Cname = newcustomer;
            Cid = newaccount;
            Cnic = cnic;





        }

        void deposit(float amount) {
            if (amount > 0) {
                balance = balance + amount;
                previoustransaction = amount;
            }
        }

        void withdraw(float amount) {
            if (amount > 0) {
                balance = balance - amount;
                previoustransaction = -amount;

            }
        }

        void getprevioustransaction() {
            if (previoustransaction > 0) {
                System.out.println("Deposited: " + previoustransaction);
            } else if (previoustransaction < 0) {
                System.out.println("Withdrawn: " + Math.abs(previoustransaction));

            } else {
                System.out.println("No Transaction occured");
            }
        }

        void showmenu() {
            char option = '0';

            do {

                System.out.println("\n");
                System.out.println("Enter an option");
                Scanner scan2 = new Scanner(System.in);
                System.out.println("\n");
                System.out.println("A  = Check Balance");
                System.out.println("B  = Deposit");
                System.out.println("C  = Withdraw");
                System.out.println("D  = Check previous Transaction");
                System.out.println("G = go to main menu");
                System.out.println("E  = Exit");
                option = scan2.next().charAt(0);
                System.out.println("\n");
                switch (option) {
                    case 'A':
                        System.out.println("Balance is " + balance);
                        System.out.println("\n");
                        break;
                    case 'a':
                        System.out.println("Balance is " + balance);
                        System.out.println("\n");
                        break;
                    case 'B':
                        System.out.println("Enter an amount to deposit");
                        float amount = scan2.nextFloat();
                        deposit(amount);
                        System.out.println("\n");
                        break;
                    case 'b':
                        System.out.println("Enter an amount to deposit");
                        float amounts = scan2.nextFloat();
                        deposit(amounts);
                        System.out.println("\n");
                        break;
                    case 'C':
                        System.out.println("Enter an amount to withdraw");
                        float amount2 = scan2.nextFloat();
                        deposit(amount2);
                        System.out.println("\n");

                    case 'c':
                        System.out.println("Enter an amount to withdraw");
                        float amount2s = scan2.nextFloat();
                        deposit(amount2s);
                        System.out.println("\n");
                        break;

                    case 'D':
                        System.out.println("Your previous transaction was ");
                        getprevioustransaction();
                        System.out.println("\n");
                        break;
                    case 'd':
                        System.out.println("Your previous transaction was ");
                        getprevioustransaction();
                        System.out.println("\n");
                        break;
                    case 'G':
                        Main obj2= new Main();
                        obj2.begin();
                        break;
                    case 'g':

                        break;

                    case 'E':
                        System.out.println("******************************************************");
                        break;
                    case 'e':
                        System.out.println("******************************************************");
                        System.out.println(" Thanks for using royal cyber`s services");
                        System.out.println("**********************************************************");
                        break;
                    default:
                        System.out.println("Invalid option please enter again");
                        break;

                }
            }
            while (option != 'E');
            {
                System.out.println(" Thanks for using royal cyber`s services");
                System.out.println("**********************************************************");

            }
        }

    }

