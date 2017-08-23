package com.model;

/**
 * This is a public class in which the bank name and its location is visible to everyone.
 * Note: <B> The functionality can also be changed according to the requirements. 
 * @author Anuj
 *
 */
public class Bank {

	public static String bank_name;
	public static String bank_location;
	
	private int number_of_customers;
	
	public int getNumber_of_customers() {
		return number_of_customers;
	}

	public void setNumber_of_customers(int number_of_customers) {
		this.number_of_customers = number_of_customers;
	}

	public int getAccountNumbers() {
		return accountNumbers;
	}

	public void setAccountNumbers(int accountNumbers) {
		this.accountNumbers = accountNumbers;
	}

	private int accountNumbers;
	
	public Bank(String name, String location){
		Bank.bank_name=name;
		Bank.bank_location=location;
	}
	
	/**
	 * This method is used to generate the account numbers
	 * @return It is returning the Current time in millisecond 
	 */
	protected int generateAccountNumber(){
		return (int) System.currentTimeMillis();
	}
	
	/**
	 * According to the Bank this method should be implememted.As here we are not doing this.
	 * @return Either true or false
	 */
	public boolean approveTransaction(){
		
		return false;
	}

	
}
