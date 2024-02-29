//a class called vehicle and can be accessed publicly
public class Vehicle{
    //declaration of private variables String owner, integer wheels and string registration number
    private String registNum;
    private String owner;
    private int wheels;

    //getters and setters for the private variables
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public String getregistNum() {
        return registNum;
    }
    public void setregistNum(String registNum) {
        this.registNum = registNum;
    }

    
}
//subclass Car to inherit from super class Vehicle
class Car extends Vehicle{
    //overriding the parent methods
    @Override
    public void setWheels(int wheels) {
        super.setWheels(wheels);
    }

    @Override
    public String getOwner() {
        return super.getOwner();
    }

    @Override
    public String getregistNum() {
        return super.getregistNum();
    }

    @Override
    public int getWheels() {
        return super.getWheels();
    }

}
//subclass Lorry to inherit from super class vehicle
class Lorry extends Vehicle{
    @Override
    public void setWheels(int wheels) {
        super.setWheels(wheels);
    }

    @Override
    public String getOwner() {
        return super.getOwner();
    }

    @Override
    public String getregistNum() {
        return super.getregistNum();
    }

    @Override
    public int getWheels() {
        return super.getWheels();
    }

}
//subclass Bicycle to inherit from the super class Vehicle
class Bicycle extends Vehicle{
    //constructor to make Bicycle class public
    public Bicycle() {
        super(); 
      }
      //overriding the getters and setters
      @Override
      public void setWheels(int wheels) {
        super.setWheels(wheels);
      }
    
      @Override  
      public int getWheels() {
        return super.getWheels();
      }

    
}

