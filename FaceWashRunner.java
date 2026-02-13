class FaceWashRunner {
    public static void main(String[] args) {
        double price = FaceWash.getPrice();
        String brand = FaceWash.getBrand();
        String type = FaceWash.getType();
        String skinType = FaceWash.getSkinType();
        String volume = FaceWash.getVolume();
        String ingredients = FaceWash.getIngredients();
        String benefits = FaceWash.getBenefits();
        String usage = FaceWash.getUsage();
        String packaging = FaceWash.getPackaging();
        String country = FaceWash.getCountryOfOrigin();
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Skin Type: " + skinType);
        System.out.println("Volume: " + volume);
        System.out.println("Ingredients: " + ingredients);
        System.out.println("Benefits: " + benefits);
        System.out.println("Usage: " + usage);
        System.out.println("Packaging: " + packaging);
        System.out.println("Country Of Origin: " + country);
    }
}
