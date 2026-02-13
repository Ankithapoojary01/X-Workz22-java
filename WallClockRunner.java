class WallClockRunner {
    public static void main(String[] args) {
        double price = WallClock.getPrice();
        String brand = WallClock.getBrand();
        String colour = WallClock.getColour();
        String display = WallClock.getDisplayType();
        String style = WallClock.getStyle();
        String feature = WallClock.getSpecialFeature();
        String dimensions = WallClock.getProductDimensions();
        String power = WallClock.getPowerSource();
        String material = WallClock.getMaterial();
        String theme = WallClock.getTheme();
        String frame = WallClock.getFrameMaterial();
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Colour: " + colour);
        System.out.println("Display Type: " + display);
        System.out.println("Style: " + style);
        System.out.println("Special Feature: " + feature);
        System.out.println("Product Dimensions: " + dimensions);
        System.out.println("Power Source: " + power);
        System.out.println("Material: " + material);
        System.out.println("Theme: " + theme);
        System.out.println("Frame Material: " + frame);
    }
}
