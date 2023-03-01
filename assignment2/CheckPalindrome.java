package week1.assignment2;

public class CheckPalindrome {

	public static void main(String[] args) {
		int num = 34343;
		int rm = 0, rv = 0;
		int tnum = num;
		System.out.println("Given Number: "+num);
		for (;tnum!=0;) {
			rm = tnum%10;
			rv=rv*10+rm;
			tnum=tnum/10;
		}		
		System.out.println("Reversal of given Number: "+rv);
		if(num == rv) {
			System.out.println("Given Number is a Palindrome");
		}else {
			System.out.println("Given Number is not a Palindrome");
		}
	}

}
