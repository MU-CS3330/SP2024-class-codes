package edu.mu.dragons.characters;

public class Dragon {
	
	private int HP;
	private String name;
	private DragonType dragonType;
	
	public Dragon(int hP, String name, DragonType type) {
		super();
		HP = hP;
		this.name = name;
		setDragonType(type);
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DragonType getDragonType() {
		return dragonType;
	}

	public void setDragonType(DragonType dragonType) {
		this.dragonType = dragonType;
	}
}
