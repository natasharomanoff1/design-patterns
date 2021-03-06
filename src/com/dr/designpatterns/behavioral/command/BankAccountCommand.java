package com.dr.designpatterns.behavioral.command;

public class BankAccountCommand implements Command {

	public enum Action {
		DEPOSIT, WITHDRAW;
	}

	private BankAccount account;
	private boolean succeeded;
	private Action action;
	private int amount;

	public BankAccountCommand(BankAccount account, Action action, int amount) {
		super();
		this.account = account;
		this.action = action;
		this.amount = amount;
	}

	@Override
	public void call() {
		switch (action) {
		case DEPOSIT:
			succeeded = true;
			account.deposit(amount);
			break;
		case WITHDRAW:
			succeeded = account.withdraw(amount);
			break;
		}
	}

	@Override
	public void undo() {
		if(!succeeded) return;
		switch (action) {
		case DEPOSIT:
			account.withdraw(amount);

			break;
		case WITHDRAW:
			account.deposit(amount);
			break;
		}
	}

}
