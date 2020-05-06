package com.shivani.bank.models;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import com.shivani.bank.exceptions.BalanceException;
import com.shivani.bank.interfaces.AccountOperations;

public class BankAccount extends Account implements AccountOperations{
	
	
	private String custPhoneNo;
	private String custEmailId;
	
	LogManager lgmngr = LogManager.getLogManager(); 
	Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public BankAccount(int accNumber, String custName, int accType, String custPhoneNo, String custEmailId, String ssn) {
		super(accNumber, custName, accType, ssn);
		this.custPhoneNo = custPhoneNo;
		this.custEmailId = custEmailId;
	}

	/*
	 * return customer email
	 */
	public String getCustEmail() {
		return this.custEmailId;
	}

	/*
	 * return phone number
	 */
	public String getCustPhone() {
		return this.custPhoneNo;
	}

	/*
	 * deposit the amount to the account
	 * @see com.shivani.bank.interfaces.AccountOperations#deposit(long)
	 */
	public void deposit(long amount) {
		if(amount > 0 ) {
			updateAccountBalance(getAccountBalance() + amount);
			log.log(Level.INFO, "Amount deposited successfully");
		} else {
			throw new BalanceException("You cannot deposit as the number entered by you is less than 0");
		}

	}

	/*
	 * withdraw amount from the account
	 * @see com.shivani.bank.interfaces.AccountOperations#withDraw(long)
	 */
	public void withDraw(long amount) {		
		if(amount >0 && amount < getAccountBalance()  ) {
			updateAccountBalance(getAccountBalance() - amount);
			log.log(Level.INFO, "Amount Withdrawn successfully");
			log.log(Level.INFO, "Remaining Balance is " + getAccountBalance());
		}else {
			throw new BalanceException("Balance is less. U cannot withdraw");
		}

	}


	/*
	 * overriding toString method
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Name: " + getCustomerName() + "\n" + "Account Number: " + getAccountNumber() + "\n" + "Account Type: " + getAccountType() + "\n" + "Available Balance: " + getAccountBalance() + "\n" + "Mobile Number: " + getCustPhone() + "\n" + "Email id: " + getCustEmail() + "\n";
	}


}
