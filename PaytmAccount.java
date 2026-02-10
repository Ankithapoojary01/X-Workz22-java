class PaytmAccount {
    public static void main(String[] args) {
        createAccount("Ankitha", 8073671214L, "Savings", "India", "UPI");
    }
    static void createAccount(String name, long phoneNumber,String walletType, String country, String serviceUsed) {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Wallet Type: " + walletType);
        System.out.println("Country: " + country);
        System.out.println("Service Used: " + serviceUsed);
    }
}
