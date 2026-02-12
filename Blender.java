class Blender{
	static boolean isConnected;
	static boolean onOrOff(){
	    if(isConnected == false){
	         isConnected=true;
			 System.out.println("The Blender is turned on...");
	    }
		else if(isConnected ==true){
		   isConnected=false;
		   System.out.println("The Blender is turned off...");
		   }
	return isConnected;
	}
}