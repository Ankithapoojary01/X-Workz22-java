class MobileCaseRunner {
    public static void main(String[] args) {
        double price = MobileCase.getPrice();
        String brand = MobileCase.getBrand();
        String model = MobileCase.getCompatibleModel();
        String material = MobileCase.getMaterial();
        String colour = MobileCase.getColour();
        String formFactor = MobileCase.getFormFactor();
        String feature = MobileCase.getSpecialFeature();
        String pattern = MobileCase.getPattern();
        String weight = MobileCase.getWeight();
        String country = MobileCase.getCountryOfOrigin();
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Compatible Model: " + model);
        System.out.println("Material: " + material);
        System.out.println("Colour: " + colour);
        System.out.println("Form Factor: " + formFactor);
        System.out.println("Special Feature: " + feature);
        System.out.println("Pattern: " + pattern);
        System.out.println("Weight: " + weight);
        System.out.println("Country Of Origin: " + country);
    }
}
