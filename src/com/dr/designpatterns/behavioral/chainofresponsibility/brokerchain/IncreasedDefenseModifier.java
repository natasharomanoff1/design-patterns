package com.dr.designpatterns.behavioral.chainofresponsibility.brokerchain;

public class IncreasedDefenseModifier extends CreatureModifier {

	public IncreasedDefenseModifier(Game game, Creature creature) {
		super(game, creature);

		game.queries.subscribe(q -> {
			if (q.creatureName.equals(creature.name) && q.argument == Query.Argument.DEFENSE) {
				q.result += 3;
			}
		});
	}
}
