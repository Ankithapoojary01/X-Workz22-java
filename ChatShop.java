class ChatShop{
	public static void main(String[] chats){
		String chatItems[]={"bhel puri","sev puri","aloo chaat","ragda chaat","chole chaat","samosa chaat","kachori chaat","papdi chaat","corn chaat","gobi manchurian","veg roll","paneer roll","mushroom roll","veg noodles","fried rice"};
	    String bhelPuri=chatItems[0];
		String sevPuri=chatItems[1];
		String alooChaat=chatItems[2];
		String ragdaChaat=chatItems[3];
		String choleChat=chatItems[4];
		String samosaChat=chatItems[5];
		String kachoriChat=chatItems[6];
		String papdiChat=chatItems[7];
		String cornChat=chatItems[8];
		String gobiManchurian=chatItems[9];
		String vegRoll=chatItems[10];
		String paneerRoll=chatItems[11];
		String mushroomRoll=chatItems[12];
		String vegNoodles=chatItems[13];
		String friedRice=chatItems[14];
		System.out.println("The list of chats availabe is :"+chatItems.length);
		for(String chat :chatItems){
			System.out.println(chat);
		}
	}
}
