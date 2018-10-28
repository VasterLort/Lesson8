package by.it_academy.VasterLord.bases;

public class Base implements BaseMethods {
		private String name;
		private static int counter;
		private int id;
		
		static {
			counter = 1;
		}
		
		public Base(String name) {
			this.name = name;
			id = counter++;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public int getId() {
			return id;
		}
		
		public void display() {
			System.out.println("ID игры " + getId());
			System.out.println("Название игры: " + getName());
		}
}
