package week1.assignment2;

public class FibanocciNumbers {

	public static void main(String[] args) {
		int range = 10, n1 = 0, n2 = 1;
		System.out.println("Fibanocci Series:");
		System.out.println(n1);
		System.out.println(n2);
		for (int i = n1; i < range; i++) {
			int n3 = n1 + n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
		}

	}

}
