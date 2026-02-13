class PillowRunner {
    public static void main(String[] args) {
        double price = Pillow.getPrice();
        String brand = Pillow.getBrand();
        String material = Pillow.getMaterial();
        String dimensions = Pillow.getDimensions();
        String colour = Pillow.getColour();
        String shape = Pillow.getShape();
        String firmness = Pillow.getFirmness();
        String cover = Pillow.getCoverMaterial();
        String hypo = Pillow.getHypoallergenic();
        String country = Pillow.getCountryOfOrigin();
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Dimensions: " + dimensions);
        System.out.println("Colour: " + colour);
        System.out.println("Shape: " + shape);
        System.out.println("Firmness: " + firmness);
        System.out.println("Cover Material: " + cover);
        System.out.println("Hypoallergenic: " + hypo);
        System.out.println("Country Of Origin: " + country);
    }
}
