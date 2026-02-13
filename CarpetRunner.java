class CarpetRunner {
    public static void main(String[] args) {
        double price = Carpet.getPrice();
        String brand = Carpet.getBrand();
        String size = Carpet.getSize();
        String material = Carpet.getMaterial();
        String weave = Carpet.getWeaveType();
        String weight = Carpet.getItemWeight();
        String pileHeight = Carpet.getPileHeight();
        String construction = Carpet.getConstructionType();
        String backMaterial = Carpet.getBackMaterialType();
        String colour = Carpet.getColour();
        String usage = Carpet.getIndoorOutdoorUsage();
        String theme = Carpet.getTheme();
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
        System.out.println("Weave Type: " + weave);
        System.out.println("Item Weight: " + weight);
        System.out.println("Pile Height: " + pileHeight);
        System.out.println("Construction Type: " + construction);
        System.out.println("Back Material Type: " + backMaterial);
        System.out.println("Colour: " + colour);
        System.out.println("Indoor/Outdoor Usage: " + usage);
        System.out.println("Theme: " + theme);
    }
}
