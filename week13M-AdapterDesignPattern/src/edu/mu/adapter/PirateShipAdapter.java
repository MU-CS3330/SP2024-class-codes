package edu.mu.adapter;

public class PirateShipAdapter implements IRowingBoat {

	private PirateShip pirateShip;

	public PirateShipAdapter() {
		pirateShip = new PirateShip();
	}
	
	@Override
	public void row() {
		pirateShip.engine();
	}

}
