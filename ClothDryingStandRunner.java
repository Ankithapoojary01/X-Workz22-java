class ClothDryingStandRunner {
    public static void main(String[] args) {
        double price = ClothDryingStand.getPrice();
        String material = ClothDryingStand.getMaterial();
        String dimensions = ClothDryingStand.getProductDimensions();
        String brand = ClothDryingStand.getBrand();
        String colour = ClothDryingStand.getColour();
        String uses = ClothDryingStand.getRecommendedUses();
        String mounting = ClothDryingStand.getMountingType();
        String weight = ClothDryingStand.getItemWeight();
        String weightLimit = ClothDryingStand.getWeightLimit();
        String capacity = ClothDryingStand.getCapacity();
        String shape = ClothDryingStand.getItemShape();
        String manufacturer = ClothDryingStand.getManufacturer();
        String country = ClothDryingStand.getCountryOfOrigin();
        System.out.println("Price: " + price);
        System.out.println("Material: " + material);
        System.out.println("Product Dimensions: " + dimensions);
        System.out.println("Brand: " + brand);
        System.out.println("Colour: " + colour);
        System.out.println("Recommended Uses: " + uses);
        System.out.println("Mounting Type: " + mounting);
        System.out.println("Item Weight: " + weight);
        System.out.println("Weight Limit: " + weightLimit);
        System.out.println("Capacity: " + capacity);
        System.out.println("Item Shape: " + shape);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country of Origin: " + country);
    }
}
