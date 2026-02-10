class RedCrossBlood{
     public static void main(String[] args){
	    
	 createDonorAccount("ankithapoojary@gmail.com",10168,"Ankitha","Poojary","30-10-2004","Ankitha101",560001,"ankitha123","ankitha123");
	 
	 }
	 static void createDonorAccount(String emailId,int donorId,String firstName,String lastName,String dateOfBirth,String userName,int zipCode,String password,String confirmPassword){
        System.out.println("Email ID: " + emailId);
		System.out.println("Date of birth:"+dateOfBirth);
        System.out.println("Donor ID: " + donorId);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Username: " + userName);
        System.out.println("Zip Code: " + zipCode);
		System.out.println("Password:"+password);
		System.out.println("Confirm Password:"+confirmPassword);
		}
}