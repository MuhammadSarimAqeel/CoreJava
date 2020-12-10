//
//package com.royalcyber;
//
//import javax.naming.CompositeName;
//import java.awt.geom.Arc2D;
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        // write your code here
//
//        String newcustomer = "";
//        String newaccount = "";
//        String cnic = "";
//
//
//        char choice = '0';
//
//
//
//            System.out.println("1 = create an account");
//            System.out.println("2 = View your account");
//            System.out.println("\n");
//            System.out.println("Enter an option");
//            Scanner scan5 = new Scanner(System.in);
//            choice = scan5.next().charAt(0);
//            System.out.println("\n");
//            switch (choice) {
//                case '1':
//                    bankaccount obj1 = new bankaccount("sarim", "AD0001", "4250185239497");
//                    obj1.create();
//
//                case '2':
//
//                        System.out.println("here is your account");
//                        System.out.println("NAME: " + newcustomer);
//                        System.out.println("ACCOUNT NO. " + newaccount);
//                        System.out.println("CNIC: " + cnic);
//                    bankaccount obj2 = new bankaccount("sarim", "AD0001", "4250185239497");
//                    obj2.showmenu();
//
//                        break;
//
//                    default:
//                        System.out.println("Invalid option please enter again");
//
//
//
//
////                case '2':
////                    bankaccount obj1 = new bankaccount("sarim", "AD0001", "4250185239497");
////                    obj1.showmenu();
//
////                    break;
////                default:
////                    System.out.println("Invalid option please enter again");
//
//            }
//
//
//        }
////        while (choice <= 2);
////        {
////
////
////        }
////
////
////
////
////        bankaccount obj1 = new bankaccount("sarim", "AD0001", "4250185239497");
////        obj1.create();
////        obj1.showmenu();
////
////
////        bankaccount obj2 = new bankaccount("sarim", "AS1234", "000000000000");
////        obj1.create();
////        obj1.showmenu();
////
////        bankaccount obj3 = new bankaccount("000", "000", "0000");
////        obj1.create();
////        obj1.showmenu();
////
////
////        bankaccount obj4 = new bankaccount("000", "000", "0000");
////        obj1.create();
////        obj1.showmenu();
////
////
////        bankaccount obj5 = new bankaccount("000", "000", "0000");
////        obj1.create();
////        obj1.showmenu();
//
//
//
//    }
//
//
//
//    class bankaccount {
//
//        float balance;
//        float previoustransaction;
//        String newcustomer = "";
//        String newaccount = "";
//        String cnic = "";
//
//
//        bankaccount(String Cname, String Cid, String Cnic) {
//
//            Cname = newcustomer;
//            Cid = newaccount;
//            Cnic = cnic;
//
//
//        }
//
//
//        void deposit(float amount) {
//            if (amount > 0) {
//                balance = balance + amount;
//                previoustransaction = amount;
//            }
//        }
//
//        void withdraw(float amount) {
//            if (amount > 0) {
//                balance = balance - amount;
//                previoustransaction = -amount;
//
//            }
//        }
//
//        void getprevioustransaction() {
//            if (previoustransaction > 0) {
//                System.out.println("Deposited: " + previoustransaction);
//            } else if (previoustransaction < 0) {
//                System.out.println("Withdrawn: " + Math.abs(previoustransaction));
//
//            } else {
//                System.out.println("No Transaction occured");
//            }
//        }
//
//        void showmenu() {
//            char option = '0';
//
//            do {
//
//                System.out.println("\n");
//                System.out.println("Enter an option");
//                Scanner scan2 = new Scanner(System.in);
//                System.out.println("\n");
//                System.out.println("A  = Check Balance");
//                System.out.println("B  = Deposit");
//                System.out.println("C  = Withdraw");
//                System.out.println("D  = Check previous Transaction");
//                System.out.println("G = go to main menu");
//                System.out.println("E  = Exit");
//                option = scan2.next().charAt(0);
//                System.out.println("\n");
//                switch (option) {
//                    case 'A':
//                        System.out.println("Balance is " + balance);
//                        System.out.println("\n");
//                        break;
//                    case 'a':
//                        System.out.println("Balance is " + balance);
//                        System.out.println("\n");
//                        break;
//                    case 'B':
//                        System.out.println("Enter an amount to deposit");
//                        float amount = scan2.nextFloat();
//                        deposit(amount);
//                        System.out.println("\n");
//                        break;
//                    case 'b':
//                        System.out.println("Enter an amount to deposit");
//                        float amounts = scan2.nextFloat();
//                        deposit(amounts);
//                        System.out.println("\n");
//                        break;
//                    case 'C':
//                        System.out.println("Enter an amount to withdraw");
//                        float amount2 = scan2.nextFloat();
//                        deposit(amount2);
//                        System.out.println("\n");
//
//                    case 'c':
//                        System.out.println("Enter an amount to withdraw");
//                        float amount2s = scan2.nextFloat();
//                        deposit(amount2s);
//                        System.out.println("\n");
//                        break;
//
//                    case 'D':
//                        System.out.println("Your previous transaction was ");
//                        getprevioustransaction();
//                        System.out.println("\n");
//                        break;
//                    case 'd':
//                        System.out.println("Your previous transaction was ");
//                        getprevioustransaction();
//                        System.out.println("\n");
//                        break;
//                    case 'G':
//                        create();
//                        break;
//                    case 'g':
//                        create();
//                        break;
//
//                    case 'E':
//                        System.out.println("******************************************************");
//                        break;
//                    case 'e':
//                        System.out.println("******************************************************");
//
//                        break;
//                    default:
//                        System.out.println("Invalid option please enter again");
//                        break;
//
//                }
//            }
//            while (option != 'E');
//            {
//                System.out.println(" Thanks for using royal cyber`s services");
//                System.out.println("**********************************************************");
//
//
//            }
//        }
//
//
//        void create() {
//
//
////            char choice = '0';
////
////            do {
////
////                System.out.println("1 = create an account");
////                System.out.println("2 = View your account");
////                System.out.println("\n");
////                System.out.println("Enter an option");
////                Scanner scan5 = new Scanner(System.in);
////                choice = scan5.next().charAt(0);
////                System.out.println("\n");
////                switch (choice) {
////                    case '1':
//            bankaccount[] objArray;
//            bankaccount[] arrayofobject = new bankaccount[5];
//
//                        System.out.println("Enter full name");
//                        Scanner scan4 = new Scanner(System.in);
//                        newcustomer = scan4.nextLine();
//                        System.out.println("Enter new account number");
//                        newaccount = scan4.nextLine();
//                        System.out.println("Enter your CNIC NO.");
//                        cnic = scan4.nextLine();
//            arrayofobject[0] = new bankaccount("000","000", "000");
//            arrayofobject[1] = new bankaccount("000","000", "000");
//            arrayofobject[2] = new bankaccount("000","000", "000");
//            arrayofobject[3] = new bankaccount("000","000", "000");
//            arrayofobject[4] = new bankaccount("000","000", "000");
//
//            System.out.println("Your account has been created");
//                        System.out.println("\n");
//
////                        break;
////
////                    case '2':
////
////                        System.out.println("here is your account");
////                        System.out.println("NAME: " + newcustomer);
////                        System.out.println("ACCOUNT NO. " + newaccount);
////                        System.out.println("CNIC: " + cnic);
////
////                        break;
//
////                    default:
////                        System.out.println("Invalid option please enter again");
//                }
//
////
////            }
////            while (choice <= 2);
////            {
////
////
////            }
//        }
//
//



