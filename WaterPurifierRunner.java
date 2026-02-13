class WaterPurifierRunner {
    public static void main(String[] args) {
        double price = WaterPurifier.getPrice();
        String brand = WaterPurifier.getBrand();
        String feature = WaterPurifier.getSpecialFeature();
        String dimensions = WaterPurifier.getProductDimensions();
        String packageInfo = WaterPurifier.getPackageInformation();
        String installation = WaterPurifier.getInstallationType();
        String power = WaterPurifier.getPowerSource();
        String weight = WaterPurifier.getItemWeight();
        String country = WaterPurifier.getCountryOfOrigin();
        String model = WaterPurifier.getItemModelNumber();
        String asin = WaterPurifier.getASIN();
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Special Feature: " + feature);
        System.out.println("Product Dimensions: " + dimensions);
        System.out.println("Package Information: " + packageInfo);
        System.out.println("Installation Type: " + installation);
        System.out.println("Power Source: " + power);
        System.out.println("Item Weight: " + weight);
        System.out.println("Country Of Origin: " + country);
        System.out.println("Item Model Number: " + model);
        System.out.println("ASIN: " + asin);
    }
}
