class ElectricCookerDetailsExample {
  static String colour;
  static String material;
  static String brand;
  static String productDimensions;
  static int itemWeight;
  static double capacity;
  static String manufacturer;
  static String countryOfOrigin;
  static String itemModelNumber;
  public static void main(String[] args) {
    colour = "Blue";
    material = "Stainless Steel";
    brand = "Wipro";
    productDimensions = "23.5L x 23.5W x 26.6H Centimeters";
    itemWeight = 1000;
    capacity = 1.5;
    manufacturer = "Wipro Enterprises (P) Ltd";
    countryOfOrigin = "China";
    itemModelNumber = "EW012060";
    System.out.println(colour);
    System.out.println(material);
    System.out.println(brand);
    System.out.println(productDimensions);
    System.out.println(itemWeight + " g");
    System.out.println(capacity + " litres");
    System.out.println(manufacturer);
    System.out.println(countryOfOrigin);
    System.out.println(itemModelNumber);
  }
}
