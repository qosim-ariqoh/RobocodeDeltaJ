package jab;

import java.awt.Color;

import jab.module.Module;
import jab.module.Radar;
import jab.module.Movement;
import jab.module.Targeting;
import jab.module.SelectEnemy;
import jab.module.Gun;

public class ModuleBot extends Module {

	protected void initialize() {
		setBodyColor(Color.BLACK);
		setGunColor(Color.BLACK);
		setRadarColor(Color.BLACK);
		setScanColor(Color.BLUE);
		setBulletColor(Color.RED);
	}

	protected void selectBehavior() {
		radar = new Radar(this);
		movement = new Movement(this);
		targeting = new Targeting(this);
		selectEnemy = new SelectEnemy(this);
		gun = new Gun(this);
	}
	
}
