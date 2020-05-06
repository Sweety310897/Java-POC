package com.shivani.bank.models;

public class Account {

	String[] accTypes = {"Savings", "Current", "Fixed", "DEMAT"};
	private final int accountNumber;
	private final String customerName;
	private String accountType;
	private long accountBalance;
	private final String socialSecurityNumber;

	Account(int accountNumber, String custName, int accType, String socialSecurityNumber) {
		this.accountNumber = accountNumber;
		this.customerName = custName;
		this.accountType = accTypes[accType];
		this.accountBalance = 0;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	/*
	 * return account number
	 */
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	/*
	 * return name of the customer
	 */

	public String getCustomerName() {
		return this.customerName;
	}

	/*
	 * return account type of the bank
	 */
	public String getAccountType() {
		return this.accountType;
	}

	/*
	 * return account balance of the account
	 */
	public long getAccountBalance() {
		return this.accountBalance;
	}
	
	
	/*
	 * set account type 
	 */
	public void setAccountType(int type) {
		this.accountType = accTypes[type];
		
	}

	/*
	 * update the balance
	 */
	public void updateAccountBalance(long amount) {
		this.accountBalance = amount;
	}

	/*
	 * return social security number
	 */
	public String getSSN() {
		return this.socialSecurityNumber;
	}

}
