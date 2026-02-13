class Speakers{
	static boolean isConnected;
	        static  int currentVolume;
	    static int maxVolume=8;
		static int minVolume;
	static boolean onOrOff(){
	    if(isConnected == false){
	         isConnected=true;
			 System.out.println("The speaker is turned on...");
	    }
		else if(isConnected ==true){
		   isConnected=false;
		   System.out.println("The speaker is turned off...");
		   }
	return isConnected;
	}
	public static void increaseVolume(){
	    if(isConnected == true){
			System.out.println("Increase Volume");
		     if(currentVolume<maxVolume){
			      currentVolume=currentVolume+1;
			      System.out.println("The current volume is:"+currentVolume);
			 }else{
				  System.out.println("it reached max volume");
			 }
		}else{
		    System.out.println("Turn speaker on first");
		   
		}
	}
	public static void decreaseVolume(){
		if(isConnected==true){
			System.out.println("Decrease volume");
			if(currentVolume>minVolume){
				currentVolume=currentVolume-1;
				System.out.println("The current volume is:"+currentVolume);
			}else{
				System.out.println("it reached min volume");
			}
		}else{
			System.out.println("Turn speaker on first");
		}
	}
}