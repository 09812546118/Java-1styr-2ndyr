import java.util.Random;
public class CarCar {
   public static void main(String...args) {
      Car morreCar = new Car("Red", "123123123", "Samsung");
      Car leyrosCar = new Car();
      Car abellanaCar = new Car();
      Car bossTulodCar = new Car();
      
      /*morreCar.brand = "Toktok";
      morreCar.color = "Skypink";
      morreCar.model = "Brazilian";
      morreCar.seat = 15;
      morreCar.numberWheels = 4;
      morreCar.isAircon = true;
      morreCar.isAutomatic = true;
      morreCar.plateNumber = "69";
      morreCar.fuelType = "Primera Light";*/
      
      //leyrosCar.brand = "Toktok";
      //leyrosCar.color = "Skypink";
      //leyrosCar.model = "Brazilian";
      //leyrosCar.seat = 15;
      //leyrosCar.numberWheels = 4;
      //leyrosCar.isAircon = true;
      //leyrosCar.isAutomatic = true;
      //leyrosCar.plateNumber = "69";
      //leyrosCar.fuelType = "Primera Light";
      //leyrosCar.repaint();
      
      /*bossTulodCar.brand = "Taktak";
      bossTulodCar.color = "Rainbow";
      bossTulodCar.model = "Atcham";
      bossTulodCar.seat = 1;
      bossTulodCar.numberWheels = 3;
      bossTulodCar.isAircon = false;
      bossTulodCar.isAutomatic = true;
      bossTulodCar.plateNumber = "Bhosx143";
      bossTulodCar.fuelType = "Kulafu";*/
      
      //morreCar.displayCount();
      System.out.println();
      //bossTulodCar.displayCount();
      System.out.println();
      //leyrosCar.display();
      System.out.println();
      //abellanaCar.display();
      System.out.println(Car.initializationCount);
   }
}

class Car {
   public Car() {
      this.initializationCount++;
   }
   
   public Car(String model) {
      this.model = model;
      this.initializationCount++;
   }
   
   public Car(String color, String plateNumber, String brand) {
      this.color = color;
      this.plateNumber = plateNumber;
      this.brand = brand;
      this.initializationCount++;
   }
   
   private final Random rand = new Random();
   
   public String color;
   public String plateNumber;
   public String brand;
   public int seat;
   public String fuelType;
   public int numberWheels;
   public String model;
   public boolean isAircon;
   public boolean isAutomatic;
   public static int initializationCount;
   
   public void run() {
      System.out.println("Broom broom");
      System.out.println(isAutomatic);
   }
   public void honk() {
      System.out.println("Beep beep");
   }
   public void brake() {
      System.out.println("EEEeeeeeek");
   }
   public void drift() {
      System.out.println("Skkrt");
   }
   public void changeGear() {
      System.out.println("Gear changed");
   }
   public void turnLeft() {
      System.out.println("Turned left");
   }
   public void turnRight() {
      System.out.println("Turned right");
   }
   public void start() {
      System.out.println("brrrrr");
   }
   public void stop() {
      System.out.println("TAHP! TAHP!");
   }
   public void repaint() {
      String[] colors = {"Red", "Skywhite", "Black", "Silver", "Dirty White", "Atcham"};
      color = colors[rand.nextInt(colors.length - 1)];
   }
   
   public void display() {
      String displayL = "Color: " + color;
      displayL += "\nBrand: " + brand;
      displayL += "\nModel: " + model;
      displayL += "\nPlate Number: " + plateNumber;
      displayL += "\nNumber of Seats: " + seat;
      displayL += "\nFuel Type: " + fuelType;
      displayL += "\nAircon: " + isAircon;
      displayL += "\nAutomatic: " + isAutomatic;
      displayL += "\nNumber of Wheels: " + numberWheels;
      
      System.out.println(displayL);
      System.out.println(rand.nextInt(10));
   }
   
   public static void displayCount() {
      System.out.println(initializationCount);
   }
}