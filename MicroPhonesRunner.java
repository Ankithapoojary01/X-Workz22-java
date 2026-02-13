class MicroPhonesRunner {

    public static void main(String[] args) {

        boolean ref = MicroPhoneExample.onOrOff();
        System.out.println("The MicroPhone is connected: " + ref);

        MicroPhoneExample.increaseVolume();
        MicroPhoneExample.increaseVolume();
        MicroPhoneExample.increaseVolume();
        MicroPhoneExample.decreaseVolume();
        ref = MicroPhoneExample.onOrOff();
        System.out.println("The MicroPhone is connected: " + ref);
        MicroPhoneExample.increaseVolume(); 
    }
}
