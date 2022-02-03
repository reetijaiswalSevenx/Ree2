package vehilcleDekho.com;

public class Car extends Vehicle {
    
	
    public void breakControl() {
        System.out.println("They have break controls");
    }

 
    public void horn() {
        System.out.println("They have horn");
    }


    public void tyre() {
        System.out.println("They have rubber tyres");
    }

    public void Company(String str) {
       
        System.out.println("Company: "+str);
    }


    public void Model(String model) {
        
        System.out.println("Model: "+model);
    }

    public void Colour(String colour) {
       
        System.out.println("Colour: "+colour);
    }
    public void Type(String type){
        
        System.out.println("Type: "+ type);
    }
    public void Info(String info){
      
        System.out.println("Infotainment: "+ info);
    }

}