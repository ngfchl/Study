package zuoye;

import java.util.Scanner;

public class MainDis {

	public static void main(String[] args) {
		java.util.Scanner scanner = new Scanner(System.in);
		City city = new City();
		city.cityName();

		int x = city.dis(scanner.next(), scanner.next());
		System.out.println(x);
		scanner.close();
	}
}

class City {
	private int m = 0;
	private int n = 0;
	java.util.HashMap<String, Integer[]> distance = new java.util.HashMap<String, Integer[]>();
	java.util.ArrayList<String> disName = new java.util.ArrayList<String>();
	java.util.Scanner scanner = new java.util.Scanner(System.in);

	public int dis(String x, String y) {
		int a = this.name(y);
		Integer[] k = distance.get(x);
		return k[a];
	}

	public int name(String x) {
		int a = 0;
		for (int i = 0; i < m; i++) {
			if (x.equals(disName.get(i))) {
				a = i;
				break;
			}
		}
		return a;
	}

	public void cityName() {
		while (true) {
			String cityName = scanner.next();
			if (!cityName.equals("###")) {
				disName.add(cityName);
				m++;
			} else {
				break;
			}
		}
		for (int i = 0; i < m; i++) {
			Integer[][] dis = new Integer[m][m];
			for (int j = 0; j < m; j++) {
				dis[i][j] = scanner.nextInt();
				n++;
			}
			distance.put(disName.get(i), dis[i]);
			if (n == m * m) {
				break;
			}
		}
	}

}
