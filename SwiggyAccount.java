class SwiggyAccount {
    public static void main(String[] args) {
        createAccount("Ankitha", "Bangalore", "Veg", "Home", 8073671214L);
    }
    static void createAccount(String name, String city,String foodPreference, String addressType, long phoneNumber) {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Food Preference: " + foodPreference);
        System.out.println("Address Type: " + addressType);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
