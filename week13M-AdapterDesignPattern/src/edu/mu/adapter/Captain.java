package edu.mu.adapter;

public class Captain {
	
	private IRowingBoat rowingBoat;
	
	public Captain() {
	}
	
	public Captain(IRowingBoat rowingBoat) {
		this.rowingBoat = rowingBoat;
	}
	
	
	public void row() {
		rowingBoat.row();
	}

}
