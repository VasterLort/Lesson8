package by.it_academy.VasterLord.type_genre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import by.it_academy.VasterLord.enums.Race;
import by.it_academy.VasterLord.enums.TypeHero;
import by.it_academy.VasterLord.time.TimeGame;

public class Fantasy extends TimeGame {
	private Race race;
	private TypeHero type_hero;
	private int level;
	
	public Fantasy(String name, int amount_time, int race, int type_hero, int level) {
		super(name, amount_time);
		this.level = level;
		
		Race r = null;
		TypeHero t = null;
		
		int select_race = race;
		if(select_race == 1)this.race = r.Human;
		else if(select_race == 2)this.race = r.Elf;
		else if(select_race == 3)this.race = r.Gnome;
		
		int select_type_hero = type_hero;
		if(select_type_hero == 1)this.type_hero = t.Mage;
		else if(select_type_hero == 2)this.type_hero = t.Warrior;
		else if(select_type_hero == 3)this.type_hero = t.Archer;
		else if(select_type_hero == 4)this.type_hero = t.Rogue;
		
	}
	
	public Race getRace() {
		return race;
	}

	public TypeHero getTypeHero() {
		return type_hero;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public int getLevel() {
		return level;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Раса: " + getRace());
		System.out.println("Класс: " + getTypeHero());
		System.out.println("Какой level: " + getLevel());
	}

}
