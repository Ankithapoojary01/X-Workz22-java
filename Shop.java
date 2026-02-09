class Shop
{
     public static void main(String[] args)
	 {
	     String shopOwner="Ravindra Bhat";
		 String shopName="Pavithra Shop";
		 String shopLocation="576,56th Cross,12 main Rd,Bhashyum Circle,Rajajinagar Bangalore";
		 String staffMembers[]={"Ankitha","Kushi","Keerthana","Navya"};
		 System.out.println("The list of staff available:"+staffMembers.length);
		 for (String staff:staffMembers)
		 {
		     System.out.println(staff);
		 }
     }
}