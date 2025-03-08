package jab;

import java.awt.Color;

import jab.module.Module;
import jab.module.Radar;
import jab.radar.SpinningRadar;

public class ModuleBot extends Module {

	protected void initialize() {
		setBodyColor(Color.BLACK);
		setGunColor(Color.BLACK);
		setRadarColor(Color.BLACK);
		setScanColor(Color.BLUE);
		setBulletColor(Color.RED);
	}

	protected void selectBehavior() {
		radar = getSelectedRadar();
		movement = null;
		targeting = null;
		selectEnemy = null;
		gun = null;
	}
	
	private Radar getSelectedRadar() {
		
		return new SpinningRadar(this);
	}
	
}
