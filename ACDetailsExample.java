class ACDetailsExample {
  static String brand;
  static String model;
  static String energyEfficiency;
  static float capacity;
  static String installationType;
  static String colour;
  static int voltage;
  static String batteryCellType;
  static String manufacturer;
  static String countryOfOrigin;

  public static void main(String[] args) {

    brand = "LG";
    model = "US-Q14YNZE";
    energyEfficiency = "High Efficiency";
    capacity = 1.0f; 
    installationType = "Split System";
    colour = "White";
    voltage = 230; 
    batteryCellType = "Zinc Carbon";
    manufacturer = "LG Electronics India Pvt. Ltd.";
    countryOfOrigin = "India";

    System.out.println(brand);
    System.out.println(model);
    System.out.println(energyEfficiency);
    System.out.println(capacity + " Ton");
    System.out.println(installationType);
    System.out.println(colour);
    System.out.println(voltage + " Volts");
    System.out.println(batteryCellType);
    System.out.println(manufacturer);
    System.out.println(countryOfOrigin);
  }
}
