class LedBulbRunner {
    public static void main(String[] args) {
        double price = LedBulb.getPrice();
        String brand = LedBulb.getBrand();
        String lightType = LedBulb.getLightType();
        String manufacturer = LedBulb.getManufacturer();
        String feature = LedBulb.getSpecialFeature();
        String wattage = LedBulb.getWattage();
        String shape = LedBulb.getBulbShapeSize();
        String base = LedBulb.getBulbBase();
        String equivalent = LedBulb.getIncandescentEquivalentWattage();
        String brightness = LedBulb.getWhiteBrightness();
        String efficiency = LedBulb.getEfficiency();
        String style = LedBulb.getStyle();
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Light Type: " + lightType);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Special Feature: " + feature);
        System.out.println("Wattage: " + wattage);
        System.out.println("Bulb Shape Size: " + shape);
        System.out.println("Bulb Base: " + base);
        System.out.println("Incandescent Equivalent Wattage: " + equivalent);
        System.out.println("White Brightness: " + brightness);
        System.out.println("Efficiency: " + efficiency);
        System.out.println("Style: " + style);
    }
}
