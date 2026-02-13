class HairDryerRunner {
    public static void main(String[] args) {
        double price = HairDryer.getPrice();
        String brand = HairDryer.getBrand();
        String model = HairDryer.getModel();
        String wattage = HairDryer.getWattage();
        String heat = HairDryer.getHeatSettings();
        String speed = HairDryer.getSpeedSettings();
        String power = HairDryer.getPowerSource();
        String cord = HairDryer.getCordLength();
        String feature = HairDryer.getSpecialFeature();
        String colour = HairDryer.getColour();
        String country = HairDryer.getCountryOfOrigin();
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Wattage: " + wattage);
        System.out.println("Heat Settings: " + heat);
        System.out.println("Speed Settings: " + speed);
        System.out.println("Power Source: " + power);
        System.out.println("Cord Length: " + cord);
        System.out.println("Special Feature: " + feature);
        System.out.println("Colour: " + colour);
        System.out.println("Country Of Origin: " + country);
    }
}
