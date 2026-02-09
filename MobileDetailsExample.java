class MobileDetailsExample {
  static String os;
  static String productDimensions;
  static int itemWeight;
  static String displayFeatures;
  static String formFactor;
  static String colour;
  static int batteryPowerRating;
  static String whatsInTheBox;
  static String manufacturer;
  static String countryOfOrigin;

  public static void main(String[] args) {

    os = "Android 15, Xiaomi HyperOS";
    productDimensions = "16.4 x 7.54 x 0.73 cm";
    itemWeight = 178; 
    displayFeatures = "Wireless";
    formFactor = "Bar";
    colour = "Black";
    batteryPowerRating = 5520; 
    whatsInTheBox = "Charger, Cable, SIM eject tool, Warranty card, User guide, Protective case";
    manufacturer = "Redmi";
    countryOfOrigin = "India";

    System.out.println(os);
    System.out.println(productDimensions);
    System.out.println(itemWeight + " g");
    System.out.println(displayFeatures);
    System.out.println(formFactor);
    System.out.println(colour);
    System.out.println(batteryPowerRating + " mAh");
    System.out.println(whatsInTheBox);
    System.out.println(manufacturer);
    System.out.println(countryOfOrigin);
  }
}
