class EardopesExample {
  static String modelName;
  static String connectivityTechnology;
  static String material;
  static String chargingTime;
  static String compatibleDevices;
  static String cableFeature;
  static int itemWeight;
  static String style;
  static String controlMethod;
  static int batteryLife;
  public static void main(String[] args) {
    modelName = "Airdopes 300";
    connectivityTechnology = "Bluetooth";
    material = "Plastic";
    chargingTime = "10 Minutes";
    compatibleDevices = "Cellphones";
    cableFeature = "Without Cable";
    itemWeight = 140; 
    style = "Gaming-oriented";
    controlMethod = "App";
    batteryLife = 50; 

    System.out.println(modelName);
    System.out.println(connectivityTechnology);
    System.out.println(material);
    System.out.println(chargingTime);
    System.out.println(compatibleDevices);
    System.out.println(cableFeature);
    System.out.println(itemWeight + " grams");
    System.out.println(style);
    System.out.println(controlMethod);
    System.out.println(batteryLife + " hours");
  }
}