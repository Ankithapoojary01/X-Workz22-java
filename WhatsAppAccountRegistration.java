class WhatsAppAccountRegistration {
    public static void main(String[] args) {
        String whatsappUserId = "WA-USER-443322";
        String registeredMobileNumber = "9123456789";
        String countryCode = "+91";
        String profileName = "MEERA S";
        String verificationMethod = "OTP";               // WhatsApp uses OTP
        String accountStatus = "ACTIVE";
        String readReceiptsStatus = "ENABLED";
        String twoStepVerificationStatus = "ENABLED";
        String endToEndEncryptionStatus = "ENABLED";
        System.out.println("WhatsApp User ID: " + whatsappUserId);
        System.out.println("Registered Mobile Number: " + registeredMobileNumber);
        System.out.println("Country Code: " + countryCode);
        System.out.println("Profile Name: " + profileName);
        System.out.println("Verification Method: " + verificationMethod);
        System.out.println("Account Status: " + accountStatus);
        System.out.println("Read Receipts Status: " + readReceiptsStatus);
        System.out.println("Two-Step Verification Status: " + twoStepVerificationStatus);
        System.out.println("End-to-End Encryption Status: " + endToEndEncryptionStatus);
    }
}
