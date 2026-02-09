class WashingMachineDetailsExample {
  static String brand;
  static String model;
  static int capacity;
  static String colour;
  static String controlConsole;
  static int numberOfStandardCycles;
  static String accessLocation;
  static int voltage;
  static String certification;
  static String material;

  public static void main(String[] args) {

    brand = "LG";
    model = "T80VBMB4Z";
    capacity = 8; 
    colour = "Middle Black (2025-Model)";
    controlConsole = "Push Button";
    numberOfStandardCycles = 8;
    accessLocation = "Top Load";
    voltage = 230; 
    certification = "Energy Star";
    material = "Steel";

    System.out.println(brand);
    System.out.println(model);
    System.out.println(capacity + " Kilograms");
    System.out.println(colour);
    System.out.println(controlConsole);
    System.out.println(numberOfStandardCycles);
    System.out.println(accessLocation);
    System.out.println(voltage + " Volts");
    System.out.println(certification);
    System.out.println(material);
  }
}
