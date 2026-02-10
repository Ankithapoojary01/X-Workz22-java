class AmazonAccount {
    public static void main(String[] args) {
        createAccount("Ankitha", 8073671214L, "560001", "India", "Home");
    }
    static void createAccount(String name, long phoneNumber,String pincode, String country, String addressType) {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Pincode: " + pincode);
        System.out.println("Country: " + country);
        System.out.println("Address Type: " + addressType);
    }
}
