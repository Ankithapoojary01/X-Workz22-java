class ElectricHeaterRunner {
    public static void main(String[] args) {
        double price = ElectricHeater.getPrice();
        String brand = ElectricHeater.getBrand();
        String model = ElectricHeater.getModel();
        String wattage = ElectricHeater.getWattage();
        String heatSettings = ElectricHeater.getHeatSettings();
        String power = ElectricHeater.getPowerSource();
        String mounting = ElectricHeater.getMountingType();
        String material = ElectricHeater.getMaterial();
        String feature = ElectricHeater.getSpecialFeature();
        String weight = ElectricHeater.getItemWeight();
        String country = ElectricHeater.getCountryOfOrigin();
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Wattage: " + wattage);
        System.out.println("Heat Settings: " + heatSettings);
        System.out.println("Power Source: " + power);
        System.out.println("Mounting Type: " + mounting);
        System.out.println("Material: " + material);
        System.out.println("Special Feature: " + feature);
        System.out.println("Item Weight: " + weight);
        System.out.println("Country Of Origin: " + country);
    }
}
