class BookshelfRunner {
    public static void main(String[] args) {
        double price = Bookshelf.getPrice();
        String material = Bookshelf.getMaterial();
        String roomType = Bookshelf.getRoomType();
        int shelves = Bookshelf.getNumberOfShelves();
        String feature = Bookshelf.getSpecialFeature();
        String dimensions = Bookshelf.getProductDimensions();
        String style = Bookshelf.getStyle();
        String brand = Bookshelf.getBrand();
        String components = Bookshelf.getIncludedComponents();
        String weight = Bookshelf.getItemWeight();
        String finish = Bookshelf.getFurnitureFinish();
        String installation = Bookshelf.getInstallationType();
        String specificUses = Bookshelf.getSpecificUses();
        String quantity = Bookshelf.getNetQuantity();
        String productName = Bookshelf.getProductName();
        String colour = Bookshelf.getColour();
        String instructions = Bookshelf.getAssemblyInstructions();
        String country = Bookshelf.getCountryOfOrigin();
        String modelNumber = Bookshelf.getItemModelNumber();
        String asin = Bookshelf.getASIN();
        System.out.println("Price: " + price);
        System.out.println("Product Name: " + productName);
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Colour: " + colour);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Shelves: " + shelves);
        System.out.println("Special Feature: " + feature);
        System.out.println("Product Dimensions: " + dimensions);
        System.out.println("Style: " + style);
        System.out.println("Included Components: " + components);
        System.out.println("Item Weight: " + weight);
        System.out.println("Furniture Finish: " + finish);
        System.out.println("Installation Type: " + installation);
        System.out.println("Specific Uses: " + specificUses);
        System.out.println("Net Quantity: " + quantity);
        System.out.println("Assembly Instructions: " + instructions);
        System.out.println("Country of Origin: " + country);
        System.out.println("Item Model Number: " + modelNumber);
        System.out.println("ASIN: " + asin);
    }
}
