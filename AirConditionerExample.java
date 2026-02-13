class AirConditionerExample{
	static boolean isConnected;
	static int currentTemperature=24;
	static int maxTemperature=30;
	static int minTemperature=16;
	static boolean onOrOff(){
	    if(isConnected==false){
	         isConnected=true;
			 System.out.println("The AirConditioner is turned on");
	    }
		else{
		   isConnected=false;
		   System.out.println("The AirConditioner is turned off");
		}
	return isConnected;
	}
	static void increaseTemperature(){
		if(isConnected==true){
			System.out.println("Increasing Temperature");
			if(currentTemperature<maxTemperature){
				currentTemperature=currentTemperature+1;
				System.out.println("Current Temperature: "+currentTemperature);
			}else{
				System.out.println("It reached maximum temperature");
			}
		}else{
			System.out.println("Turn AirConditioner on first");
		}
	}
	static void decreaseTemperature(){
		if(isConnected==true){
			System.out.println("Decreasing Temperature");
			if(currentTemperature>minTemperature){
				currentTemperature=currentTemperature-1;
				System.out.println("Current Temperature: "+currentTemperature);
			}else{
				System.out.println("It reached minimum temperature");
			}
		}else{
			System.out.println("Turn AirConditioner on first");
		}
	}
}