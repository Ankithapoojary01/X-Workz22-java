class TrolleyBagRunner {
    public static void main(String[] args) {
        double price = TrolleyBag.getPrice();
        String department = TrolleyBag.getDepartment();
        String manufacturer = TrolleyBag.getManufacturer();
        String country = TrolleyBag.getCountryOfOrigin();
        String modelNumber = TrolleyBag.getItemModelNumber();
        String dimensions = TrolleyBag.getProductDimensions();
        String weight = TrolleyBag.getItemWeight();
        String itemDimensions = TrolleyBag.getItemDimensionsLxWxH();
        String quantity = TrolleyBag.getNetQuantity();
        String genericName = TrolleyBag.getGenericName();
        String asin = TrolleyBag.getASIN();
        System.out.println("Price: " + price);
        System.out.println("Department: " + department);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country of Origin: " + country);
        System.out.println("Item Model Number: " + modelNumber);
        System.out.println("Product Dimensions: " + dimensions);
        System.out.println("Item Weight: " + weight);
        System.out.println("Item Dimensions (LxWxH): " + itemDimensions);
        System.out.println("Net Quantity: " + quantity);
        System.out.println("Generic Name: " + genericName);
        System.out.println("ASIN: " + asin);
    }
}
