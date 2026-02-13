class SunscreenRunner {
    public static void main(String[] args) {
        double price = Sunscreen.getPrice();
        String brand = Sunscreen.getBrand();
        String spf = Sunscreen.getSPF();
        String skinType = Sunscreen.getSkinType();
        String formulation = Sunscreen.getFormulation();
        String volume = Sunscreen.getVolume();
        String waterResist = Sunscreen.getWaterResistance();
        String benefits = Sunscreen.getBenefits();
        String usage = Sunscreen.getUsage();
        String country = Sunscreen.getCountryOfOrigin();
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("SPF: " + spf);
        System.out.println("Skin Type: " + skinType);
        System.out.println("Formulation: " + formulation);
        System.out.println("Volume: " + volume);
        System.out.println("Water Resistance: " + waterResist);
        System.out.println("Benefits: " + benefits);
        System.out.println("Usage: " + usage);
        System.out.println("Country Of Origin: " + country);
    }
}
