class StudyTableDetailsExample {
  static String brand;
  static String colour;
  static String style;
  static String baseMaterial;
  static String finishType;
  static String specialFeature;
  static int itemWeight;
  static String furnitureFinish;
  static String manufacturer;
  static String countryOfOrigin;

  public static void main(String[] args) {

    brand = "QARA";
    colour = "Pearl White";
    style = "Modern";
    baseMaterial = "Wood";
    finishType = "Laminated";
    specialFeature = "Adjustable";
    itemWeight = 10; 
    furnitureFinish = "Matte";
    manufacturer = "Craftcenter";
    countryOfOrigin = "India";

    System.out.println(brand);
    System.out.println(colour);
    System.out.println(style);
    System.out.println(baseMaterial);
    System.out.println(finishType);
    System.out.println(specialFeature);
    System.out.println(itemWeight + " Kilograms");
    System.out.println(furnitureFinish);
    System.out.println(manufacturer);
    System.out.println(countryOfOrigin);
  }
}
