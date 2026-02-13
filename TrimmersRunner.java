class TrimmersRunner{
    public static void main(String [] args){
        boolean ref=TrimmerExample.onOrOff();
        System.out.println("The Trimmer is connected "+ref);
        TrimmerExample.increaseLevel();
        TrimmerExample.increaseLevel();
        TrimmerExample.decreaseLevel();
        ref=TrimmerExample.onOrOff();
        System.out.println("The Trimmer is connected "+ref);
        TrimmerExample.increaseLevel();
   }
}