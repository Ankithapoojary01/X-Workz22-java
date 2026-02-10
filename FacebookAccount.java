class FacebookAccount {
    public static void main(String[] args) {
        createAccount("Ankitha", "Poojary", "Female", "30-10-2004", "India");
    }
    static void createAccount(String firstName, String lastName,String gender, String dob, String country) {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("DOB: " + dob);
        System.out.println("Country: " + country);
    }
}
