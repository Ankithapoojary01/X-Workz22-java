class IronBoxsRunner{
    public static void main(String [] args){
        boolean ref=IronBoxExample.onOrOff();
        System.out.println("The Iron Box is connected "+ref);
        IronBoxExample.increaseTemperature();
        IronBoxExample.increaseTemperature();
        IronBoxExample.decreaseTemperature();
        ref=IronBoxExample.onOrOff();
        System.out.println("The Iron Box is connected "+ref);
        IronBoxExample.increaseTemperature();
   }
}