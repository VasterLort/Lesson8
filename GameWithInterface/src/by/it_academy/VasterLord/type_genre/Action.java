package by.it_academy.VasterLord.type_genre;

import by.it_academy.VasterLord.time.TimeGame;

public class Action extends TimeGame {
	private String name_war;
	private int number_of_episodes;
	public Action(String name, int amount_time, String name_war, int number_of_episodes) {
		super(name, amount_time);
		this.name_war = name_war;
		this.number_of_episodes = number_of_episodes;
	}
	
	public String getNameWar() {
		return name_war;
	}
	
	public int getNumberOfEpisodes() {
		return number_of_episodes;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Название войны: " + getNameWar());
		System.out.println("Количество эпизодов: " + getNumberOfEpisodes());
	}
}
