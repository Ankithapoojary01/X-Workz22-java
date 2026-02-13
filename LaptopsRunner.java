class LaptopsRunner{
    public static void main(String [] args){
        boolean ref=LaptopExample.onOrOff();
        System.out.println("The Laptop is connected "+ref);
        LaptopExample.increaseBrightness();
		LaptopExample.increaseBrightness();
		LaptopExample.increaseBrightness();
		LaptopExample.increaseBrightness();
		LaptopExample.increaseBrightness();
        LaptopExample.increaseBrightness();
        LaptopExample.decreaseBrightness();
        ref=LaptopExample.onOrOff();
        System.out.println("The Laptop is connected "+ref);
        LaptopExample.increaseBrightness();
   }
}