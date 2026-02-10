class UberAccount {
    public static void main(String[] args) {
        createAccount("Ankitha", "Bangalore", "Female", "Cash", "Daily");
    }
    static void createAccount(String name, String city,String gender, String paymentMode, String travelFrequency) {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Gender: " + gender);
        System.out.println("Payment Mode: " + paymentMode);
        System.out.println("Travel Frequency: " + travelFrequency);
    }
}
