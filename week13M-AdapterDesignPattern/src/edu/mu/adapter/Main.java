package edu.mu.adapter;

public class Main {

	public static void main(String[] args) {
		//Captain cap = new Captain();
//		Captain cap = new Captain(new FishingBoatAdapter());
		Captain cap = new Captain(new PirateShipAdapter());
		cap.row();
	}

}
