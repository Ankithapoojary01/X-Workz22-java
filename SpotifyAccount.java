class SpotifyAccount {
    public static void main(String[] args) {
        createAccount("ankitha@gmail.com", "Ankitha", "Female", "30-10-2004", "English");
    }
    static void createAccount(String email, String name, String gender,String dob, String language) {
        System.out.println("Email:"+ email);
        System.out.println("Name:"+name);
        System.out.println("Gender:"+gender);
        System.out.println("DOB:"+dob);
        System.out.println("Preferred Language:"+language);
    }
}
