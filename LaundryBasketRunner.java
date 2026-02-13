class LaundryBasketRunner {
    public static void main(String[] args) {
        double price = LaundryBasket.getPrice();
        String dimensions = LaundryBasket.getProductDimensions();
        String brand = LaundryBasket.getBrand();
        String colour = LaundryBasket.getColour();
        String material = LaundryBasket.getMaterial();
        String style = LaundryBasket.getStyle();
        String feature = LaundryBasket.getSpecialFeature();
        String shape = LaundryBasket.getShape();
        String components = LaundryBasket.getIncludedComponents();
        String size = LaundryBasket.getSize();
        String primaryMaterial = LaundryBasket.getPrimaryMaterial();
        String finish = LaundryBasket.getFinishType();
        String capacity = LaundryBasket.getCapacity();
        String country = LaundryBasket.getCountryOfOrigin();
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Product Dimensions: " + dimensions);
        System.out.println("Colour: " + colour);
        System.out.println("Material: " + material);
        System.out.println("Primary Material: " + primaryMaterial);
        System.out.println("Style: " + style);
        System.out.println("Special Feature: " + feature);
        System.out.println("Shape: " + shape);
        System.out.println("Size: " + size);
        System.out.println("Capacity: " + capacity);
        System.out.println("Finish Type: " + finish);
        System.out.println("Included Components: " + components);
        System.out.println("Country of Origin: " + country);
    }
}
