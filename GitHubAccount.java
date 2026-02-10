class GitHubAccount {
    public static void main(String[] args) {
        createAccount("ankitha29", "ankitha@gmail.com", "Java", "Public", "Student");
    }
    static void createAccount(String username, String email,String primaryLanguage, String repoVisibility, String role) {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Primary Language: " + primaryLanguage);
        System.out.println("Repository Visibility: " + repoVisibility);
        System.out.println("Role: " + role);
    }
}
