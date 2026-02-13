class BlendersRunner {
    public static void main(String[] args) {
        boolean ref = BlenderExample.onOrOff();
        System.out.println("The Blender is connected: " + ref);
        BlenderExample.increaseSpeed();
        BlenderExample.increaseSpeed();
        BlenderExample.increaseSpeed();
		BlenderExample.increaseSpeed();
		BlenderExample.increaseSpeed();
        BlenderExample.decreaseSpeed();
        ref = BlenderExample.onOrOff();
        System.out.println("The Blender is connected: " + ref);
        BlenderExample.increaseSpeed(); 
    }
}
