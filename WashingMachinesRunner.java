class WashingMachinesRunner{
    public static void main(String [] args){
        boolean ref=WashingMachineExample.onOrOff();
        System.out.println("The Washing machine is connected "+ref);
        WashingMachineExample.increaseLevel();
		WashingMachineExample.increaseLevel();
		WashingMachineExample.increaseLevel();
        WashingMachineExample.increaseLevel();
        WashingMachineExample.decreaseLevel();
        ref=WashingMachineExample.onOrOff();
        System.out.println("The Washing machine is connected "+ref);
        WashingMachineExample.increaseLevel();
   }
}