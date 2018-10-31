package com.dr.designpatterns.behavioral.chainofresponsibility.methodchain;

public class IncreaseDefenseModifier extends CreatureModifier {

	public IncreaseDefenseModifier(Creature creature) {
		super(creature);
	}
	
	@Override
	public void handle() {
		System.out.println("Increasing " +creature.name+ "'s deffence.");
		creature.defence += 3;
		super.handle();
	}
	

}
