package a0000_�bungen;

public abstract class Tier {
	private int alter;

	public Tier(int alter) {
		setAlter(alter);
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public int getAlter() {
		return this.alter;
	}
	
	public abstract void gibLaut();
}
