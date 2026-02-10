class TwitterAccount {
    public static void main(String[] args) {
        createAccount("ankitha29", "Public", "India", "English", "Female");
    }
    static void createAccount(String username, String accountVisibility,String country, String language, String gender) {
        System.out.println("Username: " + username);
        System.out.println("Visibility: " + accountVisibility);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println("Gender: " + gender);
    }
}
