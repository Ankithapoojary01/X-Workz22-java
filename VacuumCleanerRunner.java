class VacuumCleanerRunner {
    public static void main(String[] args) {
        double price = VacuumCleaner.getPrice();
        String brand = VacuumCleaner.getBrand();
        String feature = VacuumCleaner.getSpecialFeature();
        String filter = VacuumCleaner.getFilterType();
        String components = VacuumCleaner.getIncludedComponents();
        String cordless = VacuumCleaner.isCordless();
        String capacity = VacuumCleaner.getCapacity();
        String wattage = VacuumCleaner.getWattage();
        String manufacturer = VacuumCleaner.getManufacturer();
        String country = VacuumCleaner.getCountryOfOrigin();
        String language = VacuumCleaner.getLanguage();
        String model = VacuumCleaner.getItemModelNumber();
        String asin = VacuumCleaner.getASIN();
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Special Feature: " + feature);
        System.out.println("Filter Type: " + filter);
        System.out.println("Included Components: " + components);
        System.out.println("Is It Cordless?: " + cordless);
        System.out.println("Capacity: " + capacity);
        System.out.println("Wattage: " + wattage);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country Of Origin: " + country);
        System.out.println("Language: " + language);
        System.out.println("Item Model Number: " + model);
        System.out.println("ASIN: " + asin);
    }
}
