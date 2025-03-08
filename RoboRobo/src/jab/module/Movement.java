package jab.module;

import robocode.HitWallEvent;
import robocode.Event;
import jab.module.Module;

/**
 * Movement
 * 
 * @author jab
 */
public class Movement extends Part {

	public Module bot;

	public Movement(Module bot) {
		this.bot = bot;
		turnRightValue = 45;
	}

	public void move() {
		// Limit our speed to 5
		bot.setMaxVelocity(8);
		// Start moving (and turning)
		bot.setAhead(10000);
	}

	int turnRightValue;

	public void listen(Event e) {
		if (e instanceof HitWallEvent) {
			bot.setTurnRight(turnRightValue);
		}
	}

}
