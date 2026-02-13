class ChargerRunner {
    public static void main(String[] args) {
        double price = Charger.getPrice();
        String brand = Charger.getBrand();
        String connector = Charger.getConnectorType();
        String wattage = Charger.getWattage();
        String devices = Charger.getCompatibleDevices();
        String power = Charger.getPowerSource();
        String feature = Charger.getSpecialFeature();
        String cable = Charger.getCableIncluded();
        String colour = Charger.getColour();
        String country = Charger.getCountryOfOrigin();
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Connector Type: " + connector);
        System.out.println("Wattage: " + wattage);
        System.out.println("Compatible Devices: " + devices);
        System.out.println("Power Source: " + power);
        System.out.println("Special Feature: " + feature);
        System.out.println("Cable Included: " + cable);
        System.out.println("Colour: " + colour);
        System.out.println("Country Of Origin: " + country);
    }
}
