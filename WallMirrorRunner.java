class WallMirrorRunner {
    public static void main(String[] args) {
        double price = WallMirror.getPrice();
        String brand = WallMirror.getBrand();
        String roomType = WallMirror.getRoomType();
        String shape = WallMirror.getShape();
        String dimensions = WallMirror.getProductDimensions();
        String frameMaterial = WallMirror.getFrameMaterial();
        String style = WallMirror.getStyle();
        String mounting = WallMirror.getMountingType();
        String primaryMaterial = WallMirror.getPrimaryMaterial();
        String capacity = WallMirror.getCapacity();
        String box = WallMirror.getBoxContents();
        String finish = WallMirror.getFrameFinish();
        String manufacturer = WallMirror.getManufacturer();
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Room Type: " + roomType);
        System.out.println("Shape: " + shape);
        System.out.println("Product Dimensions: " + dimensions);
        System.out.println("Frame Material: " + frameMaterial);
        System.out.println("Style: " + style);
        System.out.println("Mounting Type: " + mounting);
        System.out.println("Primary Material: " + primaryMaterial);
        System.out.println("Capacity: " + capacity);
        System.out.println("What is in the box?: " + box);
        System.out.println("Frame Finish: " + finish);
        System.out.println("Manufacturer: " + manufacturer);
    }
}
