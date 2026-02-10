class FlipkartAccount {
    public static void main(String[] args) {
        createAccount("Ankitha", 8073671214L, "Female", "560001", "India");
    }
    static void createAccount(String name, long phoneNumber,String gender, String pincode, String country) {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Gender: " + gender);
        System.out.println("Pincode: " + pincode);
        System.out.println("Country: " + country);
    }
}
