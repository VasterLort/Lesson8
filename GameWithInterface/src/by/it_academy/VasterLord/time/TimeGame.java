package by.it_academy.VasterLord.time;

import by.it_academy.VasterLord.bases.Base;

public abstract class TimeGame extends Base {
	private int amount_time;
	public TimeGame(String name, int amount_time) {
		super(name);
		this.amount_time = amount_time;
	}
	
	public int getAmount_time() {
		return amount_time;
	}

	public void setAmount_time(int amount_time) {
		this.amount_time = amount_time;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Время прохождения игры: " + amount_time );
	}
	
	

}
