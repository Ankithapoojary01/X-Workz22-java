class EyelinerRunner {
    public static void main(String[] args) {
        double price = Eyeliner.getPrice();
        String brand = Eyeliner.getBrand();
        String shade = Eyeliner.getShade();
        String finish = Eyeliner.getFinishType();
        String form = Eyeliner.getItemForm();
        String skinType = Eyeliner.getSkinType();
        String waterproof = Eyeliner.getWaterproof();
        String feature = Eyeliner.getSpecialFeature();
        String applicator = Eyeliner.getApplicatorType();
        String country = Eyeliner.getCountryOfOrigin();
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Shade: " + shade);
        System.out.println("Finish Type: " + finish);
        System.out.println("Item Form: " + form);
        System.out.println("Skin Type: " + skinType);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Special Feature: " + feature);
        System.out.println("Applicator Type: " + applicator);
        System.out.println("Country Of Origin: " + country);
    }
}
