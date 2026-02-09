class LaptopDetailsExample {
  static String series;
  static String colour;
  static String formFactor;
  static String screenResolution;
  static String processorBrand;
  static float processorSpeed;
  static String connectivityType;
  static String maxMemorySupported;
  static String hardDriveSize;
  static String hardDriveInterface;

  public static void main(String[] args) {

    series = "IdeaPad Slim 3";
    colour = "Luna Grey";
    formFactor = "Thin & Light";
    screenResolution = "1920 x 1200 pixels";
    processorBrand = "Intel";
    processorSpeed = 2.4f; 
    connectivityType = "Wi-Fi";
    maxMemorySupported = "24 GB";
    hardDriveSize = "512 GB";
    hardDriveInterface = "USB";

    System.out.println(series);
    System.out.println(colour);
    System.out.println(formFactor);
    System.out.println(screenResolution);
    System.out.println(processorBrand);
    System.out.println(processorSpeed + " GHz");
    System.out.println(connectivityType);
    System.out.println(maxMemorySupported);
    System.out.println(hardDriveSize);
    System.out.println(hardDriveInterface);
  }
}
