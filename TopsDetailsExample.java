class TopsDetailsExample {
  static String genericName;
  static String manufacturer;
  static String asin;
  static String itemModelNumber;
  static String countryOfOrigin;
  static String department;
  static int itemWeight;
  static int netQuantity;
  static String packer;
  static String itemDimensions;
  public static void main(String[] args) {
    genericName = "Tops";
    manufacturer = "Brand Studio Lifestyle Pvt Ltd";
    asin = "B0F4G8Z3LH";
    itemModelNumber = "TTTP003846";
    countryOfOrigin = "India";
    department = "Women";
    itemWeight = 220;
    netQuantity = 1;
    packer = "Brand Studio Lifestyle Pvt Ltd.";
    itemDimensions = "20 x 29 x 1 Centimeters";
    System.out.println(genericName);
    System.out.println(manufacturer);
    System.out.println(asin);
    System.out.println(itemModelNumber);
    System.out.println(countryOfOrigin);
    System.out.println(department);
    System.out.println(itemWeight + " g");
    System.out.println(netQuantity + " Count");
    System.out.println(packer);
    System.out.println(itemDimensions);
  }
}
