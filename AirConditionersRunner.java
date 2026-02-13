class AirConditionersRunner{
    public static void main(String [] args){
        boolean ref=AirConditionerExample.onOrOff();
        System.out.println("The AirConditioner is connected "+ref);
        AirConditionerExample.decreaseTemperature();
		AirConditionerExample.decreaseTemperature();
		AirConditionerExample.decreaseTemperature();
		AirConditionerExample.decreaseTemperature();
        AirConditionerExample.decreaseTemperature();
        AirConditionerExample.increaseTemperature();
        ref=AirConditionerExample.onOrOff();
        System.out.println("The AirConditioner is connected "+ref);
        AirConditionerExample.increaseTemperature();
   }
}