package vehilcleDekho.com;

public class Display {
	public static void main(String[] args) {
		
		System.out.println("***************");
        System.out.println("Common Properties:");
        Vehicle v = new Car();
        v.breakControl();
        v.horn();
        v.tyre();
        System.out.println("***************");
        System.out.println("Car Details:");
        Car c = new Car();
        c.Company("Tata");
        c.Model("Harrier");
        c.Colour("White");
        c.Type("SUV");
        System.out.println("***************");
        System.out.println("Bike details:");
        Bike b = new Bike();
        b.Company("Honda");
        b.Model("Shine");
        b.Colour("Black");



   
		
	}

}
