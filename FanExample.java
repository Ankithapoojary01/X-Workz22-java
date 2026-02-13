class FanExample{
	static boolean isConnected;
	static int currentSpeed;
	static int maxSpeed=5;
	static int minSpeed=0;
	static boolean onOrOff(){
	    if(isConnected==false){
	         isConnected=true;
			 System.out.println("The fan is turned on");
	    }
		else{
		   isConnected=false;
		   System.out.println("The fan is turned off");
		}
	return isConnected;
	}
	static void increaseSpeed(){
		if(isConnected==true){
			System.out.println("Increasing Speed");
			if(currentSpeed<maxSpeed){
				currentSpeed=currentSpeed+1;
				System.out.println("Current Speed: "+currentSpeed);
			}else{
				System.out.println("It reached maximum speed");
			}
		}else{
			System.out.println("Turn fan on first");
		}
	}
	static void decreaseSpeed(){
		if(isConnected==true){
			System.out.println("Decreasing Speed");
			if(currentSpeed>minSpeed){
				currentSpeed=currentSpeed-1;
				System.out.println("Current Speed: "+currentSpeed);
			}else{
				System.out.println("It reached minimum speed");
			}
		}else{
			System.out.println("Turn fan on first");
		}
	}
}