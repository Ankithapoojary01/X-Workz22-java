class HandFanRunner {
    public static void main(String[] args) {
        double price = HandFan.getPrice();
        String brand = HandFan.getBrand();
        String material = HandFan.getMaterial();
        String colour = HandFan.getColour();
        String bladeSize = HandFan.getBladeSize();
        String power = HandFan.getPowerSource();
        String battery = HandFan.getBatteryType();
        String speed = HandFan.getSpeedSettings();
        String feature = HandFan.getSpecialFeature();
        String country = HandFan.getCountryOfOrigin();
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Colour: " + colour);
        System.out.println("Blade Size: " + bladeSize);
        System.out.println("Power Source: " + power);
        System.out.println("Battery Type: " + battery);
        System.out.println("Speed Settings: " + speed);
        System.out.println("Special Feature: " + feature);
        System.out.println("Country Of Origin: " + country);
    }
}
