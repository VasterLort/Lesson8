package by.it_academy.VasterLord.class_realization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import by.it_academy.VasterLord.bases.Base;
import by.it_academy.VasterLord.type_genre.*;

public class Realization {
	public void start() {
		List<Base> list = new ArrayList<>();
		work(list);
	}
	
	private void work(List<Base> list) {
		int sel = 0;
		while(sel != 4) {
			sel = menu();
			
			if(sel == 1) createObject(list);
			else if(sel == 2)inputOne(list);
			else if(sel == 3)inputAll(list);
		}
	}
	
	private void createObject(List<Base> list) {
		int sel = menuGame();
		if(sel == 1) action(list);
		else if(sel == 2)fantasy(list);
		else if(sel == 3)strategy(list);
		else if(sel == 4)simulator(list);
	}
	
	private void inputOne(List<Base> list) {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int number = 0;
		System.out.println();
		System.out.print("Номер нужного объекта: ");
		try {
			number = Integer.parseInt(read.readLine());
			number--;
		}catch(IOException e) {e.printStackTrace();}
		Base b = list.get(number);
		System.out.println();
		b.display();
	}
	
	private void inputAll(List<Base> list) {
		for (Base l : list) {
				System.out.println();
				l.display();
			}
	}
	
	private void action(List<Base> list) {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println();
			System.out.print("Название игры: ");
			String name = read.readLine();
			System.out.print("Время прохождения: ");
			int time_into_game = Integer.parseInt(read.readLine());
			System.out.print("Название войны: ");
			String name_of_war = read.readLine();
			System.out.print("Количество эпизодов: ");
			int number_of_episodes = Integer.parseInt(read.readLine());
			Action action = new Action(name, time_into_game, name_of_war, number_of_episodes);
			list.add(action);
		}catch(IOException e) {e.printStackTrace();}
	}
	
	private void fantasy(List<Base> list) {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println();
			System.out.print("Название игры: ");
			String name = read.readLine();
			System.out.print("Время прохождения: ");
			int time_into_game = Integer.parseInt(read.readLine());
			System.out.print("Раса: ");
			int r = menuRace();
			System.out.print("Класс: "); 
			int t = menuTypeHero();
			System.out.print("Уровень в игре: ");
			int level = Integer.parseInt(read.readLine());
			Fantasy fantasy = new Fantasy(name, time_into_game, r, t, level);
			list.add(fantasy);
		}catch(IOException e) {e.printStackTrace();}
	}
	
	private int menuTypeHero() {
		System.out.println();
		System.out.println("1 - Маг");
		System.out.println("2 - Воин");
		System.out.println("3 - Лучник");
		System.out.println("4 - Разбойник");
		int select = input();
		System.out.println();
		return select;
	}
	
	private int menuRace() {
		System.out.println();
		System.out.println("1 - Человек");
		System.out.println("2 - Эльф");
		System.out.println("3 - Гном");
		int select = input();
		System.out.println();
		return select;
	}

	private void strategy(List<Base> list) {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println();
			System.out.print("Название игры: ");
			String name = read.readLine();
			System.out.print("Время прохождения: ");
			int time_into_game = Integer.parseInt(read.readLine());
			System.out.print("Количество людей в одной игре: ");
			int number_of_player = Integer.parseInt(read.readLine());
			Strategy strategy = new Strategy(name, time_into_game, number_of_player);
			list.add(strategy);
		}catch(IOException e) {e.printStackTrace();}
	}
	
	private void simulator(List<Base> list) {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println();
			System.out.print("Название игры: ");
			String name = read.readLine();
			Simulator simulator = new Simulator(name);
			list.add(simulator);
		}catch(IOException e) {e.printStackTrace();}
	}
	
	private int menu() {
		System.out.println();
		System.out.println("1 - Создать объект");
		System.out.println("2 - Вывод данных определенного объекта");
		System.out.println("3 - Вывод данных всех объектов");
		System.out.println("4 - Выход");
		int select = input();
		return select;
	}
	
	private int menuGame() {
		System.out.println();
		System.out.println("Создать объект типа:");
		System.out.println("1 - Экшен");
		System.out.println("2 - Фэнтези");
		System.out.println("3 - Стратегия");
		System.out.println("4 - Симулятор");
		int select = input();
		return select;
	}
	
	private int input() {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int select = 0;
		try {
			select = Integer.parseInt(read.readLine());
		}catch(IOException e) {e.printStackTrace();}
		return select;
	}
}
