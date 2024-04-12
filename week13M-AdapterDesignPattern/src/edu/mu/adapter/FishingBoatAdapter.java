package edu.mu.adapter;

public class FishingBoatAdapter implements IRowingBoat {
	
	private FishingBoat fishingBoat;

	public FishingBoatAdapter() {
		fishingBoat = new FishingBoat();
	}
	
	@Override
	public void row() {
		fishingBoat.sail();
	}

}
