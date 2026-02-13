class RunningShoesRunner {
    public static void main(String[] args) {
        double price = RunningShoes.getPrice();
        String dimensions = RunningShoes.getPackageDimensions();
        String date = RunningShoes.getDateFirstAvailable();
        String manufacturer = RunningShoes.getManufacturer();
        String asin = RunningShoes.getASIN();
        String material = RunningShoes.getMaterialType();
        String closure = RunningShoes.getClosureType();
        String heel = RunningShoes.getHeelType();
        String waterResistant = RunningShoes.getWaterResistanceLevel();
        String sole = RunningShoes.getSoleMaterial();
        String style = RunningShoes.getStyle();
        String model = RunningShoes.getItemModelNumber();
        String country = RunningShoes.getCountryOfOrigin();
        String weight = RunningShoes.getItemWeight();
        String quantity = RunningShoes.getNetQuantity();
        String generic = RunningShoes.getGenericName();
        System.out.println("Price: " + price);
        System.out.println("Package Dimensions: " + dimensions);
        System.out.println("Date First Available: " + date);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("ASIN: " + asin);
        System.out.println("Material Type: " + material);
        System.out.println("Closure Type: " + closure);
        System.out.println("Heel Type: " + heel);
        System.out.println("Water Resistance Level: " + waterResistant);
        System.out.println("Sole Material: " + sole);
        System.out.println("Style: " + style);
        System.out.println("Item Model Number: " + model);
        System.out.println("Country of Origin: " + country);
        System.out.println("Item Weight: " + weight);
        System.out.println("Net Quantity: " + quantity);
        System.out.println("Generic Name: " + generic);
    }
}
