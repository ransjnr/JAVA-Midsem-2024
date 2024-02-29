
public class VehicleTest {

    public static void main(String[] args) {
      
      Car Benz = new Car();
      Lorry Taxi = new Lorry();
      Bicycle ambike = new Bicycle();
  
      Benz.setWheels(4);
      Taxi.setWheels(6);
      ambike.setWheels(2);
  
      System.out.println("Benz has " + Benz.getWheels() + " wheels");
      System.out.println("Taxi has " + Taxi.getWheels() + " wheels");
      System.out.println("Bicycle has " + ambike.getWheels() + " wheels");
  
    }
}