package com.braindata.bankmanagement.service;

import java.io.IOException;

public interface Rbi {

	public abstract void createAccount() throws IOException;
	public void displayAllDetails() throws IOException;
	public void depositeMoney() throws IOException;
	public void withdrawal() throws IOException;
	public void balanceCheck() throws IOException;
	
}
