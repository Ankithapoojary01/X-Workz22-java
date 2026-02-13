class SofaSetRunner {
    public static void main(String[] args) {
        double price = SofaSet.getPrice();
        String brand = SofaSet.getBrand();
        String assembly = SofaSet.isAssemblyRequired();
        String seatDepth = SofaSet.getSeatDepth();
        String seatHeight = SofaSet.getSeatHeight();
        String weightLimit = SofaSet.getWeightLimit();
        String dimensions = SofaSet.getProductDimensions();
        String itemWeight = SofaSet.getItemWeight();
        String type = SofaSet.getType();
        String capacity = SofaSet.getCapacity();
        String comfort = SofaSet.getMattressComfort();
        String shelves = SofaSet.getNumberOfShelves();
        String model = SofaSet.getItemModelNumber();
        String manufacturer = SofaSet.getManufacturer();
        String country = SofaSet.getCountryOfOrigin();
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Assembly Required: " + assembly);
        System.out.println("Seat Depth: " + seatDepth);
        System.out.println("Seat Height: " + seatHeight);
        System.out.println("Weight Limit: " + weightLimit);
        System.out.println("Product Dimensions: " + dimensions);
        System.out.println("Item Weight: " + itemWeight);
        System.out.println("Type: " + type);
        System.out.println("Capacity: " + capacity);
        System.out.println("Mattress Comfort: " + comfort);
        System.out.println("Number Of Shelves: " + shelves);
        System.out.println("Item Model Number: " + model);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country Of Origin: " + country);
    }
}
