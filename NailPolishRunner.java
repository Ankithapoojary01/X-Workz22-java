class NailPolishRunner {
    public static void main(String[] args) {
        double price = NailPolish.getPrice();
        String brand = NailPolish.getBrand();
        String shade = NailPolish.getShade();
        String finish = NailPolish.getFinishType();
        String form = NailPolish.getItemForm();
        String volume = NailPolish.getVolume();
        String feature = NailPolish.getSpecialFeature();
        String applicator = NailPolish.getApplicatorType();
        String skinType = NailPolish.getSkinType();
        String country = NailPolish.getCountryOfOrigin();
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Shade: " + shade);
        System.out.println("Finish Type: " + finish);
        System.out.println("Item Form: " + form);
        System.out.println("Volume: " + volume);
        System.out.println("Special Feature: " + feature);
        System.out.println("Applicator Type: " + applicator);
        System.out.println("Skin Type: " + skinType);
        System.out.println("Country Of Origin: " + country);
    }
}
