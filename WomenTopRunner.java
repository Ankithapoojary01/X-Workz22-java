class WomenTopRunner {
    public static void main(String[] args) {
        double price = WomenTop.getPrice();
        String material = WomenTop.getMaterialComposition();
        String fit = WomenTop.getFitType();
        String sleeve = WomenTop.getSleeveType();
        String collar = WomenTop.getCollarStyle();
        String style = WomenTop.getStyle();
        String cuff = WomenTop.getSleeveCuffStyle();
        String dimensions = WomenTop.getProductDimensions();
        String date = WomenTop.getDateFirstAvailable();
        String manufacturer = WomenTop.getManufacturer();
        String asin = WomenTop.getASIN();
        String model = WomenTop.getItemModelNumber();
        String country = WomenTop.getCountryOfOrigin();
        String department = WomenTop.getDepartment();
        System.out.println("Price: " + price);
        System.out.println("Material Composition: " + material);
        System.out.println("Fit Type: " + fit);
        System.out.println("Sleeve Type: " + sleeve);
        System.out.println("Collar Style: " + collar);
        System.out.println("Style: " + style);
        System.out.println("Sleeve Cuff Style: " + cuff);
        System.out.println("Product Dimensions: " + dimensions);
        System.out.println("Date First Available: " + date);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("ASIN: " + asin);
        System.out.println("Item Model Number: " + model);
        System.out.println("Country of Origin: " + country);
        System.out.println("Department: " + department);
    }
}
