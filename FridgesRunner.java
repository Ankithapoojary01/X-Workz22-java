class FridgesRunner{
    public static void main(String [] args){
        boolean ref=FridgeExample.onOrOff();
        System.out.println("The Fridge is connected "+ref);
        FridgeExample.decreaseTemperature();
        FridgeExample.decreaseTemperature();
        FridgeExample.increaseTemperature();
		FridgeExample.decreaseTemperature();
        ref=FridgeExample.onOrOff();
        System.out.println("The Fridge is connected "+ref);
        FridgeExample.increaseTemperature();
   }
}