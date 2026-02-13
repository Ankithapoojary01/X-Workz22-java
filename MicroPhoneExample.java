class MicroPhoneExample {
    static boolean isConnected;
    static int currentVolume;
    static int maxVolume = 10;
    static int minVolume ;
    static boolean onOrOff() {

        if (isConnected == false) {
            isConnected = true;
            System.out.println("The MicroPhone is turned on");
        } else {
            isConnected = false;
            System.out.println("The MicroPhone is turned off");
        }

        return isConnected;
    }
    public static void increaseVolume() {
        if (isConnected == true) {
            System.out.println("Increasing Volume");
            if (currentVolume < maxVolume) {
                currentVolume = currentVolume + 1;
                System.out.println("Current Volume: " + currentVolume);
            } else {
                System.out.println("It reached maximum volume");
            }

        } else {
            System.out.println("Turn MicroPhone on first");
        }
    }
    public static void decreaseVolume() {
        if (isConnected == true) {
            System.out.println("Decreasing Volume");
            if (currentVolume > minVolume) {
                currentVolume = currentVolume - 1;
                System.out.println("Current Volume: " + currentVolume);
            } else {
                System.out.println("It reached minimum volume");
            }

        } else {
            System.out.println("Turn MicroPhone on first");
        }
    }
}
