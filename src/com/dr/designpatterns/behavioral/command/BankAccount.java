package com.dr.designpatterns.behavioral.command;

public class BankAccount {
	private int balance;
	private int overdraftLimit = -500;
	
	public void deposit(int amount) {
		balance += amount;
		System.out.println("Deposit " + amount + ", balance is now " + balance);
	}
	
	public boolean withdraw(int amount) {
		if(balance - amount >= overdraftLimit) {
			balance -= amount;
			System.out.println("Withdraw " + amount + ", balance is now " + balance);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}
	
}
