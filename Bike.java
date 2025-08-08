package week1.day2;

public class Bike {

    public void applyBreak() {
        System.out.println("Break applied");
    }

    public void soundHorn() {
        System.out.println("Horn sounded");
    }

    public static void main(String[] args) {
        Bike Obj = new Bike();  

        Obj.applyBreak();       
        Obj.soundHorn();       

        System.out.println("Bike object created");
    }
}
	

