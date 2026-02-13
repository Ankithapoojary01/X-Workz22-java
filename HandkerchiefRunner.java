class HandkerchiefRunner {
    public static void main(String[] args) {
        double price = Handkerchief.getPrice();
        String brand = Handkerchief.getBrand();
        String material = Handkerchief.getMaterial();
        String colour = Handkerchief.getColour();
        String pattern = Handkerchief.getPattern();
        String size = Handkerchief.getSize();
        String pack = Handkerchief.getPackSize();
        String care = Handkerchief.getCareInstructions();
        String gender = Handkerchief.getGender();
        String country = Handkerchief.getCountryOfOrigin();
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Colour: " + colour);
        System.out.println("Pattern: " + pattern);
        System.out.println("Size: " + size);
        System.out.println("Pack Size: " + pack);
        System.out.println("Care Instructions: " + care);
        System.out.println("Gender: " + gender);
        System.out.println("Country Of Origin: " + country);
    }
}
