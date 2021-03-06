package com.shivani.bank.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.shivani.bank.exceptions.AccountDetailsException;
import com.shivani.bank.exceptions.BalanceException;
import com.shivani.bank.interfaces.InputReader;
import com.shivani.bank.models.Bank;
import com.shivani.bank.services.BankOperations.Choices;
import com.shivani.bank.validations.InputValidations;

public class FileReader implements InputReader{
	private final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	Bank shivaniBank;
	InputValidations validate;
	BankOperations bankop;
	
	public FileReader() {
		shivaniBank = new Bank();
		validate = new InputValidations();
		bankop = new BankOperations();
	}
	
	/*
	 * to read inputs from the file
	 */
	public void addAccount(String[] custDetails) {
		
		try {
			int accNumber = Integer.parseInt(custDetails[1]);
			String custName = custDetails[2];
            validate.checkName(custName);
			int bankAccType = Integer.parseInt(custDetails[3]);
			validate.checkAccType(bankAccType);
			String aadarNumber = custDetails[4];
			String custMobileNo = custDetails[5];
			validate.checkPhoneNum(custMobileNo);
			String custEmail = custDetails[6];
			validate.checkEmail(custEmail);
			bankop.add(accNumber, custName, bankAccType, custMobileNo, custEmail, aadarNumber);

		}catch (AccountDetailsException message) {
			logger.log(Level.INFO, message.getMessage()); 
        }		
	
	}
	
	/*
	 * display all accounts
	 */
	public void displayAll() {
		
		bankop.display();		
	
	}
	
	/*
	 * searching account
	 */
	public void searchByAccount(int searchAccountNumber) {
		
		bankop.search(searchAccountNumber);

	}
	
	/*
	 * deposit amount
	 */
	public void depositAmount(int depositAccountNumber, long amount) {
	
		try {
			bankop.deposit(depositAccountNumber,amount);
		}catch(AccountDetailsException | BalanceException message ) {
			logger.log(Level.INFO, message.getMessage());
		}
	
	}
	
	/*
	 * withdraw amount
	 */
	public void withDrawAmount(int withdrawAccountNumber, long amount) {
		
		try {				
			bankop.withDraw(withdrawAccountNumber,amount);
		} catch(AccountDetailsException | BalanceException message ) {
			logger.log(Level.INFO, message.getMessage());
		}
	
	}

	
	/*
	 * overriding read input method
	 * @see com.shivani.bank.interfaces.InputReader#readInput()
	 */
	@Override
	public void readInput() {
		File file = new File("resources/inputs.txt");
		try { 
			  Choices choice;
			  Scanner myReader = new Scanner(file);					
			  while (myReader.hasNextLine()) {
				      String fileData = myReader.nextLine();
				      String[] data = fileData.split(" ");
				      choice = Choices.valueOf(data[0]);
				      
				      switch (choice) {
							case ADDACCOUNT :		addAccount(data);
													break;
		
							case DISPLAYALL :		displayAll();
													break;
													
							case SEARCHBYACCOUNT :	searchByAccount(Integer.parseInt(data[1]));
													break;
													
							case DEPOSIT :			depositAmount(Integer.parseInt(data[1]),Long.parseLong(data[2]));
													break;
						
							case WITHDRAW :			withDrawAmount(Integer.parseInt(data[1]),Long.parseLong(data[2]));
													break;
													
							default :
													break;
						}
				      
			  }
			  
			  myReader.close();
			
		} catch (FileNotFoundException message) {
			logger.log(Level.INFO, "File Not Found");
		}
	}
}
