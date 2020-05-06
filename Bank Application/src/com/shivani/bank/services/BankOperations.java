package com.shivani.bank.services;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import com.shivani.bank.models.Bank;
import com.shivani.bank.models.BankAccount;

public class BankOperations {
	Bank shivaniBank = new Bank();
	LogManager lgmngr = LogManager.getLogManager();
	Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	int accountNumber;
	int bankAccType;
	String custName; 
	String custMobileNo;
	String custEmail;
	String aadarNumber;

	public enum Choices {
        ADDACCOUNT, DISPLAYALL, SEARCHBYACCOUNT, DEPOSIT, WITHDRAW, EXIT;
    }
 
	/*
	 * create new account
	 */
	public void add(int accountNumber, String custName,int bankAccType,String custMobileNo,String custEmail,String aadarNumber) {
		
		if(shivaniBank.getSecurityMap().containsKey(aadarNumber)) {
			log.log(Level.INFO, "Sorry Account already exists with account number: " + shivaniBank.getAccWithSSN(aadarNumber));
		} else {
			BankAccount bankaccount = new BankAccount(accountNumber, custName, bankAccType-1, custMobileNo, custEmail, aadarNumber);
			shivaniBank.createNewAccount(bankaccount);
			log.log(Level.INFO, " Account created with account number: " + accountNumber); 
		    
		}
	
	}
	
	/*
	 * to display all the accounts
	 */
	public void display() {
		
		shivaniBank.getAccountMap().forEach((k, v) -> 	log.log(Level.INFO, "Display Details\n"+ v ));
		
	}
	
	/*
	 * search account by account number
	 */
	public void search(int searchAccountNumber) {
		
		if(shivaniBank.getAccountMap().containsKey(searchAccountNumber)) {
			log.log(Level.INFO, "Search Details\n" + shivaniBank.getAccount(searchAccountNumber));
			
		} else {
			log.log(Level.INFO, "Sorry Search failed Account dooesn't exist..");
		}
		
	}
	
	/*
	 * deposit amount to the account
	 */
	public void deposit(int depositAccountNumber,long amount) {
		
		shivaniBank.getAccount(depositAccountNumber).deposit(amount);
	
	}
	
	/*
	 * withdraw amount from the account
	 */
	public void withDraw(int withdrawAccountNumber,long amount) {

		shivaniBank.getAccount(withdrawAccountNumber).withDraw(amount);
	}
}
