package com.shivani.bank.exceptions;

@SuppressWarnings("serial")
public class AccountDetailsException extends RuntimeException {
	/*
	 * It is a constructor
	 */
	public AccountDetailsException(String message) {
		super(message);
	}
}
