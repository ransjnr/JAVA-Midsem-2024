//class called shapes
class Shapes {
    // a varible area with data type double and can be accesse privately
    private double area;
    //setters and getters
    // a public method(getter) with a double variable
    public double getArea(){
    //returning the area
      return area;
    }
    //setter setArea with a double variable parameter
    public void setArea(double area){
        //assigning a default value to the variable area
      this.area = area;
    }
  
  }
  //created abstraction class model inheriting properties from the super class Shapes
abstract class Quadrilateral extends Shapes {
    //privately accessed variable double length - the length of the shape
    private double length;
    //abstract method to access the length
    abstract double getLength();
    //abstract void method to set a value to the length variable
    abstract void setLength(double length);
  
  }
//a class Square that inherits the features of a quadrilateral and implements the interface Polygon
class Square extends Quadrilateral implements Polygon {
  
    private double length;
    //overriding the private method to declare the formula for calculating the Area
    @Override
    public double getArea() {
    //returning the Area calculation
      return getLength() * getLength(); 
    }
    //overriding the private method to set the private length
    @Override
    void setLength(double length){
      this.length = length;
    }
  
    //overriding the private method to access the private length
    @Override
    double getLength(){
      return length;
    }
  
  }
  
  //interfacing the program with the outside environment with a class called Polygon
  interface Polygon {
    
    double getArea();
  
  }
  