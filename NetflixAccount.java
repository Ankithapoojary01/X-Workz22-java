class NetflixAccount {
    public static void main(String[] args) {
        createAccount("ankitha@gmail.com", "Premium", "Monthly", "India", "English");
    }
    static void createAccount(String email, String plan,String billingCycle, String country, String language) {
        System.out.println("Email: " + email);
        System.out.println("Plan: " + plan);
        System.out.println("Billing Cycle: " + billingCycle);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
    }
}
