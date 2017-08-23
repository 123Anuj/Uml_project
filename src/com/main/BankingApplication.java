package com.main;

import java.util.Scanner;

import com.model.Account;
import com.model.Bank;
import com.model.Customer;

/**
 * As this is a dummy project it will help you to understand the flow.
 * 
 *  @<B>Note:  Testing and other functionality are still left as we have made this application for normal student and to be completed in 3 hrs.</B>
 * @author Anuj
 *
 */
public class BankingApplication {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int no_of_customers=0;
		System.out.println("#==============Welcome TO Banking Application============#");
		
		Customer customer=new Customer();
		Scanner scannner=new Scanner(System.in);
			
			System.out.println("Enter 1 to open your account");
			int choice =scannner.nextInt();
			System.out.println(scannner.nextLine());
			switch(choice){
			
			case 1: System.out.println("Please enter the name of the Bank In which you want to open acccount");
			
			        String bank_name=scannner.nextLine();
			       
			        System.out.println("Please enter the location of the bank");
			        
			        String location=scannner.nextLine();
					Bank bank=new Bank(bank_name, location);
					
				bank.setNumber_of_customers(no_of_customers+1);
					
					System.out.println("Please enter your Name");
					
					String customer_name=scannner.nextLine();
					
					System.out.println("Please enter your Address");
					
					String cust_adress=scannner.nextLine();
					
					System.out.println("Please enter your Aadhar Number");
					String aadhar=scannner.nextLine();
					
					customer.setAadhar_number(aadhar);
					
					customer.setAdress(cust_adress);
					
					customer.setCustomer_name(customer_name);
					
					
					System.out.println("Please wait while we are generating your account number it will take maximum 20 seconds ");
					Thread.sleep(20000);
					
					Account account=new Account(customer,bank);
					
					customer.setAccount_number(account.generate_Account_Number());
					System.out.println("Your account number is "+account.generate_Account_Number());
					account.setAssociated_To_Bank(bank_name);
					account.setBalance(0);
					
					while(true){
						System.out.println(" *To deposit money press 2\n * To withdrawl press 3 \n Press 4 to close the account and press any other key to exit.");
					
					int choice_2=scannner.nextInt();
					
					switch(choice_2){
					
					
					case 2:  // deposit
					
					
					
						
						System.out.println("please enter how much money you want to deposit");
						double money=scannner.nextDouble();
						
						double balance=customer.deposit(money,account);
						System.out.println("Before deposit your balance is "+account.getBalance());
						
						account.setBalance(balance);
						System.out.println("After deposit your balance is "+account.getBalance());
						break;
					
					case 3:
					
						
						System.out.println("Please enter how much money you want to withdraw");
						double amount= scannner.nextDouble();
						double balance_1=customer.withdraw(amount, account);
						
						account.setBalance(balance_1);
						
						
						System.out.println("Now your balance is "+ account.getBalance());
						break;
						
					
					case 4:
						
						customer.close_Account(account);
						System.out.println("Please wait a while we are deleting your Information");
						Thread.sleep(10000);
						System.out.println("Account closed Successfully");
						System.exit(5);
						
					default: System.out.println("Application closed"); 
						System.exit(7);;
					
					}
					
					
					
					
					}
					
					
					default: break;
					
					
					
					
			}
			
			
		
	}
	
}
