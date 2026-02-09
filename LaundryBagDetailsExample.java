class LaundryBagDetailsExample {
  static String brand;
  static String colour;
  static String material;
  static String specialFeature;
  static String shape;
  static String includedComponents;
  static String size;
  static int itemWeight;
  static int capacity;
  static String colorDuplicate;
  public static void main(String[] args) {
    brand = "GLUN";
    colour = "Black";
    material = "Non-Woven";
    specialFeature = "Foldable, Washable";
    shape = "Round";
    includedComponents = "Bag";
    size = "Standard";
    itemWeight = 280;
    capacity = 45;
    colorDuplicate = "Black";
    System.out.println(brand);
    System.out.println(colour);
    System.out.println(material);
    System.out.println(specialFeature);
    System.out.println(shape);
    System.out.println(includedComponents);
    System.out.println(size);
    System.out.println(itemWeight + " g");
    System.out.println(capacity + " litres");
    System.out.println(colorDuplicate);
  }
}
