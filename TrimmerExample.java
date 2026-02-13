class TrimmerExample{
	static boolean isConnected;
	static int currentLevel;
	static int maxLevel=4;
	static int minLevel=0;
	static boolean onOrOff(){
	    if(isConnected==false){
	         isConnected=true;
			 System.out.println("The Trimmer is turned on");
	    }
		else{
		   isConnected=false;
		   System.out.println("The Trimmer is turned off");
		}
	return isConnected;
	}
	static void increaseLevel(){
		if(isConnected==true){
			System.out.println("Increasing Level");
			if(currentLevel<maxLevel){
				currentLevel=currentLevel+1;
				System.out.println("Current Level: "+currentLevel);
			}else{
				System.out.println("It reached maximum level");
			}
		}else{
			System.out.println("Turn Trimmer on first");
		}
	}
	static void decreaseLevel(){
		if(isConnected==true){
			System.out.println("Decreasing Level");
			if(currentLevel>minLevel){
				currentLevel=currentLevel-1;
				System.out.println("Current Level: "+currentLevel);
			}else{
				System.out.println("It reached minimum level");
			}
		}else{
			System.out.println("Turn Trimmer on first");
		}
	}
}