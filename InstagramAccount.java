class InstagramAccount {
    public static void main(String[] args) {
        createAccount("ankitha@gmail.com", "ankitha_29", "Public", "Female", "India");
    }
    static void createAccount(String email, String username,String profileType, String gender, String country) {
        System.out.println("Email: " + email);
        System.out.println("Username: " + username);
        System.out.println("Profile Type: " + profileType);
        System.out.println("Gender: " + gender);
        System.out.println("Country: " + country);
    }
}
