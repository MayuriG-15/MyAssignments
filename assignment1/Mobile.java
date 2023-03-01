package week1.assignment1;

public class Mobile {
	public void makeCall() {
		String mobileModel = "SAMSUNG";
		float mobileWeight = 157.4f;
		System.out.println("Mobile Model Name - "+mobileModel);
		System.out.println("Mobile Weight is - "+mobileWeight);
	}
	public void sendMsg() {
		boolean isFullyCharged = true;
		int mobileCost = 15000;
		System.out.println("Mobile is Fully Charged - "+isFullyCharged);
		System.out.println("Mobile Prize - "+mobileCost);	
	}
	public static void main(String[] args) {
		System.out.println("This is my Mobile");
		Mobile obj=new Mobile();
		obj.makeCall();
		obj.sendMsg();
	}

}