package com.royalcyber;

import javax.naming.CompositeName;
import java.awt.geom.Arc2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    BankAccount obj1 = new BankAccount("Sarim", "AD123990", "4250185239497");
    ArrayList<BankAccount> list = new ArrayList<BankAccount>();

    public ArrayList<BankAccount> getList() {
        return list;
    }

    String newcustomer = "";
    String newaccount = "";
    String cnic = "";

    public static void main(String[] args) {

//        // write your code here

        Main obj2= new Main();
        obj2.begin();

    }

    void begin() {
        String newcustomer = "";
        String newaccount = "";
        String cnic = "";




            char choice = '0';

        do {

            System.out.println("1 = create an account");
            System.out.println("2 = View your account");
            System.out.println("\n");
            System.out.println("Enter an option");
            Scanner scan5 = new Scanner(System.in);
            choice = scan5.next().charAt(0);
            System.out.println("\n");
            switch (choice) {
                case '1':

                    System.out.println("Enter full name");
                    Scanner scan4 = new Scanner(System.in);
                    newcustomer = scan4.nextLine();
                    System.out.println("Enter new account number");
                    newaccount = scan4.nextLine();
                    System.out.println("Enter your CNIC NO.");
                    cnic = scan4.nextLine();
                    BankAccount obj1 = new BankAccount("sarim", "AD0001", "4250185239497");
                    obj1.showmenu();
                    System.out.println("Your account has been created");
                    System.out.println("\n");
                    break;

                case '2':

                    System.out.println("here is your account");
                   for (int i =0 ; i<list.size();i++){
                       System.out.println("NAME:" + list.get(i).cnic);
                       System.out.println("ACCOUNT NO:" + list.get(i).newaccount);
                       System.out.println("CNIC:" + list.get(i).newcustomer);
                   }


                    break;
                default:
                    System.out.println("Invalid option please enter again");

            }


        }

        while (choice <= 2);
        {
        }

    }
}














