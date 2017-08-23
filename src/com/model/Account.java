package com.model;

public class Account {

	private double balance;
	 
	private String associated_To_Bank;
	
	private int account_number;
	
	private String customer_name;

	public Account(Customer customer, Bank bank) {
		// TODO Auto-generated constructor stub
		
		this.associated_To_Bank=bank.bank_name;
		this.customer_name=customer.getCustomer_name();
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAssociated_To_Bank() {
		return associated_To_Bank;
	}

	public void setAssociated_To_Bank(String associated_To_Bank) {
		this.associated_To_Bank = associated_To_Bank;
	}

	public int generate_Account_Number(){
		return (int)System.currentTimeMillis();
	}
	
	
}
