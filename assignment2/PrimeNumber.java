package week1.assignment2;

public class PrimeNumber {

	public static void main(String[] args) {
		int inp = 13;
		boolean flag = false;
		for (int i = 2; i <= inp/2; i++) {
			int rm = inp % i;
			if(rm == 0) {
				flag = true;
				break;
			}
		}
		if(flag == true) {
			System.out.println(inp+" is not a Prime Number");
		}else {
			System.out.println(inp+" is a Prime Number");
		}

	}

}
