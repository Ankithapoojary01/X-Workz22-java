class BlenderExample {
    static boolean isConnected;
    static int currentSpeed;
    static int maxSpeed = 5;
    static int minSpeed ;
    static boolean onOrOff() {

        if (isConnected == false) {
            isConnected = true;
            System.out.println("The Blender is turned on");
        } else {
            isConnected = false;
            System.out.println("The Blender is turned off");
        }

        return isConnected;
    }
    public static void increaseSpeed() {

        if (isConnected == true) {
            System.out.println("Increasing Speed");

            if (currentSpeed < maxSpeed) {
                currentSpeed = currentSpeed + 1;
                System.out.println("Current Speed: " + currentSpeed);
            } else {
                System.out.println("It reached maximum speed");
            }

        } else {
            System.out.println("Turn Blender on first");
        }
    }
    public static void decreaseSpeed() {
        if (isConnected == true) {
            System.out.println("Decreasing Speed...");

            if (currentSpeed > minSpeed) {
                currentSpeed = currentSpeed - 1;
                System.out.println("Current Speed: " + currentSpeed);
            } else {
                System.out.println("It reached minimum speed");
            }
        } else {
            System.out.println("Turn Blender on first");
        }
    }
}
