class GoogleAccount {
    public static void main(String[] args) {
        createAccount("Ankitha", "Poojary", "ankitha@gmail.com", "India", "Student");
	}
    static void createAccount(String firstName, String lastName,String email,String country, String accountType) {
        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: "+lastName);
        System.out.println("Email: "+email);
        System.out.println("Country: "+country);
        System.out.println("Account Type: "+accountType);
    }
}
