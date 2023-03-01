package week1.assignment2;

import java.util.Arrays;

public class SmallNumArray {

	public static void main(String[] args) {
		int numb[]= {23,45,67,32,89,22};
		Arrays.sort(numb);
		System.out.println("Sorted Array:");
		for (int i = 0; i < numb.length; i++) {
			System.out.println(numb[i]);
		}
		int secSmall=numb[1];
		System.out.println("Second Smalled number in the Array is "+secSmall);
	}

}
