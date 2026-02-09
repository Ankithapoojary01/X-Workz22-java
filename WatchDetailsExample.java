class WatchDetailsExample {
  static String brand;
  static String series;
  static String colour;
  static String connectivityType;
  static String wirelessCarrier;
  static String operatingSystem;
  static int batteryChargeTime;
  static String averageBatteryLife;
  static int itemWeight;
  static String countryOfOrigin;
  public static void main(String[] args) {
    brand = "Noise";
    series = "NoiseFit";
    colour = "Elite Black";
    connectivityType = "Bluetooth";
    wirelessCarrier = "Unlocked";
    operatingSystem = "Smartwatch";
    batteryChargeTime = 2;
    averageBatteryLife = "7 Days";
    itemWeight = 45;
    countryOfOrigin = "India";
    System.out.println(brand);
    System.out.println(series);
    System.out.println(colour);
    System.out.println(connectivityType);
    System.out.println(wirelessCarrier);
    System.out.println(operatingSystem);
    System.out.println(batteryChargeTime + " Hours");
    System.out.println(averageBatteryLife);
    System.out.println(itemWeight + " g");
    System.out.println(countryOfOrigin);
  }
}
