class ZomatoAccount {
    public static void main(String[] args) {
        createAccount("Ankitha", "Bangalore", "North Indian", "Cash", "Female");
    }
    static void createAccount(String name, String city,String foodPreference, String paymentMode, String gender) {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Food Preference: " + foodPreference);
        System.out.println("Payment Mode: " + paymentMode);
        System.out.println("Gender: " + gender);
    }
}
