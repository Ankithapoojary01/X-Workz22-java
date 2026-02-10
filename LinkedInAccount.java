class LinkedInAccount {
    public static void main(String[] args) {
        createAccount("Ankitha", "Student", "Computer Science", "India", "Fresher");
    }
    static void createAccount(String name, String role,String field, String country, String experienceLevel) {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Field: " + field);
        System.out.println("Country: " + country);
        System.out.println("Experience Level: " + experienceLevel);
    }
}
