package week1.assignment2;

public class NumCheck {
	public void num(int n) {
		if(n<0) {
			System.out.println("The number is Negative: "+n);
		}else if(n>0) {
			System.out.println("The number is Positive: "+n);
		}else {
			System.out.println("The number is neither Negative nor Positive (ZERO): "+n);
		}		
	}
	public static void main(String[] args) {
		int n1=35;
		int n2=0;
		int n3=-42;
		NumCheck nobj=new NumCheck();
		nobj.num(n1);
		nobj.num(n2);
		nobj.num(n3);
	}

}
