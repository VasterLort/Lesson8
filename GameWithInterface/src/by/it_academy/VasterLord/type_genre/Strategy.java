package by.it_academy.VasterLord.type_genre;

import by.it_academy.VasterLord.time.TimeGame;

public class Strategy extends TimeGame {
	private int number_of_player;
	public Strategy(String name, int amount_time, int number_of_player) {
		super(name, amount_time);
		this.number_of_player = number_of_player;
	}
	
	public void setNumber_of_player(int number_of_player) {
		this.number_of_player = number_of_player;
	}
	
	public int getNumberOfPlayer() {
		return  number_of_player;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Количество людей в одной игре: " + getNumberOfPlayer());
	}
}
