package com.dr.designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		System.out.println(ba);
		
		List<BankAccountCommand> commands = new ArrayList<>();
			commands.add(new BankAccountCommand(ba, BankAccountCommand.Action.DEPOSIT, 100));
			commands.add(new BankAccountCommand(ba, BankAccountCommand.Action.WITHDRAW, 1000));
			
		
		for(Command c: commands) {
			c.call();
			System.out.println(ba);
		}
		
		Collections.reverse(commands);
		for(Command c:  commands) {
			c.undo();
			System.out.println(ba);
		}		
	}
}
