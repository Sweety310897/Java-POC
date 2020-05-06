package com.shivani.bank.exceptions;

@SuppressWarnings("serial")
public class BalanceException extends RuntimeException{
	/*
	 * It is a constructor
	 */
	public BalanceException(String message) {
		super(message);
	}
}
