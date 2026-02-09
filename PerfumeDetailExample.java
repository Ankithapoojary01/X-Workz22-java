class PerfumeDetailExample {
  static String manufacturer;
  static int itemWeight;
  static double netQuantity;
  static String includedComponents;
  static String genericName;
  static String itemModelNumber;
  static String productDimensions;
  static String asin;
  static String countryOfOrigin;
  public static void main(String[] args) {
    manufacturer = "Helios Packaging";
    itemWeight = 350;
    netQuantity = 100.0;
    includedComponents = "Eau De Perfume, Euphoria, 100ml";
    genericName = "Perfume";
    itemModelNumber = "8901277015785";
    productDimensions = "12.7 x 6.1 x 17.2 cm";
    asin = "B07845BYSZ";
    countryOfOrigin = "India";
    System.out.println(manufacturer);
    System.out.println(itemWeight + " g");
    System.out.println(netQuantity + " Milliliters");
    System.out.println(includedComponents);
    System.out.println(genericName);
    System.out.println(itemModelNumber);
    System.out.println(productDimensions);
    System.out.println(asin);
    System.out.println(countryOfOrigin);
  }
}
