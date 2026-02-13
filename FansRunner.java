class FansRunner{
    public static void main(String [] args){
        boolean ref=FanExample.onOrOff();
        System.out.println("The fan is connected "+ref);
        FanExample.increaseSpeed();
        FanExample.increaseSpeed();
		FanExample.increaseSpeed();
		FanExample.increaseSpeed();
        FanExample.decreaseSpeed();
        ref=FanExample.onOrOff();
        System.out.println("The fan is connected "+ref);
        FanExample.increaseSpeed();
   }
}