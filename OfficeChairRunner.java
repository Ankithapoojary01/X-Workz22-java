class OfficeChairRunner {
    public static void main(String[] args) {
        double price = OfficeChair.getPrice();
        String brand = OfficeChair.getBrand();
        String colour = OfficeChair.getColour();
        String material = OfficeChair.getMaterial();
        String dimensions = OfficeChair.getProductDimensions();
        String size = OfficeChair.getSize();
        String backStyle = OfficeChair.getBackStyle();
        String upholstery = OfficeChair.getFootboardUpholstery();
        String assembly = OfficeChair.getAssemblyType();
        String manufacturer = OfficeChair.getManufacturer();
        String country = OfficeChair.getCountryOfOrigin();
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Colour: " + colour);
        System.out.println("Material: " + material);
        System.out.println("Product Dimensions: " + dimensions);
        System.out.println("Size: " + size);
        System.out.println("Back Style: " + backStyle);
        System.out.println("Footboard Upholstery: " + upholstery);
        System.out.println("Assembly Type: " + assembly);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country Of Origin: " + country);
    }
}
