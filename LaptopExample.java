class LaptopExample{
	static boolean isConnected;
	static int currentBrightness=5;
	static int maxBrightness=10;
	static int minBrightness=0;
	static boolean onOrOff(){
	    if(isConnected==false){
	         isConnected=true;
			 System.out.println("The Laptop is turned on");
	    }
		else{
		   isConnected=false;
		   System.out.println("The Laptop is turned off");
		}
	return isConnected;
	}
	static void increaseBrightness(){
		if(isConnected==true){
			System.out.println("Increasing Brightness");
			if(currentBrightness<maxBrightness){
				currentBrightness=currentBrightness+1;
				System.out.println("Current Brightness: "+currentBrightness);
			}else{
				System.out.println("It reached maximum brightness");
			}
		}else{
			System.out.println("Turn Laptop on first");
		}
	}
	static void decreaseBrightness(){
		if(isConnected==true){
			System.out.println("Decreasing Brightness");
			if(currentBrightness>minBrightness){
				currentBrightness=currentBrightness-1;
				System.out.println("Current Brightness: "+currentBrightness);
			}else{
				System.out.println("It reached minimum brightness");
			}
		}else{
			System.out.println("Turn Laptop on first");
		}
	}
}
