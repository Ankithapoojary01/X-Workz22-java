class SpeakersRunner{
   public static void main(String [] args){
		boolean ref=Speakers.onOrOff();
		System.out.println("The speakers is connected "+ref);
		Speakers.increaseVolume();
		Speakers.increaseVolume();
		ref=Speakers.onOrOff();
		System.out.println("The speakers is connected "+ref);
		Speakers.increaseVolume();
		ref=Speakers.onOrOff();
		System.out.println("The speakers is connected "+ref);
		Speakers.increaseVolume();
		Speakers.increaseVolume();
		Speakers.increaseVolume();
		Speakers.increaseVolume();
		Speakers.increaseVolume();
		Speakers.increaseVolume();
		Speakers.increaseVolume();
		Speakers.decreaseVolume();
		Speakers.decreaseVolume();
		ref=Speakers.onOrOff();
		System.out.println("The speakers is connected "+ref);
		Speakers.decreaseVolume();
		ref=Speakers.onOrOff();
		System.out.println("The speakers is connected "+ref);
		Speakers.decreaseVolume();
		Speakers.decreaseVolume();
		Speakers.decreaseVolume();
		Speakers.decreaseVolume();
		Speakers.decreaseVolume();
		Speakers.decreaseVolume();
		Speakers.decreaseVolume();
		
   }
}