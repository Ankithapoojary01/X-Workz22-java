class SecurityCameraDetailsExample {
  static String formFactor;
  static int viewingAngle;
  static int nightVisionRange;
  static String frameRate;
  static String material;
  static int voltage;
  static String zoomType;
  static String alertType;
  static String manufacturer;
  static String countryOfOrigin;
  public static void main(String[] args) {
    formFactor = "Dome";
    viewingAngle = 107;
    nightVisionRange = 15;
    frameRate = "20 frames per second";
    material = "Plastic";
    voltage = 5;
    zoomType = "Digital Zoom";
    alertType = "Audio and Motion";
    manufacturer = "Aditya Infotech Ltd.";
    countryOfOrigin = "India";
    System.out.println(formFactor);
    System.out.println(viewingAngle + " Degrees");
    System.out.println(nightVisionRange + " Metres");
    System.out.println(frameRate);
    System.out.println(material);
    System.out.println(voltage + " Volts");
    System.out.println(zoomType);
    System.out.println(alertType);
    System.out.println(manufacturer);
    System.out.println(countryOfOrigin);
  }
}
