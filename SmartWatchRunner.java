class SmartWatchRunner {
    public static void main(String[] args) {
        double price = SmartWatch.getPrice();
        String brand = SmartWatch.getBrand();
        String manufacturer = SmartWatch.getManufacturer();
        String series = SmartWatch.getSeries();
        String colour = SmartWatch.getColour();
        String display = SmartWatch.getDisplaySize();
        String dimensions = SmartWatch.getProductDimensions();
        String batteryLife = SmartWatch.getBatteryLife();
        String chargeTime = SmartWatch.getBatteryChargeTime();
        String connectivity = SmartWatch.getConnectivityType();
        String country = SmartWatch.getCountryOfOrigin();
        double weight = SmartWatch.getWeight();
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Series: " + series);
        System.out.println("Colour: " + colour);
        System.out.println("Display Size: " + display);
        System.out.println("Dimensions: " + dimensions);
        System.out.println("Battery Life: " + batteryLife);
        System.out.println("Charging Time: " + chargeTime);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Country of Origin: " + country);
        System.out.println("Weight: " + weight + " g");
    }
}
