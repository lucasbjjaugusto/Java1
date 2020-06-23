package application;

public class programS10 {
	public static void main(String[] args) {
		/*int x = 20; Boxing/Unboxing/Wrappler Class
		Integer obj = x;
		System.out.println(obj);
		int y = obj * 2;
		System.out.println(y);*/
		//
		String[] vect = new String[] {"Cida","Lucas","Peyton"};
		/*for (int i = 0; i < vect.length; i++) {
			System.out.println("Nome:"+ vect[i]);
		}*/
		//For each
		for (String Nome : vect) {
			System.out.println(Nome);
		}
	}
}
