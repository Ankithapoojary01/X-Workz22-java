class JeansPantDetailsExample {
  static String genericName;
  static String manufacturer;
  static String asin;
  static String itemModelNumber;
  static String countryOfOrigin;
  static String department;
  static int itemWeight;
  static String itemDimensions;
  static int netQuantity;
  public static void main(String[] args) {
    genericName = "Jeans";
    manufacturer = "ABFRL";
    asin = "B0C1RW254Y";
    itemModelNumber = "PJDNASKF704235";
    countryOfOrigin = "India";
    department = "Men";
    itemWeight = 500;
    itemDimensions = "36 x 32 x 2.5 Centimeters";
    netQuantity = 1;
    System.out.println(genericName);
    System.out.println(manufacturer);
    System.out.println(asin);
    System.out.println(itemModelNumber);
    System.out.println(countryOfOrigin);
    System.out.println(department);
    System.out.println(itemWeight + " g");
    System.out.println(itemDimensions);
    System.out.println(netQuantity + " Count");
  }
}
