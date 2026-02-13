class WaterBottleRunner {
    public static void main(String[] args) {
        double price = WaterBottle.getPrice();
        String brand = WaterBottle.getBrand();
        String material = WaterBottle.getMaterial();
        String capacity = WaterBottle.getCapacity();
        String insulation = WaterBottle.getInsulationType();
        String colour = WaterBottle.getColour();
        String lid = WaterBottle.getLidType();
        String shape = WaterBottle.getShape();
        String weight = WaterBottle.getWeight();
        String country = WaterBottle.getCountryOfOrigin();
        String feature = WaterBottle.getSpecialFeature();
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Capacity: " + capacity);
        System.out.println("Insulation Type: " + insulation);
        System.out.println("Colour: " + colour);
        System.out.println("Lid Type: " + lid);
        System.out.println("Shape: " + shape);
        System.out.println("Weight: " + weight);
        System.out.println("Country Of Origin: " + country);
        System.out.println("Special Feature: " + feature);
    }
}
