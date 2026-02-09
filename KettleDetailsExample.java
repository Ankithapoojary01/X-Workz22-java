class KettleDetailsExample {
  static String brand;
  static String colour;
  static String packageInformation;
  static String finishType;
  static String modelName;
  static int itemWeightGrams;
  static String countryOfOrigin;
  static String itemModelNumber;
  static double itemWeightKg;
  static int netQuantity;
  public static void main(String[] args) {
    brand = "Havells";
    colour = "Black";
    packageInformation = "Kettle";
    finishType = "Painted";
    modelName = "Aqua Plus";
    itemWeightGrams = 1100;
    countryOfOrigin = "China";
    itemModelNumber = "GHBKTATK125";
    itemWeightKg = 1.1;
    netQuantity = 1;
    System.out.println(brand);
    System.out.println(colour);
    System.out.println(packageInformation);
    System.out.println(finishType);
    System.out.println(modelName);
    System.out.println(itemWeightGrams + " grams");
    System.out.println(countryOfOrigin);
    System.out.println(itemModelNumber);
    System.out.println(itemWeightKg + " kg");
    System.out.println(netQuantity + " Count");
  }
}
