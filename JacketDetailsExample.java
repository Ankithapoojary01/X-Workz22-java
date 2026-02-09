class JacketDetailsExample {
  static String genericName;
  static String manufacturer;
  static String asin;
  static String countryOfOrigin;
  static String department;
  static String productDimensions;
  static int itemWeight;
  static String itemDimensions;
  static int netQuantity;
  static String itemModelNumber;
  public static void main(String[] args) {
    genericName = "Jacket";
    manufacturer = "Boldfit";
    asin = "B0DK3KWS4N";
    countryOfOrigin = "India";
    department = "Men";
    productDimensions = "40 x 60 x 10 cm";
    itemWeight = 540;
    itemDimensions = "40 x 60 x 10 Centimeters";
    netQuantity = 1;
    itemModelNumber = "BFTBM4024SBlackL";
    System.out.println(genericName);
    System.out.println(manufacturer);
    System.out.println(asin);
    System.out.println(countryOfOrigin);
    System.out.println(department);
    System.out.println(productDimensions);
    System.out.println(itemWeight + " g");
    System.out.println(itemDimensions);
    System.out.println(netQuantity + " Count");
    System.out.println(itemModelNumber);
  }
}
