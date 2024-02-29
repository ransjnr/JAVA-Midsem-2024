
  //object Assets
  public class Assets {

    //main method
    public static void main(String[] args) {
      //creating an object square of the class Square()
      Square square = new Square();
      //instance of the new object
      square.setLength(25);
      //assigning the invoked method to a variable double area
      double area = square.getArea();

      //displaying the area
      System.out.println(area);
  
    }
  
  }