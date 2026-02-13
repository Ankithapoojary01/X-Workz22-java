class WashingMachineExample{
	static boolean isConnected;
	static int currentLevel;
	static int maxLevel=5;
	static int minLevel;
	static boolean onOrOff(){
	    if(isConnected==false){
	         isConnected=true;
			 System.out.println("The Washing machine is turned on");
	    }
		else{
		   isConnected=false;
		   System.out.println("The Washing machine is turned off");
		}
	return isConnected;
	}
	static void increaseLevel(){
		if(isConnected==true){
			System.out.println("Increasing Wash Level");
			if(currentLevel<maxLevel){
				currentLevel=currentLevel+1;
				System.out.println("Current Wash Level: "+currentLevel);
			}else{
				System.out.println("It reached maximum wash level");
			}
		}else{
			System.out.println("Turn Washing machine on first");
		}
	}
	static void decreaseLevel(){
		if(isConnected==true){
			System.out.println("Decreasing Wash Level");
			if(currentLevel>minLevel){
				currentLevel=currentLevel-1;
				System.out.println("Current Wash Level: "+currentLevel);
			}else{
				System.out.println("It reached minimum wash level");
			}
		}else{
			System.out.println("Turn Washing machine on first");
		}
	}
}
