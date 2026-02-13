class LipstickRunner {
    public static void main(String[] args) {
        double price = Lipstick.getPrice();
        String brand = Lipstick.getBrand();
        String shade = Lipstick.getShade();
        String finish = Lipstick.getFinishType();
        String form = Lipstick.getItemForm();
        String skinType = Lipstick.getSkinType();
        String coverage = Lipstick.getCoverage();
        String feature = Lipstick.getSpecialFeature();
        String weight = Lipstick.getWeight();
        String country = Lipstick.getCountryOfOrigin();
        System.out.println("Price: ₹" + price);
        System.out.println("Brand: " + brand);
        System.out.println("Shade: " + shade);
        System.out.println("Finish Type: " + finish);
        System.out.println("Item Form: " + form);
        System.out.println("Skin Type: " + skinType);
        System.out.println("Coverage: " + coverage);
        System.out.println("Special Feature: " + feature);
        System.out.println("Weight: " + weight);
        System.out.println("Country Of Origin: " + country);
    }
}
