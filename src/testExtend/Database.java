package testExtend;

import java.util.ArrayList;

public class Database {

	private ArrayList<Item> listItem = new ArrayList<>();

	public void add(Item item) {
		listItem.add(item);
	}

	public void list() {
		for (Item item : listItem) {
			item.print();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Database db = new Database();
		db.add(new CD());
	}

}
