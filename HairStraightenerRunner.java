class HairStraightenerRunner {
    public static void main(String[] args) {
        double price = HairStraightener.getPrice();
        String brand = HairStraightener.getBrand();
        String model = HairStraightener.getModel();
        String plate = HairStraightener.getPlateMaterial();
        String temperature = HairStraightener.getTemperature();
        String heatUp = HairStraightener.getHeatUpTime();
        String cord = HairStraightener.getCordLength();
        String power = HairStraightener.getPowerSource();
        String feature = HairStraightener.getSpecialFeature();
        String colour = HairStraightener.getColour();
        String country = HairStraightener.getCountryOfOrigin();
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Plate Material: " + plate);
        System.out.println("Temperature: " + temperature);
        System.out.println("Heat Up Time: " + heatUp);
        System.out.println("Cord Length: " + cord);
        System.out.println("Power Source: " + power);
        System.out.println("Special Feature: " + feature);
        System.out.println("Colour: " + colour);
        System.out.println("Country Of Origin: " + country);
    }
}
