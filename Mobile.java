package week1.day2;

public class Mobile {
	
		
		public void makeCall() {
			String mobileModel = "Google Pixel 9a";
			float mobileWeight = 180;
			System.out.println("Calling from mobile model : " + mobileModel);
			System.out.println("Mobile Weight : " + mobileWeight + "g");
	}

		public void sendMsg() {
			boolean isFullCharged = true;
			int mobileCost = 50000;
			System.out.println("Is the mobile fully charged? " + isFullCharged);
			System.out.println("Mobile cost: $" + mobileCost);
		}
		
		public static void main(String[] args) {
			Mobile myMobile = new Mobile();
	        System.out.println("This is my mobile");
	        myMobile.makeCall();
	        myMobile.sendMsg();
		}
	}
