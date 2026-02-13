class MicrowaveOvenRunner {
    public static void main(String[] args) {
        double price = MicrowaveOven.getPrice();
        String brand = MicrowaveOven.getBrand();
        String model = MicrowaveOven.getModel();
        String capacity = MicrowaveOven.getCapacity();
        String installation = MicrowaveOven.getInstallationType();
        String partNumber = MicrowaveOven.getPartNumber();
        String material = MicrowaveOven.getMaterial();
        String manufacturer = MicrowaveOven.getManufacturer();
        String country = MicrowaveOven.getCountryOfOrigin();
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Capacity: " + capacity);
        System.out.println("Installation Type: " + installation);
        System.out.println("Part Number: " + partNumber);
        System.out.println("Material: " + material);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country Of Origin: " + country);
    }
}
