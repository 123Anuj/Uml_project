package com.model;

public class Customer {

	private String customer_name;
	
	
	private int account_number;
	
	private String adress;
	
	private String aadhar_number;
	
	public Customer(){
		
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public int getAccount_number() {
		return account_number;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getAadhar_number() {
		return aadhar_number;
	}

	public void setAadhar_number(String aadhar_number) {
		this.aadhar_number = aadhar_number;
	}
	
	public synchronized double deposit(double amount, Account account){
		
		double balance =account.getBalance();
		
		balance=balance+amount;
		
		return balance;
	}
	
	public synchronized double withdraw(double amount, Account account){
		
		double balance=account.getBalance();
		
		if(balance>amount){
			
			balance=balance-amount;
			
			return balance;		
		}
		else{
			System.out.println("Not able to withdraw due to insufficient balance");
			return balance;
		}
		
	}
	
	public void close_Account(Account account){
		
		account=null;
	}
	
	protected double seeAccountBalance(){
		
		return 0.0;
	}
}
